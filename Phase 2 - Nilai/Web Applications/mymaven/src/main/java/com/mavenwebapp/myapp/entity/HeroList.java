package com.mavenwebapp.myapp.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hello world!
 *
 */
@Entity
@Table(name="herolist")
@Data
@NoArgsConstructor

public class HeroList 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="hero")
	private String hero;
	@Column(name="power")
	private int power;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="pointer")
	private Category category;
	public HeroList( String name, String hero, int power) {
		super();
		this.name = name;
		this.hero = hero;
		this.power = power;
		//this.id = id;
	}
	public HeroList(String name, String hero, int power, Category category) {
		super();
		this.name = name;
		this.hero = hero;
		this.power = power;
		this.category = category;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
