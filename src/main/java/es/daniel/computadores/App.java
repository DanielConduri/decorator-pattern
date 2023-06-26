package es.daniel.computadores;

public class App {

	public static void main( String[] args ) {
		Computer computerApple = new AppleComputer();
		computerApple = new RamComponent(computerApple);
		System.out.println(computerApple.getDescription() + " $" + computerApple.cost());
		
		
		Computer computerLenovo = new LenovoComputer();
		computerLenovo = new RamComponent(computerLenovo);
		computerLenovo = new BluRayComponent(computerLenovo);
		System.out.println(computerLenovo.getDescription() + "$" + computerLenovo.cost());
		
		
		Computer computerHp = new HpComputer();
		computerHp = new RamComponent(computerHp);
		computerHp = new CardComponent(computerHp);
		System.out.println(computerHp.getDescription() + "$" + computerHp.cost());
	}
	
}
