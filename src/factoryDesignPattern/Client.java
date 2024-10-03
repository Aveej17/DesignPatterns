package factoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        Course LLD  = CourseFactory.getCourse("LLD");
        Course HLD = CourseFactory.getCourse("HLD");

        assert LLD != null;
        System.out.print("LLD modules : ");
        System.out.println(LLD.getModules());
        assert HLD != null;
        System.out.print("HLD modules : ");
        System.out.println(HLD.getModules());



    }
}
