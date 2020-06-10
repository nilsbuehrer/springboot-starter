package ch.zhaw.springboot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endorser {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private boolean verified;

	public Endorser(boolean verified) {
		this.verified = verified;
	}

	public Endorser() {
	}

	public boolean isVerified() {
		return verified;
	}
}
