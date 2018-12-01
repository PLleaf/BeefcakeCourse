package com.example.demo.Controller;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Entity.TeamStudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    private StudentDao studentDao;

    @RequestMapping(value = "/Student/Ask",method = RequestMethod.POST)
    public TeamStudentEntity ask(@RequestParam("studentId")String studentId)
    {
        return studentDao.findTeamId(studentId);
    }

}
