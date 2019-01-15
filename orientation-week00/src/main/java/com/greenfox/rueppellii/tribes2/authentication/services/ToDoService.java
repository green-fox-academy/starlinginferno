package com.greenfox.rueppellii.tribes2.authentication.services;

import com.greenfox.rueppellii.tribes2.authentication.models.ApplicationUser;
import com.greenfox.rueppellii.tribes2.authentication.models.ToDo;
import com.greenfox.rueppellii.tribes2.authentication.repositories.ToDoRepository;
import com.greenfox.rueppellii.tribes2.authentication.repositories.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;
    private ApplicationUserRepository applicationUserRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository, ApplicationUserRepository applicationUserRepository) {
        this.toDoRepository = toDoRepository;
        this.applicationUserRepository = applicationUserRepository;
    }

    public void addToDo(Long userId, ToDo toDo) {
        ApplicationUser applicationUser = applicationUserRepository.findById(userId).get();
        applicationUser.getToDos().add(toDo);
        toDo.setApplicationUser(applicationUser);
        toDoRepository.save(toDo);
        applicationUserRepository.save(applicationUser);
    }

    public List<ToDo> listToDos(Long userId) {
        return toDoRepository.findAllByApplicationUser_Id(userId);
    }

    public Iterable<ApplicationUser> listUsers() {
        return applicationUserRepository.findAll();
    }

    public void saveUser(ApplicationUser applicationUser) {
        if (applicationUser != applicationUserRepository.findByUsername(applicationUser.getUsername())) {
            applicationUserRepository.save(applicationUser);
        }
    }
}
