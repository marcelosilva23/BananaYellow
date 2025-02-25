package io.codeforall.kernelfc;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Playground {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("im a chicken");

        System.out.println("im also a chicken named rafael");
        System.out.println("LO Test");

        Rectangle rect = new Rectangle(10, 10, 700, 500);
        rect.draw();

        Pipe pipe = new Pipe(100);
    }
}