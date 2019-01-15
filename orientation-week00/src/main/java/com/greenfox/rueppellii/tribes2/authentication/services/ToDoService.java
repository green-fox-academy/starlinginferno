package com.greenfox.rueppellii.tribes2.authentication.services;

import com.greenfox.rueppellii.tribes2.authentication.models.ToDo;
import com.greenfox.rueppellii.tribes2.authentication.models.User;
import com.greenfox.rueppellii.tribes2.authentication.repositories.ToDoRepository;
import com.greenfox.rueppellii.tribes2.authentication.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    private ToDoRepository toDoRepository;
    private UserRepository userRepository;

    @Autowired
    public ToDoService(ToDoRepository toDoRepository, UserRepository userRepository) {
        this.toDoRepository = toDoRepository;
        this.userRepository = userRepository;
    }

    public void addToDo(Long userId, ToDo toDo) {
        User user = userRepository.findById(userId).get();
//        List<ToDo> list = user.getToDos();
//        list.add(toDo);
//        user.setToDos(list);
        user.getToDos().add(toDo);
        toDo.setUser(user);
        toDoRepository.save(toDo);
        userRepository.save(user);
    }

    public List<ToDo> listToDos(Long userId) {
        return toDoRepository.findAllByUser_Id(userId);
    }

    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
