package com.app.mymavenapp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Hello world!
 *
 */
@Entity
@Table(name="herolist")
@Data

public class App 
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
	public App( String name, String hero, int power) {
		super();
		this.name = name;
		this.hero = hero;
		this.power = power;
		//this.id = id;
		
	}
	public App() {
		super();
	}
	
	@Override
	public String toString() {
		return "Hero [id=" + id + ", Original Name=" + name + ", Hero Name=" + hero+ ", Power Level=" + power + "]";
	}
	
}
