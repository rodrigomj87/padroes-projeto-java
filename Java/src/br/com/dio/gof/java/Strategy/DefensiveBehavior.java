package br.com.dio.gof.java.Strategy;

public class DefensiveBehavior implements Behavior{

	@Override
	public void move() {
		System.out.println("Mover-se Defensivamente");
		
	}

}
