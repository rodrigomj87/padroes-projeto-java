package br.com.dio.gof.java.Singleton;

/**
 * Singleton "Eager"
 * 
 * @author rodrigomj87
 *
 */
public class SingletonEager {
	
	private static SingletonEager sLazy = new SingletonEager();
	
	private SingletonEager() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static SingletonEager getInstancia() {
		
		return sLazy;
	}
	
}
