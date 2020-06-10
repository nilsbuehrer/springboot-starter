package ch.zhaw.springboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String description;

	@ManyToMany
	@JsonIgnore
	private List<Endorsement> endorsements = new ArrayList<Endorsement>();

	public Skill(String description) {
		this.description = description;
	}

	public Skill() {
	}


	public List<Endorsement> getEndorsements() {
		return endorsements;
	}

	public String getDescription() {
		return description;
	}
}
