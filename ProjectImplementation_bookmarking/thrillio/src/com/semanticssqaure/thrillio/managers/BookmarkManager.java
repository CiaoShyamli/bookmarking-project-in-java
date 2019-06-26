package com.semanticssqaure.thrillio.managers;

import com.semanticssqaure.thrillio.dao.bookmarkDao;
import com.semanticssqaure.thrillio.entities.User;
import com.semanticssqaure.thrillio.entities.UserBookmark;
import com.semanticssqaure.thrillio.entities.book;
import com.semanticssqaure.thrillio.entities.Movie;
import com.semanticssqaure.thrillio.entities.bookmark;
import com.semanticssqaure.thrillio.entities.weblink;

public class BookmarkManager {
	private static BookmarkManager instance = new BookmarkManager();

	private static bookmarkDao dao = new bookmarkDao();

	private BookmarkManager() {
	}

	public static BookmarkManager getInstance() {
		return instance;
	}

	public weblink createWeblink(long id, String title, String url, String host) {
		weblink web = new weblink();
		web.setId(id);
		web.setTitle(title);
		web.setUrl(url);
		web.setHost(host);
		return web;

	}

	public book createBook(long id, String publisher, int publicationYear, String[] authers, String genre,
			double amazonRating) {
		book bo = new book();
		bo.setId(id);
		bo.setPublicationYear(publicationYear);
		bo.setPublisher(publisher);
		bo.setAuthers(authers);
		bo.setGenre(genre);
		bo.setAmazonRating(amazonRating);

		return bo;

	}

	public Movie createMovie(long id, String title, String profileUrl, int releaseYear, String[] cast,
			String[] directors, String genre, double imdbrating) {
		Movie movie = new Movie();
		movie.setId(id);
		movie.setTitle(title);
		movie.setProfileUrl(profileUrl);
		movie.setReleaseYear(releaseYear);
		movie.setCast(cast);
		movie.setDirectors(directors);
		movie.setGenere(genre);
		movie.setImdbrating(imdbrating);
		return movie;
	}

	public bookmark[][] getBookmarks() {
		return dao.getBookmarks();
	}

	public void saveUserBookmark(User user, bookmark book) {
		// TODO Auto-generated method stub
		UserBookmark userBookmark = new UserBookmark();
		userBookmark.setUser(user);
		userBookmark.setBookmark(book);

		dao.saveUserBookmark(userBookmark);

	}

	public void setKidFriendlyStatus(User user, String kidFriendlyStatus, bookmark bookmark) {
		bookmark.setIsKidFriendlyStatus(kidFriendlyStatus);
		bookmark.setKidFriendlyMarkedBy(user);
		System.out.println("Updating the kid friendly status with user"+ kidFriendlyStatus +"marked by"+user.getEmail()+"is" + bookmark);

	}

}
