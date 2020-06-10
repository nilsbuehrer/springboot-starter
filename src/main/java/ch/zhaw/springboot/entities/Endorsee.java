package ch.zhaw.springboot.entities;

import javax.persistence.*;

@Entity
public class Endorsee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String industry;


	public Endorsee(String industry) {
		this.industry = industry;
	}

	public Endorsee() {
	}

	public String getIndustry() {
		return this.industry;
	}

}
