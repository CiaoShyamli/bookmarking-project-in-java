package com.semanticssqaure.thrillio.entities;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

import com.semanticssqaure.thrillio.partner.Shareable;

public class book extends bookmark implements Shareable {
	private int publicationYear;
	private String publisher;
	private String[] authers;
	private String genre;
	private double amazonRating;

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String[] getAuthers() {
		return authers;
	}

	public void setAuthers(String[] authers) {
		this.authers = authers;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public double getAmazonRating() {
		return amazonRating;
	}

	public void setAmazonRating(double amazonRating) {
		this.amazonRating = amazonRating;
	}

	@Override
	public String toString() {
		return "book [publicationYear=" + publicationYear + ", publisher="
				+ publisher + ", authers=" + Arrays.toString(authers)
				+ ", genre=" + genre + ", amazonRating=" + amazonRating + "]";
	}

	@Override
	public String getItemData() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
		builder.append("<type>book</type>");
		builder.append("<title>").append(getTitle()).append("</title>");
		builder.append("<authers>").append(StringUtils.join(authers,",")).append("</authers>");
		builder.append("<publisher>").append(publisher).append("</publisher>");
		builder.append("<publicationYear>").append(publicationYear).append("</publicationYear>");
		builder.append("<genre>").append(genre).append("</genre>");
		builder.append("<amazonRating>").append(amazonRating).append("</amazonRating>");
		builder.append("</item>");
		return builder.toString();
	}

	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		return false;
	}

}
