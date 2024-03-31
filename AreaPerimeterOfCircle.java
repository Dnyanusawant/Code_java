class AreaPerimeterOfCircle
 {
    public static void main(String[] args) 
{
        double radius = 5.5;
        final double pi = 3.14;
        
        double area = pi * radius * radius;
        System.out.println("Area of the Circle: " + area + " square units");

        double perimeter = 2 * pi * radius;
        System.out.println("Perimeter of Circle: " + perimeter + " units");
    }
}
