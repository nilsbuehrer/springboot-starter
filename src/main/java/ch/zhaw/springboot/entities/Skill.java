package ch.zhaw.springboot.entities;

import javax.persistence.*;

@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String area;

	@ManyToMany
	private Endorsement endorsement;

	public Skill(String area) {
		this.area = area;
	}

	public Skill() {
	}

	public String getArea() {
		return this.area;
	}

}
