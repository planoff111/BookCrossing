package com.example.demo.controllers;

import com.example.demo.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdminPageController {
    private final AdminService adminService;

    @Autowired
    public AdminPageController(AdminService adminService) {
        this.adminService = adminService;
    }
}
