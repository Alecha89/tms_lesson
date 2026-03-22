/**
 * Created by Yushko Aliaksei on 22.03.2026
 */
public class Main {
    public static void main(String[] args) {
        //-------------Задача 1:
        System.out.println("-------------Задача 1:");
        Accountant accountant = new Accountant();
        Director director = new Director();
        Worker worker = new Worker();

        accountant.printPosition();
        director.printPosition();
        worker.printPosition();

        //-------------Задача 2:
        System.out.println("-------------Задача 2:");
        Shape[] shapes = new Shape[5];
        shapes[0] = new Triangle(3, 4, 5);       // Треугольник
        shapes[1] = new Rectangle(4, 6);     // Прямоугольник
        shapes[2] = new Circle(5);                 // Круг
        shapes[3] = new Triangle(6, 6, 6);      // Равносторонний треугольник
        shapes[4] = new Rectangle(2, 3);  // Маленький прямоугольник

        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.perimeter();
        }
        System.out.printf("Сумма периметров всех фигур: %.2f\n", totalPerimeter);

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        System.out.printf("Сумма площадей всех фигур: %.2f\n", totalArea);


    }
}