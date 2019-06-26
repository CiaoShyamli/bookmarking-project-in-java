package com.semanticssqaure.thrillio;

import com.semanticssqaure.thrillio.constants.KidFriendlyStatus;
import com.semanticssqaure.thrillio.constants.UserType;
import com.semanticssqaure.thrillio.controllers.BookmarkController;
import com.semanticssqaure.thrillio.entities.User;
import com.semanticssqaure.thrillio.entities.bookmark;

public class View {

	public static void browse(User user, bookmark[][] bookmarks) {

		System.out.println("\n" + user.getEmail() + "is browse");
		int bookmarkCount = 0;
		for (bookmark[] bookmarkList : bookmarks) {
			for (bookmark bookmark : bookmarkList) {
				if (bookmarkCount < DataStore.BOOKMARK_COUNT_PER_TYPE) {
					boolean isBookmark = getBookMarkDecision(bookmark);
					if (isBookmark) {
						bookmarkCount++;

						BookmarkController.getInstance().saveUserBookmark(user, bookmark);

						System.out.println("New ITEM boolmarked------" + bookmark);
					}
				}

				if (user.getUserType().equals(UserType.EDITOR) || user.getUserType().equals(UserType.EDITOR)) {

					// mark as kid friendly
					if (bookmark.isKidFriendlyEligible()
							&& bookmark.getIsKidFriendlyStatus().equals(KidFriendlyStatus.UNKNOWN)) {

						String kidFriendlyStatus = getKidFriendlyStatusDecision(bookmark);
						BookmarkController.getInstance().setKidFriendlyStatus(user,kidFriendlyStatus, bookmark);

						if (!kidFriendlyStatus.equals(KidFriendlyStatus.UNKNOWN)) {

						}
					}
					
					// sharing
					if(bookmark.isKidFriendlyEligible()
							&& bookmark.getIsKidFriendlyStatus().equals(KidFriendlyStatus.APPROVED))
					{
						
					}
				}

			}

		}

	}

	private static String getKidFriendlyStatusDecision(bookmark bookmark) {
		// TODO Auto-generated method stub
		return Math.random() < 0.4 ? KidFriendlyStatus.APPROVED
				: (Math.random() >= 0.4 && Math.random() <= 0.8) ? KidFriendlyStatus.REJECTED
						: KidFriendlyStatus.UNKNOWN;

	}
	/*
	 * public static void bookmark(User user, bookmark[][] bookmarks) {
	 * 
	 * System.out.println("\n" + user.getEmail() + "is bookmarking"); for (int i =
	 * 0; i < DataStore.BOOKMARK_COUNT_PER_TYPE; i++) { int typeOffset = (int)
	 * (Math.random() * DataStore.BOOKMARK_TYPES_COUNT); int bookmarkOffset =
	 * (int)(Math.random() * DataStore.BOOKMARK_COUNT_PER_TYPE);
	 * 
	 * bookmark book = bookmarks[typeOffset][bookmarkOffset];
	 * 
	 * BookmarkController.getInstance().saveUserBookmark(user,book);
	 * 
	 * System.out.println(book); } }
	 */

	private static boolean getBookMarkDecision(bookmark bookmark) {
		return Math.random() < 0.5 ? true : false;
		// TODO Auto-generated method stub

	}
}
