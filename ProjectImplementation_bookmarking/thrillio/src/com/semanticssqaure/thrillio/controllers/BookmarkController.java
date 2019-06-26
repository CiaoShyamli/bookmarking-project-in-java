package com.semanticssqaure.thrillio.controllers;

import com.semanticssqaure.thrillio.entities.User;
import com.semanticssqaure.thrillio.entities.bookmark;
import com.semanticssqaure.thrillio.managers.BookmarkManager;

public class BookmarkController {

	private static BookmarkController instance = new BookmarkController();

	private BookmarkController() {
	}
	
	public static BookmarkController getInstance(){
		return instance;
		
	}

	public void saveUserBookmark(User user, bookmark book) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().saveUserBookmark(user,book);
	}

	public void setKidFriendlyStatus(User user,String kidFriendlyStatus, bookmark bookmark) {
		// TODO Auto-generated method stub
		BookmarkManager.getInstance().setKidFriendlyStatus(user,kidFriendlyStatus,  bookmark);
		
	}

	
}
