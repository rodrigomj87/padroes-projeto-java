package br.com.dio.gof.java.Singleton;

/**
 * Singleton "Lazy"
 * 
 * @author rodrigomj87
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy sLazy;
	
	private SingletonLazy() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (sLazy == null) {
			sLazy = new SingletonLazy();
		}
		return sLazy;
	}
	
}
