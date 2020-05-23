package com.test.saludo.dto;

import java.io.Serializable;

public class Poema implements Serializable {

	private String title;
	private String content;
	private String url;
	private Poet poet;

	public Poema() {
		super();
	}

	public Poema(String title, String content, String url, Poet poet) {
		super();
		this.title = title;
		this.content = content;
		this.url = url;
		this.poet = poet;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Poet gettPoet() {
		return poet;
	}

	public void setPoet(Poet poet) {
		this.poet = poet;
	}

}
