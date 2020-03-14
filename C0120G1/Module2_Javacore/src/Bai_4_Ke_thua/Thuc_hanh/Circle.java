package Bai_4_Ke_thua.Thuc_hanh;


    public class Circle extends Shape {
            private double radius=1.0;

            public Circle() {
            }
            public Circle(double radius) {
                this.radius = radius;
            }

            public Circle(double radius,String color,boolean filled) {
                super(color, filled);
                this.radius=radius;
            }
            public void setRadius(double radius) {
                this.radius = radius;
            }
            public double getRadius() {
                return this.radius;
            }
            public double getArea() {
                return Math.PI * Math.pow(getRadius(), 2);
            }
            public double getPerimeter() {
                return 2 * Math.PI * getRadius();
            }

            @Override
            public String toString() {
                return "A Circle with radius " + getRadius()
                        +" and Area: "+getArea()
                        + ",which is a subclass of " + super.toString();
            }
    }




