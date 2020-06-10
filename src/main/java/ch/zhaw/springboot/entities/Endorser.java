package ch.zhaw.springboot.entities;

import javax.persistence.Entity;

@Entity
public class Endorser extends User {

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
