package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;
	private String jobtitle;


	public User(String name, String jobtitle) {
		this.name = name;
		this.jobtitle = jobtitle;
	}

	public User() {
	}

	public String getName() {
		return this.name;
	}

	public String getJobtitle() {
		return this.jobtitle;
	}

}
