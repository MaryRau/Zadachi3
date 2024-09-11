// задача 8
abstract class Shape {
    public abstract float getArea();
}

class Circle extends Shape{
    public int r;
    @Override
    public float getArea() {
        return (float) (Math.PI * Math.pow(r, 2));
    }
}

class Rectangle extends Shape{
    public int a;
    public int b;

    @Override
    public float getArea() {
        return a*b;
    }
}