package com.project_sew.project.jdbc.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.project_sew.project.jdbc.DTO.MyUserDTO;

import java.util.List;

@Repository
public class MyUserDAO implements MyUserDAO_inter{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<MyUserDTO> listDAO() {
        System.out.println("listDAO");
        String query = "select * from st_db order by id desc";
        List<MyUserDTO> list = template.query(query, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));

        return list;
    }

    @Override
    public MyUserDTO viewDAO(String id) {
        System.out.println("viewDAO");
        String query = "select * from st_db where id =" + id;
        MyUserDTO mud = template.queryForObject(query, new BeanPropertyRowMapper<MyUserDTO>(MyUserDTO.class));  
        
        return mud;  
    }

    @Override
    public int writeDAO(String writer, String title, String content) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'writeDAO'");
    }

    @Override
    public int deleteDAO(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDAO'");
    }
    
}
