package es.daniel.computadores;

public class CardComponent extends ComponentDecorator {
	public CardComponent(Computer computer) {
		super(computer);
	}
	
	public String getDescription() {
		return getComputer().getDescription() + ", Nvidia GeoForce GTX 1660Ti card ";
	}
	
	public double cost() {
		return 425 + getComputer().cost();
	}
}
