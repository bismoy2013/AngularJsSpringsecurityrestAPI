package net.cmdigitals.dao.user;

import net.cmdigitals.dao.Dao;
import net.cmdigitals.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}