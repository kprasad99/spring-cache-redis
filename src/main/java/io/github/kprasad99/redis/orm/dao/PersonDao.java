package io.github.kprasad99.redis.orm.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.github.kprasad99.redis.orm.model.Person;

@Repository
@Transactional
public interface PersonDao extends JpaRepository<Person, Integer> {

}
