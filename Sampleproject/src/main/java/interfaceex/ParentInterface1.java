package interfaceex;

public interface ParentInterface1 {
	public abstract void sum();
	  public static final int number1=100;
	  public static final int number2=200;
    public abstract void display(); 
    default void show() {
    	int diff=number1-number2;
    	System.out.println("Difference of 2 numbers:" +diff);
    }
    
    static void result() 
    {
    	int mul=number1*number2;
    	System.out.println("Multiplication of 2 numbers:" +mul);
    	
    }
    	
    }
    
    


