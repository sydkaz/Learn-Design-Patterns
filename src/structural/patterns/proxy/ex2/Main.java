package proxy.ex2;

public class Main {
    public static void main(String[] args){
        ProxyImage proxyImage = new ProxyImage("image1.jpg");
        proxyImage.displayImage();

        proxyImage.displayImage();

    }
}
