package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="dd")

public class ApiModel {

@Id

private int id;
private String name;
private String email;
private String password;
private String channel;
private String language;

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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getChannel() {
	return channel;
}
public void setChannel(String channel) {
	this.channel = channel;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
public ApiModel(int id, String name, String email, String password, String channel, String language) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.channel = channel;
	this.language = language;
}


public ApiModel()
{

}
public String toString()
{
return "Id="+id+"Name="+name+"Email="+email+"ChannelName= "+channel+"Password="+password+
		"Language= "+language;
}
}