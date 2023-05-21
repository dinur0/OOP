package LSP;

public class Rectangle extends Square {
    private int height;

    public void setHeight(int height) {
    this.height = height;
    }
    
    @Override
    public int area() {
    return super.width * this.height;
    }
}
