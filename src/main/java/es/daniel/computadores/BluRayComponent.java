package es.daniel.computadores;

public class BluRayComponent extends ComponentDecorator {

	public BluRayComponent(Computer computer) {
		super(computer);
	}
	
	public String getDescription() {
		return getComputer().getDescription() + ", Blu-ray ";
	}
	
	public double cost() {
		return 85 + getComputer().cost();
	}
}
