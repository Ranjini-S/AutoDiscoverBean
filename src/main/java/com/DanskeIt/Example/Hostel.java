package com.DanskeIt.Example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Hostel {
	
	@Value("Best Women's Hostel")
public String hostelName;
	@Value("Bangalore")
public String city;

public Hostel()
{
	
}
public String getHostelName() {
	return hostelName;
}
public void setHostelName(String hostelName) {
	this.hostelName = hostelName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Hostel [hostelName=" + hostelName + ", city=" + city + "]";
}

public void display()
{
	System.out.println("Inside Hostel");
}

}
