package com.semanticssqaure.thrillio.dao;

import com.semanticssqaure.thrillio.DataStore;
import com.semanticssqaure.thrillio.entities.UserBookmark;
import com.semanticssqaure.thrillio.entities.bookmark;

public class bookmarkDao {

	public bookmark[][] getBookmarks()
	{
		return DataStore.getBookmarks();
	}

	public void saveUserBookmark(UserBookmark userBookmark) {
		// TODO Auto-generated method stub
		DataStore.add(userBookmark);
	}
}
