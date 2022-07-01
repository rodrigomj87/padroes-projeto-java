package br.com.dio.gof.java.Strategy;

public class HumanoidMachine {
	private Behavior behavior;


	public void setBehavior(Behavior behavior) {
		this.behavior = behavior;
	}
	
	public void move() {
		behavior.move();
	}

}
