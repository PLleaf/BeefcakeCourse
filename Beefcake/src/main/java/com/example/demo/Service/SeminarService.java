package com.example.demo.Service;

import com.example.demo.Dao.TeamSeminarDao;
import com.example.demo.Entity.TeamSeminarEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SeminarService {

    @Autowired
    private TeamSeminarDao teamSeminarDao;

    public List<TeamSeminarEntity> findAllTeam(Long seminarId)
    {
        return teamSeminarDao.findAll(seminarId);
    }

}
