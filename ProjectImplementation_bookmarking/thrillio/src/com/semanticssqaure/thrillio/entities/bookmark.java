package com.semanticssqaure.thrillio.entities;

import com.semanticssqaure.thrillio.constants.KidFriendlyStatus;

public abstract class bookmark {
	private long id;
	private String title;
	private String profileUrl;
	private String IsKidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
	private User KidFriendlyMarkedBy;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

	public abstract boolean isKidFriendlyEligible();

	public String getIsKidFriendlyStatus() {
		return IsKidFriendlyStatus;
	}

	public void setIsKidFriendlyStatus(String isKidFriendlyStatus) {
		IsKidFriendlyStatus = isKidFriendlyStatus;
	}

	public User getKidFriendlyMarkedBy() {
		return KidFriendlyMarkedBy;
	}

	public void setKidFriendlyMarkedBy(User kidFriendlyMarkedBy) {
		KidFriendlyMarkedBy = kidFriendlyMarkedBy;
	} 
}
