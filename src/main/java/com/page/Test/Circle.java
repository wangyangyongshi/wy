package com.page.Test;

class Circle {
    private Double radius = 0.0;
    public static int count = 1;

    public Circle(Double radius) {
        this.radius = radius;
    }

    class Draw {
        public void drawSahpe() {
            System.out.println(radius);
            System.out.println(count);
        }
    }


}
