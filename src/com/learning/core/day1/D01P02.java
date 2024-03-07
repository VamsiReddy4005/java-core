package com.learning.core.day1;


interface Medicinenfo {
 void displayLabel();
}

public class D01P02 {
 public static void main(String[] args) {
     
     Medicinenfo tablet = new Tablet();
     Medicinenfo syrup = new Syrup();
     Medicinenfo ointment = new Ointment();

    
     tablet.displayLabel();
     syrup.displayLabel();
     ointment.displayLabel();
 }
}

class Ointment implements Medicinenfo {
	 public void displayLabel() {
	     System.out.println("Ointment is for external use only.");
	 }
	}

class Syrup implements Medicinenfo {

	 public void displayLabel() {
	     System.out.println("Syrup is consumable only on prescription.");
	 }
	}
class Tablet implements Medicinenfo {

	 public void displayLabel() {
	     System.out.println("Store Tablets in a cool dry place.");
	 }
	}


