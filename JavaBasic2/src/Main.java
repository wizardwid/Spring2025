public class Main {
    public static void main(String[] args) {
        HelloWorld h1 = new HelloWorldEn();
        callMethod(h1);
    }
    public static void callMethod(HelloWorld h1){
        h1.sayHello();
    }
}