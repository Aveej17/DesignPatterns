package singletonDesignPattern;

public class SingletonLazyInitializing {
    private static SingletonLazyInitializing l = null;

    private SingletonLazyInitializing() {
    }

    public static SingletonLazyInitializing getSingletonInstance(){
        if(l == null){
            synchronized (SingletonLazyInitializing.class){
                if(l == null){
                    l = new SingletonLazyInitializing();
                }
            }

        }
        return l;
    }

}
