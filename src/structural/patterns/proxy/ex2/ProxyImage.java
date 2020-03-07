package proxy.ex2;

public class ProxyImage implements ImageAPI  {
    private String name;
    private RealImage realImage;

    ProxyImage(String name){
        this.name = name;
    }


    @Override
    public void displayImage() {
        if(realImage == null)
        {
            realImage = new RealImage(name);
        }
        realImage.displayImage();
    }
}
