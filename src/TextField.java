public class TextField implements Widget{
    private int width;
    private int height;

    public TextField(int width, int height){
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Text Field with height: " + height + " and width " + width + ".");
    }
}
