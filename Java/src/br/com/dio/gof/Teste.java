package br.com.dio.gof;

import br.com.dio.gof.java.Facade.Facade;
import br.com.dio.gof.java.Singleton.SingletonEager;
import br.com.dio.gof.java.Singleton.SingletonLazy;
import br.com.dio.gof.java.Singleton.SingletonLazyHolder;
import br.com.dio.gof.java.Strategy.AggressiveBehavior;
import br.com.dio.gof.java.Strategy.Behavior;
import br.com.dio.gof.java.Strategy.DefensiveBehavior;
import br.com.dio.gof.java.Strategy.HumanoidMachine;
import br.com.dio.gof.java.Strategy.NormalBehavior;

public class Teste {

	public static void main(String[] args) {
		// Tests Pattern Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		System.out.println("===========================");
		// Tests Pattern Strategy
		Behavior defensive = new DefensiveBehavior();
		Behavior normal = new NormalBehavior();
		Behavior aggressive = new AggressiveBehavior();
		
		HumanoidMachine machine = new HumanoidMachine();
		
		machine.setBehavior(normal);
		machine.move();
		machine.setBehavior(defensive);
		machine.move();
		machine.setBehavior(aggressive);
		machine.move();
		System.out.println("===========================");
		Facade facade =  new Facade();
		facade.migrarCliente("Rodrigo", "11730-000");
	}

}
