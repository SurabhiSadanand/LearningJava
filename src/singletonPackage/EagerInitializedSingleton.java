package singletonPackage;

public class EagerInitializedSingleton {

	    
	    private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
	    
	    //private constructor to avoid applications to use constructor
	    private EagerInitializedSingleton(){}

	    public static EagerInitializedSingleton getInstance(){
	        return instance;
	    }
	}

