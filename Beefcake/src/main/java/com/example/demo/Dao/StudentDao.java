package com.example.demo.Dao;

import com.example.demo.Entity.TeamStudentEntity;
import org.springframework.data.repository.query.Param;

public interface StudentDao {

    public TeamStudentEntity findTeamId(@Param("studentId") String studentId);
}
