package animeservlet.model;

public class AnimeList {
	private String name;
	private int year;
	private String genre;
	private int rating;
	
	public AnimeList(String name, int year, String genre, int rating) {
		super();
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	

}
