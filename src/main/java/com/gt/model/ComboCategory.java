package com.gt.model;

import java.io.Serializable;

public class ComboCategory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5377951392332709013L;
	private Integer id;
	private String login;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}

}
