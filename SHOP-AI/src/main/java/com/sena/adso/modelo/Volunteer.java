package com.sena.adso.modelo;

import java.time.LocalDate;

public class Volunteer extends User{

	private Long photosQuantityValue;

	public Volunteer(Long id, String name, String email, Long cellphone, String pathPhoto, String language,
			LocalDate registrationDate) {
		super(id, name, email, cellphone, pathPhoto, language, registrationDate);
		this.photosQuantityValue=(long) 0;
	}
	
	public String generateCertificated() {
		//TODO
		return this.photosQuantityValue.toString();
	}

	public Long getPhotosQuantityValue() {
		return photosQuantityValue;
	}

	public void addPhotos(Long photosQuantityValue) {
		this.photosQuantityValue = this.photosQuantityValue + photosQuantityValue;
	}
	
	
}
