package adapterDesinPattern;

public class Client {

    public static void main(String[] args) {
        StudentClient studentClient = new StudentClient();
        System.out.println(studentClient.getStudentList());
    }
}
