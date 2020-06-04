package io.github.kprasad99.redis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.kprasad99.redis.orm.model.Person;
import io.github.kprasad99.redis.orm.service.PersonDaoService;

@RestController
@RequestMapping("/api/person")
public class PersonService {

		@Autowired
		private PersonDaoService personDaoService;
		
		@GetMapping
		public List<Person> list(){
			return personDaoService.list();
		}
		
		@PostMapping
		@CacheEvict(cacheNames = "person", allEntries = true)
		public Person add(@RequestBody Person person){
			return personDaoService.add(person);
		}
		
		@PutMapping("/{id}")
		@CacheEvict(cacheNames = "person", allEntries = true)
		public Person add(@PathVariable("id")int id, @RequestBody Person person){
			return personDaoService.add(person);
		}
		
		@GetMapping("/{id}")
		@Cacheable(cacheNames = "person", key = "#id")
		public Optional<Person> findById(@PathVariable("id") int id){
			return personDaoService.findById(id);
		}
}
