package com.semanticssqaure.thrillio.entities;

import static org.junit.Assert.*;

import org.junit.Test;

import com.semanticssqaure.thrillio.managers.BookmarkManager;;

public class WebLinkTest {

	@Test
	public void testIsKidFriendlyEligible() {
		// Test 1: porn in url -- return false

		weblink web = BookmarkManager
				.getInstance()
				.createWeblink(
						2000,
						"Taming Tiger, Part 2",
						"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
						"http://www.javaworld.com");

		boolean isKidFriendlyEligible = web.isKidFriendlyEligible();

		assertFalse("For porn in url -- it should return false",
				isKidFriendlyEligible);
		
		// Test 2: porn in title -- return false
		web = BookmarkManager
				.getInstance()
				.createWeblink(
						2000,
						"Taming porn, Part 2",
						"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
						"http://www.javaworld.com");

		isKidFriendlyEligible = web.isKidFriendlyEligible();

		assertFalse("For porn in title -- it should return false",
				isKidFriendlyEligible);
		// Test 3: adult in host -- return false
		
		web = BookmarkManager
				.getInstance()
				.createWeblink(
						2000,
						"Taming Tiger, Part 2",
						"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
						"http://www.adult.com");

		isKidFriendlyEligible = web.isKidFriendlyEligible();

		assertFalse("adult in host -- return false",
				isKidFriendlyEligible);

		// Test 4: adult in url, but not in host part -- return true
		
		web = BookmarkManager
				.getInstance()
				.createWeblink(
						2000,
						"Taming Tiger, Part 2",
						"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
						"http://www.javaworld.com");

		isKidFriendlyEligible = web.isKidFriendlyEligible();

		assertTrue("adult in url, but not in host part -- return true",
				isKidFriendlyEligible);

		// Test 5: adult in title only -- return true
		
		web = BookmarkManager
				.getInstance()
				.createWeblink(
						2000,
						"Taming adult, Part 2",
						"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
						"http://www.javaworld.com");

		isKidFriendlyEligible = web.isKidFriendlyEligible();

		assertTrue("adult in title only -- return true",
				isKidFriendlyEligible);

	}

}
