// задача 14
class Point {
    private int x;
    private int y;

    public int getX() {return x;}
    public int getY() {return y;}
}

class Rectangle_2{
    private Point topLeft = new Point();
    private Point bottomRight = new Point();

    public Rectangle_2(Point first, Point second)
    {
        this.topLeft = first;
        this.bottomRight = second;
    }

    public float getArea() {
        float width = bottomRight.getX() - topLeft.getX();
        float height = topLeft.getY() - bottomRight.getY();
        return width * height;
    }
}