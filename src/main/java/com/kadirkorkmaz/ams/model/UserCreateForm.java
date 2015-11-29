package com.kadirkorkmaz.ams.model;

import org.hibernate.validator.constraints.NotEmpty;

import com.kadirkorkmaz.ams.entity.Role;

public class UserCreateForm {

	@NotEmpty
	private String name = "";

	@NotEmpty
	private String surname = "";

	@NotEmpty
	private String email = "";

	@NotEmpty
	private String password = "";

	@NotEmpty
	private String passwordRepeated = "";

	@NotEmpty
	private Role role = Role.Athlete;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeated() {
		return passwordRepeated;
	}

	public void setPasswordRepeated(String passwordRepeated) {
		this.passwordRepeated = passwordRepeated;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserCreateForm [name=" + name + ", surname=" + surname + ", email=" + email + ", password=" + password
				+ ", passwordRepeated=" + passwordRepeated + ", role=" + role + "]";
	}

}
