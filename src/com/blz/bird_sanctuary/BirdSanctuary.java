package com.blz.bird_sanctuary;

import java.util.Scanner;

import com.blz.bird_sanctuary.Bird.Colour;

public class BirdSanctuary {
	static final Scanner SC = new Scanner(System.in);
	// static BirdSanctuaryManager birdSanctuaryManager =
	// BirdSanctuaryManager.getInstance();

	public void showMenu() {
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
		int exit = 1;
		while (exit != 0) {
			System.out.println("1.Add Bird\n2.Remove Bird\n3.Update Bird" + 
					"\n4.Print all Bird\n5.Print Flyable Bird\n"
					+ "6.Print Swimmable Bird\n7.Print Eating Bird\n0.Exit");
			System.out.println("\nSelect From Menu");
			int choice = SC.nextInt();

			switch (choice) {
			case 0:
				exit = 0;
				System.out.println("Thank You for Participation");
				break;
			case 1:
//				addBird();
				birdSanctuaryManager.addDummyBirds(); // Need to delete in Production
				break;

			case 2:
				System.out.println("Enter The Bird ID");
				String removeId = SC.next();
				Bird removeBird = birdSanctuaryManager.getBird(removeId);
				if (removeBird == null) {
					System.out.println("Your Bird List is Empty");
				} else {
					birdSanctuaryManager.remove(removeBird);
				}
				break;
			case 3:
				System.out.println("Enter The Bird ID");
				String updateId = SC.next();
				Bird editBird = birdSanctuaryManager.getBird(updateId);
				if (editBird == null) {
					System.out.println("Your Bird List is Empty");
				} else {
					birdSanctuaryManager.edit(editBird);
				}
				break;
			case 4:
				birdSanctuaryManager.print();
				break;
			case 5:
				birdSanctuaryManager.printFlyable();
				break;
			case 6:
				birdSanctuaryManager.printSwimmable();
				break;
			case 7:
				birdSanctuaryManager.printEatable();
				break;
			default:
				System.out.println("Select from Option");
				break;
			}
		}
	}

	public void addBird() {
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
		Bird bird = new Bird();

		System.out.println("Enter the Bird Colour");
		System.out.println("\n1.WHITE, 2.BLACK, 3.YELLOW, 4.GREEN, 5.GRAY," + " 6.BLUE, 7.RED \nEnter the Option");
		int option = SC.nextInt();
		switch (option) {
		case 1:
			bird.colour = Colour.WHITE;
			System.out.println(bird.colour);
			break;
		case 2:
			bird.colour = Colour.BLACK;
			System.out.println(bird.colour);
			break;
		case 3:
			bird.colour = Colour.YELLOW;
			System.out.println(bird.colour);
			break;
		case 4:
			bird.colour = Colour.GREEN;
			System.out.println(bird.colour);
			break;
		case 5:
			bird.colour = Colour.GRAY;
			System.out.println(bird.colour);
			break;
		case 6:
			bird.colour = Colour.BLUE;
			System.out.println(bird.colour);
			break;
		case 7:
			bird.colour = Colour.RED;
			System.out.println(bird.colour);
			break;
		default:
			System.out.println("This " + option + " option colour doesn't exists");
			break;
		}

		System.out.println("Enter the Bird Name");
		bird.birdName = SC.next();
		System.out.println(bird.birdName);

		System.out.println("Enter the Bird ID");
		bird.id = SC.next();
		System.out.println(bird.id);

		System.out.println("Enter the Bird isflyable (true or false)");
		bird.isflyable = SC.nextBoolean();
		System.out.println(bird.isflyable);

		System.out.println("Enter the Bird isSwimmable (true or false)");
		bird.isSwimmable = SC.nextBoolean();
		System.out.println(bird.isSwimmable);
		birdSanctuaryManager.add(bird);
	}

	public static void main(String[] args) {
		BirdSanctuaryManager birdSanctuaryManager = BirdSanctuaryManager.getInstance();
//		Dove dove = new Dove();
//		dove.id = "D1";
//		Penguin penguin = new Penguin();
//		penguin.id = "Pe1";
//		Ostrich ostrich = new Ostrich();
//		ostrich.id = "O1";
//		Parrot parrot = new Parrot();
//		parrot.id = "Pa1";

//		birdSanctuaryManager.add(dove);
//		birdSanctuaryManager.add(penguin);
//		birdSanctuaryManager.add(ostrich);
//		birdSanctuaryManager.add(parrot);

		BirdSanctuary birdSanctuary = new BirdSanctuary();
		birdSanctuary.showMenu();
	}
}
