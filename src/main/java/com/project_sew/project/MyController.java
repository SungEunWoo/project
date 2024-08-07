package com.project_sew.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.project_sew.project.jdbc.DAO.MyUserDAO_inter;

@Controller
public class MyController {
    
    @Autowired
    MyUserDAO_inter user;
    
    
    
}
