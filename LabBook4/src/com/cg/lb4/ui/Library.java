package com.cg.lb4.ui;

import java.util.Scanner;

public class Library {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Title of book");
		String title = sc.nextLine();
		System.out.println("Enter Unique Identification Number of book");
		String identificationNumber = sc.next();
		System.out.println("Enter No of Copies of book");
		int numberOfCopies = sc.nextInt();
		System.out.println("--------------------------------------------------------");

		Book obj = new Book(identificationNumber, title, numberOfCopies);
		System.out.println("Identification Number : " + obj.getIdentificationNumber());
		System.out.println("Book Title : " + obj.getTitle());
		System.out.println("No of Copies : " + obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");

		System.out.println("Enter no of books to Check Out");
		int checkOutCount = sc.nextInt();
		obj.checkOut(checkOutCount);
		System.out.println("No of books after Check Out : " + obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");

		System.out.println("Enter no of books for Check In ");
		int checkInCount = sc.nextInt();
		obj.checkIn(checkInCount);
		System.out.println("No of book copies after Check In : " + obj.getNumberOfCopies());
		System.out.println("--------------------------------------------------------");

		System.out.println("Enter Author Name : ");
		String authorName = sc.next();
		System.out.println("Enter Author Age : ");
		int authorAge = sc.nextInt();
		System.out.println("Enter Author Location : ");
		String authorLocation = sc.next();

		obj.setAuthorName(authorName);
		obj.setAuthorAge(authorAge);
		obj.setAuotherLocation(authorLocation);
		System.out.println("--------------------------------------------------------");

		System.out.println("Author Name : " + obj.getAuthorName());
		System.out.println("Author Age : " + obj.getAuthorAge());
		System.out.println("Author Location : " + obj.getAuotherLocation());
		System.out.println("--------------------------------------------------------");

		System.out.println("Enter the Run Time of Video in Hours");
		int runTime = sc.nextInt();
		Video obj1 = new Video();
		System.out.println("Enter Director Name : ");
		String directorName = sc.next();
		System.out.println("Enter Video Genre : ");
		String genre = sc.next();
		System.out.println("Enter Video Release Year : ");
		String year = sc.next();
		System.out.println("--------------------------------------------------------");

		obj1.setRunTime(runTime);
		obj1.setDirectorName(directorName);
		obj1.setGenre(genre);
		obj1.setYear(year);

		System.out.println("Video Run Time : " + obj1.getRunTime());
		System.out.println("Video Director Name: " + obj1.getDirectorName());
		System.out.println("Video Run Time : " + obj1.getGenre());
		System.out.println("Video Run Time : " + obj1.getYear());
		System.out.println("--------------------------------------------------------");

		System.out.println("Enter Artist Name : ");
		String artistName = sc.next();
		System.out.println("Enter Artist Genre : ");
		String artistGenre = sc.next();
		System.out.println("--------------------------------------------------------");

		Cd obj2 = new Cd(artistName, artistGenre);
		System.out.println("Artist Name : " + obj2.getArtistName());
		System.out.println("Artist Genre : " + obj2.getArtistGenre());
		sc.close();
	}

}