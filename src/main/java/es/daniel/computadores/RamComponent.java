package es.daniel.computadores;

public class RamComponent extends ComponentDecorator {
	
	public RamComponent(Computer computer) {
		super(computer);
	}
	
	public String getDescription() {
		return getComputer().getDescription() + ", 8GB RAM";
	}
	
	public double cost() {
		return 45 + getComputer().cost();
	}
}
