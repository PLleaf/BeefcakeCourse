package com.example.demo.Service;

import com.example.demo.Dao.UserDao;
import com.sample.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String getRole(String account,String password)
    {
        try
        {
            int role = userDao.getRole(account, password);
            int status = userDao.getStatus(account, password);
            String Role=new String();
            String Status=new String();

            switch (role)
            {
                case 0:Role="教师";break;
                case 1:Role="学生";break;
            }

            switch (status)
            {
                case 0:Status="未激活";break;
                case 1:Status="激活";break;
            }

            return Role+Status;
        }
        catch (Exception e)
        {
            return"账号或密码错误";
        }
    }

}
