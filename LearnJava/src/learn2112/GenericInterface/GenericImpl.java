package learn2112.GenericInterface;

public class GenericImpl <T> implements  Generic<T>{
    @Override
    public void show(T t){
        System.out.println(t);
    }
}
