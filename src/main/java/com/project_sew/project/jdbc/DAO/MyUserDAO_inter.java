package com.project_sew.project.jdbc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.project_sew.project.jdbc.DTO.MyUserDTO;

@Repository
public interface MyUserDAO_inter {
    public List<MyUserDTO> listDAO();
    public MyUserDTO viewDAO(String id);
    public int writeDAO(String writer, String title, String content);
    public int deleteDAO(String id);
}
