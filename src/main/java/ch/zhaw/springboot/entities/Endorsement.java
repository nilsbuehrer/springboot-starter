package ch.zhaw.springboot.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Endorsement {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String level;
	private Date date;

	@ManyToOne
	private Endorser endorser;
	@ManyToOne
	private Endorsee endorsee;

	public Endorsement(String level, Date date,
					   Endorser endorser, Endorsee endorsee) {
		this.level = level;
		this.date = date;
		this.endorser = endorser;
		this.endorsee = endorsee;
	}

	public Endorsement() {
	}

	public String getLevel() {
		return this.level;
	}

	public Date getDate() {
		return this.date;
	}

	public Endorser getEndorser() {
		return this.endorser;
	}

	public Endorsee getEndorsee() {
		return this.endorsee;
	}
}
