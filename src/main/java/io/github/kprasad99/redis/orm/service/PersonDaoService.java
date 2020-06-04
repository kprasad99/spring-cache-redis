package io.github.kprasad99.redis.orm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kprasad99.redis.orm.dao.PersonDao;
import io.github.kprasad99.redis.orm.model.Person;

@Service
public class PersonDaoService {

	@Autowired
	private PersonDao personDao;
	
	public Person add(Person person) {
		return personDao.saveAndFlush(person);
	}
	
	public Person update(Person person) {
		return personDao.saveAndFlush(person);
	}
	
	public List<Person> list(){
		return personDao.findAll();
	}
	
	public Optional<Person> findById(int id){
		return personDao.findById(id);
	}
}
