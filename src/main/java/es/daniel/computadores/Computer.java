package es.daniel.computadores;

public abstract class Computer {
	String description = "Unknown Computer";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
