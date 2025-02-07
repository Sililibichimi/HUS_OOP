package oop_hus.hu.decorator;

public abstract class Bread {
	protected String description;
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
