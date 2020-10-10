package week1.classes;

public class Rectangle {

    private int width;
    private int height;
    private String color;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw(){
        int height = 1;
        int width = 1;
        String color = "Blue";
        if (this.height > 0) { height = this.height; }
        if (this.width > 0) { width = this.width; }
        if (this.color.length() > 2
                && this.color.length() <= 20
                && this.color.substring(0,1).equals(this.color.substring(0,1).toUpperCase())
                && this.color.substring(1,this.color.length()).equals(this.color.substring(1,this.color.length()).toLowerCase()))  {
                    color = this.color;
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(color.charAt(0));
            }
            System.out.println();
        }
        System.out.println();
    }

    private static boolean isNumber(String num) {
        try{
            int numTemp = Integer.parseInt(num);
            return true;
        }catch (NumberFormatException e) {
            return false;
        }
    }
}
