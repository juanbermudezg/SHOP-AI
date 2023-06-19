package com.sena.adso.modelo;

import java.time.LocalDate;

public class Admin extends User{
	
	private boolean DBAcces;

	public boolean isDBAcces() {
		return DBAcces;
	}

	public void setDBAcces(boolean dBAcces) {
		DBAcces = dBAcces;
	}

	public Admin(Long id, String name, String email, Long cellphone, String pathPhoto, String language,
			LocalDate registrationDate, boolean dBAcces) {
		super(id, name, email, cellphone, pathPhoto, language, registrationDate);
		DBAcces = dBAcces;
	}
	
		
}
