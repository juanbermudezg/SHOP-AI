package com.sena.adso.modelo;

import java.time.LocalDate;

public class DisabledPerson extends User{
	
	
	private String type_of_visual_impairment;
	
	private int age;

	public DisabledPerson(Long id, String name, String email, Long cellphone, String pathPhoto, String language,
			LocalDate registrationDate, String type_of_visual_impairment, int age) {
		super(id, name, email, cellphone, pathPhoto, language, registrationDate);
		this.type_of_visual_impairment = type_of_visual_impairment;
		this.age = age;
	}

	public String getType_of_visual_impairment() {
		return type_of_visual_impairment;
	}

	public void setType_of_visual_impairment(String type_of_visual_impairment) {
		this.type_of_visual_impairment = type_of_visual_impairment;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void AIGeneration() {
		VisualAI AI =new VisualAI();
		
		System.out.println(AI.toString());
	}
	
}
