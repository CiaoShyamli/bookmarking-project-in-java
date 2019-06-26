package com.semanticssqaure.thrillio;

import com.semanticssqaure.thrillio.entities.User;
import com.semanticssqaure.thrillio.entities.UserBookmark;
import com.semanticssqaure.thrillio.entities.bookmark;
import com.semanticssqaure.thrillio.managers.BookmarkManager;
import com.semanticssqaure.thrillio.managers.UserManager;

public class Launch {

	private static User[] users;
	private static bookmark[][] bookmarks;

	private static void loadData() {
		// TODO Auto-generated method stub
		System.out.println("1. loading data...");
		DataStore.loadData();

		users = UserManager.getInstance().getUsers();
		bookmarks = BookmarkManager.getInstance().getBookmarks();
		
		/*
		 * System.out.println("Printing data..."); printUserData(); printBookmarkData();
		 */

	}

	
	private static void printUserData() {
		// TODO Auto-generated method stub
		for(User user :users)
		{
			System.out.println(user);
		}
	}
	
	private static void printBookmarkData() {
		// TODO Auto-generated method stub
		for(bookmark[] bookmarklist :bookmarks)
		{
			for(bookmark bookmark1:bookmarklist)
			{
				System.out.println(bookmark1);
			}
		}
	}

	private static void start() {
		// TODO Auto-generated method stub
	//	System.out.println("\n2. bookmarking...");
		for(User user:users)
		{
			View.browse(user,bookmarks);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loadData();
		start();
	}


	
}
