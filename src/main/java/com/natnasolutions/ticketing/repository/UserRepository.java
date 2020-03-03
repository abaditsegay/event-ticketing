package com.natnasolutions.ticketing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.natnasolutions.ticketing.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	public long createUser(User user);

	public User updateUser(User user);

	public List<User> getAllUsers();

	public User findByUsername(String username);

	List<User> getAllUsers(String username);

	public List<User> findByFirstName(String name);
}
