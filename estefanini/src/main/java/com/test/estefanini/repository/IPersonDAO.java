package com.test.estefanini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.estefanini.entity.Person;

public interface IPersonDAO extends JpaRepository<Person, Integer> {
	
	public List<Person> findAllByOrderByIdDesc();

}
