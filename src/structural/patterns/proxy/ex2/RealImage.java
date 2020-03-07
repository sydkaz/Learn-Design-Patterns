package proxy.ex2;

public class RealImage  implements ImageAPI{
        String name;

        RealImage(String name) {
            this.name = name;
            System.out.println("Constructor Real Image");
            loadFromDisk(name);
        }
        private void loadFromDisk(String fileName){
            System.out.println("Loading image from disk " + fileName);
        }

        @Override
        public void displayImage() {
            System.out.println("Loading image with name "+name);
        }
}
