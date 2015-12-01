package twelve;

//Use an instance method reference with different objects. 

//A functional interface that takes two reference arguments 
//and returns a boolean result. 
public interface MyFunc<T> {
	boolean func(T v1, T v2);
}