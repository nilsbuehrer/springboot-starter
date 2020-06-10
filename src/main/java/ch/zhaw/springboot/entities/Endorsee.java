package ch.zhaw.springboot.entities;

import javax.persistence.*;

@Entity
public class Endorsee extends User {

	private int score;

	public Endorsee(int score) {
		this.score = score;
	}

	public Endorsee() {
	}

	public int getScore() {
		return score;
	}
}
