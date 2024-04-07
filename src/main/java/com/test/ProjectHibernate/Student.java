package com.test.ProjectHibernate;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Student {
	@Id
private int id;
@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
private String name;
private String city;

private Certificate certi;

public Certificate getCerti() {
	return certi;
}

public void setCerti(Certificate certi) {
	this.certi = certi;
}

public Student(int id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
//Student s=new Student(101,"nitin","bhilai");

public Student() {
	super();
	
}
}
