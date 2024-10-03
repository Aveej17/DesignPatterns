package builderDesignPattern;

public class Client {
    public static void main(String[] args) {
        URLBuilder.Builder url= new URLBuilder.Builder();

        // all the combination of constructor is possible via builder pattern

        URLBuilder urlBuilder = url
                .protocol("https://")
                .hostname("myWebSite")
                .port(":443")
                .pathParam("/abc")
//                .queryParam("?name=a")
                .build();
        System.out.print(urlBuilder.protocol);
        System.out.print(urlBuilder.hostname);
        System.out.print(urlBuilder.port);
        System.out.print(urlBuilder.pathParam);
//        System.out.print(urlBuilder.queryParam);


    }
}
