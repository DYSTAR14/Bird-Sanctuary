package com.blz.bird_sanctuary;

import java.util.Objects;

public class Bird {
	enum Colour {
		WHITE, BLACK, YELLOW, GREEN, GRAY, BLUE, RED, VIOLET, BROWN
	};

	protected String id;
	protected String birdName;
	protected Colour colour;
	protected Boolean isflyable;
	protected Boolean isSwimmable;
	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(id, other.id);
	}

	public void eat() {
		System.out.println("Bird "+birdName + " is Eating");
	}

	public void fly() {
		System.out.println("Bird "+birdName + " is Flying");
	}

	public void swim() {
		System.out.println("Bird "+birdName + " is Swimming");
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", name=" + birdName+", colour=" + colour + ", "
				+ "isflyable=" + isflyable + ", isSwimmable=" + isSwimmable+"]";
	}

}
