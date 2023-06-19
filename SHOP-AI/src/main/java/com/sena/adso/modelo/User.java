package com.sena.adso.modelo;

import java.time.LocalDate;

public class User {
	
	private Long id;
	private String name;
	private String email;
	private Long cellphone;
	private String pathPhoto;
	private String language;
	private LocalDate registrationDate = LocalDate.now();
	
	public User(Long id, String name, String email, Long cellphone, String pathPhoto, String language,
			LocalDate registrationDate) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.cellphone = cellphone;
		this.pathPhoto = pathPhoto;
		this.language = language;
		this.registrationDate = registrationDate;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCellphone() {
		return cellphone;
	}
	public void setCellphone(Long cellphone) {
		this.cellphone = cellphone;
	}
	public String getPathPhoto() {
		return pathPhoto;
	}
	public void setPathPhoto(String pathPhoto) {
		this.pathPhoto = pathPhoto;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	public void downloadApp(boolean option) {
		
		if (option==true) {
			//TODO
			
		}
		else {
			//TODO
		}
	}

}
