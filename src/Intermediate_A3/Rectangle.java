package Intermediate_A3;

public class Rectangle {

    public int width;
    public int height;
    public int area;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
        this.area = calcArea();
    }

    public int calcArea(){
        int area = this.width*this.height;
        return area;
    }
}
