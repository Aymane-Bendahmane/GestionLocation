package com.example.dao;

import com.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserIMP extends JpaRepository<User,Long> {
	@Query("select p from User p where p.login= :x and p.password = :y")
	public User checkuser(@Param("x")String login,@Param("y")String password) ;
	
	@Query("select p from User p where p.login= :x ")
	public User findUserByLogin(@Param("x")String login);
	
	@Query("select p from User p where id_user= 1 ")
	public User getuser();
	
	
	@Query("select p from User p where id_user= 1 ")
	public User findById_user();
}

