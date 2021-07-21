package ua.hillel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PointList list = new PointList();
        int x,y,radius;

        System.out.println("Создайте окружность");
        System.out.print("Введите X центра: ");
        x = s.nextInt();
        System.out.print("\nВведите Y центра: ");
        y = s.nextInt();
        System.out.print("\nВведите радиус: ");
        radius = s.nextInt();
        Circle circle = new Circle(x,y,radius);


	    while (true){
            System.out.println("Создать точку?(1-Да/2-Нет)");
            if(s.nextInt() == 1){
                System.out.print("Введите X точки: ");
                x = s.nextInt();
                System.out.print("\nВведите Y точки: ");
                y = s.nextInt();
                Point point = new Point(x,y);
                list.add(point);
            }else{
                break;
            }
        }
        System.out.print("Точки входящие в окружность: ");
	    for(int i =0; i<list.returnSize();i++){
	        if(circle.placedInCircle(list.get(i))){
                System.out.printf("(%s,%s)",list.get(i).getX(),list.get(i).getY());
            }
        }
    }
}
