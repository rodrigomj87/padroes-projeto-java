package br.com.dio.gof.java.Singleton;

/**
 * Singleton "LazyHolder"
 * 
 * @author rodrigomj87
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder sLazy = new SingletonLazyHolder();
	}
	
	
	private SingletonLazyHolder() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {		
		return InstanceHolder.sLazy;
	}
	
}
