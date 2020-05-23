package com.test.saludo.dto;

public class Poet {

	/*
	 * "poet": { "name": " Jean De La Fontaine", "url":
	 * "https://www.poemist.com/jean-de-la-fontaine" }
	 */
	private String name;
	private String url;

	public Poet() {
		super();
	}

	public Poet(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
