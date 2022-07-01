package br.com.dio.gof.java.Strategy;

public class AggressiveBehavior implements Behavior{

	@Override
	public void move() {
		System.out.println("Mover-se Agressivamente");
		
	}

}
