package com.blz.bird_sanctuary;

public class Bird {
	enum Colour {
		WHITE, BLACK, YELLOW, GREEN, GRAY, BLUE, RED, VIOLET
	};

	protected String id;
	protected String birdName;
	protected Colour colour;
	protected Boolean isflyable;
	protected Boolean isSwimmable;
	

	public void eat() {
		System.out.println(birdName + " is Eating");
	}

	public void fly() {
		System.out.println(birdName + " is Flying");
	}

	public void swim() {
		System.out.println(birdName + " is Swimming");
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", colour=" + colour + ", isflyable=" + isflyable + ", isSwimmable=" + isSwimmable
				+ ", name=" + birdName + "]";
	}
}
