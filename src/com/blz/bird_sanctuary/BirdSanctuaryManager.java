package com.blz.bird_sanctuary;

import java.util.ArrayList;
import java.util.List;

public class BirdSanctuaryManager {
	List<Bird> birdList = new ArrayList<Bird>();
	static private BirdSanctuaryManager instance;
	private BirdSanctuaryManager() {}
	
	public synchronized static BirdSanctuaryManager getInstance() {
		if(instance == null) {
			instance = new BirdSanctuaryManager();
		}
		return instance;
	}
	
	public void add(Bird bird) {
		birdList.add(bird);
	}

	public void remove(Bird bird) {
		birdList.remove(bird);
	}

	public Bird getBird(String id) {
		for (int i = 0; i < birdList.size(); i++) {
			if ((birdList.get(i).id).equals(id)) {
				System.out.println(birdList.get(i).id);
				return birdList.get(i);
			}
		}
		return null;
	}

	public void printFlyable() {
		for (int i = 0; i < birdList.size(); i++) {
			if (birdList.get(i).isflyable==true){
				birdList.get(i).fly();
			}
		}
	}

	public void printSwimmable() {
		for (int i = 0; i < birdList.size(); i++) {
			if (birdList.get(i).isflyable==true) {
				birdList.get(i).swim();
			}
		}
	}

	public void printEatable() {
		for (int i = 0; i < birdList.size(); i++) {
			birdList.get(i).eat();
		}
	}

//	public void print() {
//		for (Object i : birdList) {
//			System.out.println(i);
//		}
//	}
	
	public void print() {
		for (int i = 0; i < birdList.size(); i++) {
			System.out.println(birdList.get(i));
		}
	}
}
