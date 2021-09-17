package com.blz.bird_sanctuary;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import com.blz.bird_sanctuary.Bird.Colour;

public class BirdSanctuaryManager {
	static final Scanner SC = new Scanner(System.in);
	Set<Bird> birdList = new HashSet<Bird>();
	static private BirdSanctuaryManager instance;

	private BirdSanctuaryManager() {
	}

	// Singleton Class in Java
	public synchronized static BirdSanctuaryManager getInstance() {
		if (instance == null) {
			instance = new BirdSanctuaryManager();
		}
		return instance;
	}

	public void addDummyBirds() {
		Bird bird = new Bird();
		bird.birdName = "Penguin";
		bird.id = "Pen1";
		bird.colour = Colour.BLACK;
		bird.isflyable = false;
		bird.isSwimmable = true;
		birdList.add(bird);

		Bird bird1 = new Bird();
		bird1.birdName = "Parrot";
		bird1.id = "Par1";
		bird1.colour = Colour.GREEN;
		bird1.isflyable = true;
		bird1.isSwimmable = false;
		birdList.add(bird1);

		Bird bird2 = new Bird();
		bird2.birdName = "Ostrich";
		bird2.id = "Ost1";
		bird2.colour = Colour.BLACK;
		bird2.isflyable = false;
		bird2.isSwimmable = true;
		birdList.add(bird2);

		Bird bird3 = new Bird();
		bird3.birdName = "Dove";
		bird3.id = "Dov1";
		bird3.colour = Colour.BLACK;
		bird3.isflyable = true;
		bird3.isSwimmable = false;
		birdList.add(bird3);

		Bird bird4 = new Bird();
		bird4.birdName = "Dove";
		bird4.id = "Dov1";
		bird4.colour = Colour.BLACK;
		bird4.isflyable = true;
		bird4.isSwimmable = false;
		birdList.add(bird4);
		
	}

	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}

	public Bird edit(Bird updateBird) {
		int exit = 0;
		while (exit != 6) {
			System.out.println("1.ID :" + updateBird.id + "\n2.Bird Name :" + updateBird.birdName + "\n3.Bird Color :"
					+ updateBird.colour + "\n4.Flyable :" + updateBird.isflyable + "\n5.Swimmable :"
					+ updateBird.isSwimmable + "\n6.Save and Update\nSelect From Option");
			exit = SC.nextInt();
			switch (exit) {
			case 1:
				System.out.println("Enter the Bird ID");
				updateBird.id = SC.next();
				break;
			case 2:
				System.out.println("Enter the Bird Name");
				break;
			case 3:
				System.out.println("Enter the colour Option");
				System.out.println(
						"\n1.WHITE, 2.BLACK, 3.YELLOW, 4.GREEN, 5.GRAY," + " 6.BLUE, 7.RED \nEnter the Option");
				int option = SC.nextInt();
				switch (option) {
				case 1:
					updateBird.colour = Colour.WHITE;
					break;
				case 2:
					updateBird.colour = Colour.BLACK;
					break;
				case 3:
					updateBird.colour = Colour.YELLOW;
					break;
				case 4:
					updateBird.colour = Colour.GREEN;
					break;
				case 5:
					updateBird.colour = Colour.GRAY;
					break;
				case 6:
					updateBird.colour = Colour.BLUE;
					break;
				case 7:
					updateBird.colour = Colour.RED;
					break;
				default:
					System.out.println("This " + option + " option colour doesn't exists");
					break;
				}
				break;
			case 4:
				System.out.println("Enter the Bird isflyable (true or false)");
				updateBird.isflyable = SC.nextBoolean();
				break;
			case 5:
				System.out.println("Enter the Bird isSwimmable (true or false)");
				updateBird.isSwimmable = SC.nextBoolean();
				break;
			default:
				break;
			}
		}
		return updateBird;
	}

	public Bird getBird(String id) {

		for (Bird bird : birdList) {
			if (bird.id.equals(id)) {
				return bird;
			}
		}
		return null;
	}

	public void printFlyable() {
		if (birdList.isEmpty()) {
			System.out.println("Your Bird List is Empty");
		} else {
			for (Bird bird : birdList) {
				if (bird.isflyable) {
					bird.fly();
				}
			}
		}
	}

	public void printSwimmable() {
		if (birdList.isEmpty()) {
			System.out.println("Your Bird List is Empty");
		} else {
			for (Bird bird : birdList) {
				if (bird.isSwimmable) {
					bird.swim();
				}
			}
		}
	}

	public void printEatable() {
		if (birdList.isEmpty()) {
			System.out.println("Your Bird List is Empty");
		} else {
			for (Bird bird : birdList) {
				bird.eat();
			}
		}
	}


	public void print() {
		if (birdList.isEmpty()) {
			System.out.println("Your Bird List is Empty");
		} else {
			for (Bird bird : birdList) {
				System.out.println(bird);
			}
		}
	}

}
