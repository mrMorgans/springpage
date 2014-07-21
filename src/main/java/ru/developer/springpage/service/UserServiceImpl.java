package ru.developer.springpage.service;

import java.util.List;

import ru.developer.springpage.domain.User;
import ru.developer.springpage.dao.UserDAO;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
    private UserDAO userDAO;
	
	@Transactional
    public void addUser(User user) {
        userDAO.addUser(user);
    }
	

}
