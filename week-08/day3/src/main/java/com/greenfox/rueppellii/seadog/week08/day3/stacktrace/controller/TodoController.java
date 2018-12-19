package com.greenfox.rueppellii.seadog.week08.day3.stacktrace.controller;

import com.greenfox.rueppellii.seadog.week08.day3.stacktrace.Todo;
import com.greenfox.rueppellii.seadog.week08.day3.stacktrace.TodoRepository;
import com.greenfox.rueppellii.seadog.week08.day3.stacktrace.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService service;

    @Autowired
    public TodoController(TodoService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String list(Model model, @RequestParam(required=false) String todoitem, @ModelAttribute(name="todoObject") Todo todo) {
        //    model.addAttribute("todoObject", todo);
        model.addAttribute("todo", service.list());
        return "todo";
    }

    @PostMapping("/")
    public String addTodo(@ModelAttribute(name="todoObject") Todo todo) {
        service.saveTodo(todo);
        return "redirect:/todo/";
    }

    @RequestMapping(value ={"/{todoId}/delete", "/search/{todoId}/delete"}, method = RequestMethod.POST)
    public String deleteTask(@PathVariable("todoId") Long id) {
        service.deleteTodo(id);
        return "redirect:/todo/";
    }

    @RequestMapping(value ={"/{todoId}/edit", "/search/{todoId}/edit"}, method = RequestMethod.GET)
    public String editTask(@PathVariable("todoId") Long id, Model model) {
        Optional<Todo> todo = service.findTodoById(id);
        model.addAttribute("todoEdit", todo.get());
        return "edit";
    }

    @RequestMapping(value ={"/{todoId}/edit", "/search/{todoId}/edit"}, method = RequestMethod.POST)
    public String editTask(@PathVariable("todoId") Long id, @ModelAttribute(name="todoEdit") Todo todo) {
        service.saveTodo(todo);
        return "redirect:/todo/";
    }

//    @RequestMapping(value="/", method = RequestMethod.GET)
//    public String byKeyword(@RequestParam("search") String keyword, Model model, @ModelAttribute(name="todo") List<Todo> listKeyword) {
//        model.addAttribute("todo", service.findByKeyword(keyword));
//        return "todo";
//    }

    @RequestMapping(value="/search", method = RequestMethod.POST)
    public String byKeyword(@RequestParam("keyword") String keyword, Model model, @ModelAttribute(name="todoObject") Todo todo) {
        model.addAttribute("todo", service.findByKeyword(keyword));
        return "todo";
    }
}