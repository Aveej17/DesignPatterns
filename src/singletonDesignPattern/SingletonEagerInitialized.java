package singletonDesignPattern;

public class SingletonEagerInitialized {

    private static SingletonEagerInitialized s = new SingletonEagerInitialized();

//    private SingletonEagerInitialized(){
//
//    }

    public static SingletonEagerInitialized getInstance(){
        return s;
    }
}
