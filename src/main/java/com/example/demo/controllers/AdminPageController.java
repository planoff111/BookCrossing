package com.example.demo.controllers;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Book;
import com.example.demo.entity.User;
import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AdminPageController {
    private final AdminService adminService;

    @Autowired
    public AdminPageController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/adminpage")
    public String adminPage() {
            return "adminpage";

    }


}
