package com.project_sew.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.project_sew.project.jdbc.DAO.MyUserDAO_inter;

@Controller
public class MyController {
    
    @Autowired
    MyUserDAO_inter user;
    
    
    
}
