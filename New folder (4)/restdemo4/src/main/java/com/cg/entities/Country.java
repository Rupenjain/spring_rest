package com.cg.entities;



import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class Country {
    private String code;
    private String name;
    private String continent;
    private String capital;
//..getter,setters & two constructors...   
    
  
	public String getCode() {
		
		return code;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String code, String name, String continent, String capital) {
	super();
	this.code = code;
	this.name = name;
	this.continent = continent;
	this.capital = capital;
}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContinent() {
		return continent;
	}
	public void setContinent(String continent) {
		this.continent = continent;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
    
    
    
    
    
}