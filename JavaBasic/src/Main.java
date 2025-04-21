public class Main {
    public static void main(String[] args) {
        HelloWorldKr hello1 = new HelloWorldKr();
        callMethod(hello1);
    }
    public static void callMethod(HelloWorldKr h1){
        h1.sayHello();
    }
}