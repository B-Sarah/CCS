package ccs.archi.repository;

import java.util.Map;

public class User {
private String fname;
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getMeetings() {
	return meetings;
}
public void setMeetings(String meetings) {
	this.meetings = meetings;
}
private String lname;
private String password;
private String meetings;


}
