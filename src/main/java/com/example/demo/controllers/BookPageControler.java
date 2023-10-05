package com.example.demo.controllers;

import com.example.demo.entity.Book;
import com.example.demo.services.AdminService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookPageControler {
    private final AdminService adminService;

    @Autowired
    public BookPageControler(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/books")
    public String getAllBooks(Model model) {
        List<Book> listOfBooks = adminService.getALLbooks();
        model.addAttribute("book", listOfBooks);
        return "books";
    }


    @GetMapping("/books/{id}")
    public ResponseEntity getBookByID(@PathVariable Long id) {
        if (!adminService.getBookByID(id).isEmpty()) {
            return ResponseEntity.ok(adminService.getBookByID(id));
        } else {
            return  ResponseEntity.notFound().build();
        }
    }
    @DeleteMapping("/books/{id}")
    public void deleteBookByID(@PathVariable Long id){
        adminService.deleteBookByID(id) ;
    }

    @PutMapping("/books")
    public Book update(@RequestBody Book book){
        adminService.saveOrUpdateBook(book);
        return book;
    }
}
