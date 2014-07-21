package ru.developer.springpage.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import ru.developer.springpage.domain.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addUser(User user)
	{
		sessionFactory.getCurrentSession().save(user);
	}

}
