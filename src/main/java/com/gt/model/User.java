package com.gt.model;
// Generated 2015-10-11 20:55:41 by Hibernate Tools 4.0.0

import com.alibaba.druid.pool.vendor.SybaseExceptionSorter;

/**
 * 
* @ClassName: User 
* @Description: TODO(用户类) 
* @author A18ccms a18ccms_gmail_com 
* @date 2015年10月12日 下午2:22:07 
*
 */
public class User implements java.io.Serializable {

	/**
	 * 容器的关闭和session无关
	 * 当对象存储到硬盘的时候要实现序列化接口，序列化的功能就是添加了一个唯一标识的ID
	 * 这里解释一下序列化，所谓序列化就是将内存上的类容放到硬盘上，
	 * 反序列化就是将硬盘上的内容读到内存中，通过ID来读取
	 */
	private static final long serialVersionUID = -4595799472692770616L;
	private Integer id;
	private String login;
	private String name;
	private String pass;
	private String sex;
	private String phone;
	private String email;

	public User() {
	}

	
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", login=" + login + ", name=" + name + ", pass=" + pass + ", sex=" + sex + ", phone="
				+ phone + ", email=" + email + "]";
	}
    
}
