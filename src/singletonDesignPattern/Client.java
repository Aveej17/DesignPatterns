package singletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        SingletonEagerInitialized s =SingletonEagerInitialized.getInstance();

        System.out.println(s);
        SingletonEagerInitialized s1 = SingletonEagerInitialized.getInstance();
        System.out.println(s1);

        SingletonLazyInitializing l = SingletonLazyInitializing.getSingletonInstance();
        System.out.println(l);

        SingletonLazyInitializing l1 = SingletonLazyInitializing.getSingletonInstance();
        System.out.println(l1);
    }
}
