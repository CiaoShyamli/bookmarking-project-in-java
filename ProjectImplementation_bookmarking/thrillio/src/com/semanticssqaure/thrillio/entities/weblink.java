package com.semanticssqaure.thrillio.entities;

import org.apache.commons.lang3.StringUtils;

import com.semanticssqaure.thrillio.partner.Shareable;

public class weblink extends bookmark implements Shareable{
	private String url;
	private String host;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "weblink [url=" + url + ", host=" + host + "]";
	}

	@Override
	public boolean isKidFriendlyEligible() {
		// TODO Auto-generated method stub
		if(url.contains("porn") || getTitle().contains("porn") || host.contains("adult"))
		{
			return false;
		}
		return true;
	}

	@Override
	public String getItemData() {
		// TODO Auto-generated method stub
		StringBuilder builder = new StringBuilder();
		builder.append("<item>");
		builder.append("<type>webLink</type>");
		builder.append("<title>").append(getTitle()).append("</title>");
		builder.append("<url>").append(url).append("</url>");
		builder.append("<host>").append(host).append("</host>");
		builder.append("</item>");
		return builder.toString();
	}

}
