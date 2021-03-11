package com.cg.lb4.ui;


abstract class Item {
	protected String identificationNumber;
	protected String title;
	protected int numberOfCopies;

	public abstract String getIdentificationNumber();

	public abstract void setIdentificationNumber(String identificationNumber);

	public abstract String getTitle();

	public abstract void setTitle(String title);

	public abstract int getNumberOfCopies();

	public abstract void setNumberOfCopies(int numberOfCopies);

	public void checkIn(int checkInCount) {
		numberOfCopies += checkInCount;
	}

	public void checkOut(int checkOutCount) {
		numberOfCopies -= checkOutCount;
	}

	public Item(String identificationNumber, String title, int numberOfCopies) {
		this.identificationNumber = identificationNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

}

abstract class WrittenItem extends Item {

	public WrittenItem(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	protected String authorName;
	protected int authorAge;
	protected String auothorLocation;

	public abstract String getAuthorName();

	public abstract void setAuthorName(String authorName);

	public abstract int getAuthorAge();

	public abstract void setAuthorAge(int authorAge);

	public abstract String getAuotherLocation();

	public abstract void setAuotherLocation(String auotherLocation);

	public WrittenItem(String authorName, int authorAge, String auotherLocation) {
		super(authorName, auotherLocation, authorAge);
		this.authorName = authorName;
		this.authorAge = authorAge;
		this.auothorLocation = auotherLocation;
	}

}

class Book extends WrittenItem {

	public Book(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	@Override
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	@Override
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String getAuthorName() {
		return authorName;
	}

	@Override
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public int getAuthorAge() {
		return authorAge;
	}

	@Override
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}

	@Override
	public String getAuotherLocation() {
		return auothorLocation;
	}

	@Override
	public void setAuotherLocation(String auotherLocation) {
		this.auothorLocation = auotherLocation;
	}

}

class JournalPaper extends WrittenItem {

	public JournalPaper(String identificationNumber, String title, int numberOfCopies) {
		super(identificationNumber, title, numberOfCopies);
	}

	@Override
	public String getIdentificationNumber() {
		return identificationNumber;
	}

	@Override
	public void setIdentificationNumber(String identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	@Override
	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	@Override
	public String getAuthorName() {
		return authorName;
	}

	@Override
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	@Override
	public int getAuthorAge() {
		return authorAge;
	}

	@Override
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}

	@Override
	public String getAuotherLocation() {
		return auothorLocation;
	}

	@Override
	public void setAuotherLocation(String auotherLocation) {
		this.auothorLocation = auotherLocation;
	}

}

abstract class MediaItem {

	protected int runTime;

	public abstract int getRunTime();

	public abstract void setRunTime(int runTime);

}

class Video extends MediaItem {

	private String directorName;
	private String genre;
	private String year;

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public int getRunTime() {
		return runTime;
	}

	@Override
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

}

class Cd extends MediaItem {

	private String artistName;
	private String artistGenre;

	public Cd(String artistName, String artistGenre) {
		this.artistName = artistName;
		this.artistGenre = artistGenre;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}

	public String getArtistGenre() {
		return artistGenre;
	}

	public void setArtistGenre(String artistGenre) {
		this.artistGenre = artistGenre;
	}

	@Override
	public int getRunTime() {
		return runTime;
	}

	@Override
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}
}
