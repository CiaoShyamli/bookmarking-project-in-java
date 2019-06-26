package com.semanticssqaure.thrillio.entities;

import java.util.Arrays;

public class Movie extends bookmark {
	private int releaseYear;
	private String[] cast;
	private String[] directors;
    private String genre;
    private double imdbrating;
    
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public String[] getCast() {
		return cast;
	}
	public void setCast(String[] cast) {
		this.cast = cast;
	}
	public String[] getDirectors() {
		return directors;
	}
	public void setDirectors(String[] directors) {
		this.directors = directors;
	}
	public String getGenere() {
		return genre;
	}
	public void setGenere(String genere) {
		this.genre = genere;
	}
	public double getImdbrating() {
		return imdbrating;
	}

	public void setImdbrating(double imdbrating) {
		this.imdbrating = imdbrating;
	}
	@Override
	public String toString() {
		return "Movie [releaseYear=" + releaseYear + ", cast="
				+ Arrays.toString(cast) + ", directors="
				+ Arrays.toString(directors) + ", genre=" + genre
				+ ", imdbrating=" + imdbrating + "]";
	}
	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		return false;
	}
}
