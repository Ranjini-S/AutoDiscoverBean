package com.DanskeIt.Example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("Ranjini Sathyanarayana")
private String name;

	@Value("1001007")
private String Id;

private Hostel hostel;

public String getName() {
	return name;
}
 
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return Id;
}
 
public void setId(String id) {
	Id = id;
}

@Autowired
public void setHostel(Hostel hostel) {
	this.hostel = hostel;
}


@Override
public String toString() {
	return "Student [name=" + name + ", Id=" + Id + ", hostel=" + hostel + "]";
}

public void display()
{
	System.out.println("Inside student");
	hostel.display();
}
}
