package io.github.kprasad99.redis.orm.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int Id;
	private String firstName;
	private String lastName;
	private int age;
}
