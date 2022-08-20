package singletonPackage;

public class SingletonMain {

	public static void main(String[] args) {
		EagerInitializedSingleton instance1 = EagerInitializedSingleton.getInstance();
		System.out.println(instance1);
		
		EagerInitializedSingleton instance2 = EagerInitializedSingleton.getInstance();
		System.out.println(instance2);
		
		LazyInitializedSingleton instance3 = LazyInitializedSingleton.getInstance();
		System.out.println(instance3);
		
		LazyInitializedSingleton instance4 = LazyInitializedSingleton.getInstance();
		System.out.println(instance4);
		
		ThreadSafeSingleton instance5 =ThreadSafeSingleton.getInstance();
		System.out.println(instance5);
		
		ThreadSafeSingleton instance6 = ThreadSafeSingleton.getInstance();
		System.out.println(instance6);
		
		
	}

}
