package b_practice.seminarOOP06SOLID.Ex01;

//public class Circle implements Shape{
//    @Override
//    public void drawCircle() {
//
//    }
//
//    @Override
//    public void drawSquare() {
//
//    }
//
//    @Override
//    public void drawRectangle() {
//
//    }
public class Circle implements DrawCircle{

    @Override
    public void drawCircle() {
        System.out.println("Draw Circle");
    }
}

