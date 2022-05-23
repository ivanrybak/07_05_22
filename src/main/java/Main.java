import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    PassengerCar passengerCar=new PassengerCar("Vaz","red");
    passengerCar.drive();
    passengerCar.transportation();
    Truck truck=new Truck("kamaz","white");
    truck.drive();

        System.out.println(passengerCar.color+" "+passengerCar.name);

/*Number num= new Number();
num.summ();
num.unionString();*/



        //строка в составе другой :
        String str="a string as part of another string";
        String str1=" as Part of another ";
        String str2="A String As part of another string";
        System.out.println(str.contains(str1));   //ищет строку в составе другой, чувствительна к регистру   true
        System.out.println(str.equals(str2));     // сравнивает две строки, чувствительна к регистру         false
        System.out.println(str.equalsIgnoreCase(str2));//сравнивает две строки, не чувствительна к регистру   true

        System.out.println(str.toLowerCase().contains(str1.toLowerCase())); //ищет строку в составе другой, при этом сопоставляет регистр
// OR
       System.out.println(str.toUpperCase().contains(str1.toUpperCase())); //

        int a=1;
        int b=2;
        System.out.println(a!=b); //сравнение двух чисел


        //переопределение метода equals, для сравнения двух объектов

            Man man1=new Man();
            man1.x=123;
            Man man2=new Man();
            man2.x=122;
            System.out.println("сравнение объектов: "+man1.equals(man2)); //false


    //преобразование строки в число:
        String str3="444";
        int number=Integer.parseInt(str3);
        System.out.println(number);

      //сравнение двух массивов. метод Array.equals:
      int[]f={1,3,5};
      int[]d={1,3,6};
        System.out.println(Arrays.equals(f,d)); //(надо добавить класс import java.util.Arrays;) false

        //нахождение числа в массиве:
        int index=Arrays.binarySearch(f,3);
        System.out.println(index); // выдаст индекс 1;
        // если числа такого числа в массиве нет, то выдавать будет отрицательное число


        //Работа со списками массивов
        ArrayList<String>people=new ArrayList<String>();
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(0,"Bob"); //добавляем в список элемент по индексу

        System.out.println(people);  //  [Bob, Tom, Alice, Kate, Sam]
        System.out.println(people.get(2)); //получение второго объекта  Alice

        people.set(2,"Jerry");  //присвоение элементу под индексом 2 нового значения

        System.out.println("ArrayList has %d elements: "+ people.size()); //выводит общее количество всех элементов : 5


        //вывод по очереди всех элементов
        for (String person:people) {
            System.out.println(person);
        }/*Bob
        Tom
        Jerry
        Kate
        Sam*/



        //проверка наличия элемента в списке
            if(people.contains("Tom")){
                System.out.println("ArrayList contains Tom");

            }

         //удаление элементов:
        people.remove(1);  //по индексу
        people.remove("Jerry"); // по названию

        //преобразование списка в массив
        Object[] peopleArray=people.toArray();
        for (Object person:peopleArray){
            System.out.println(person);
         /*  Bob
             Kate
             Sam */
        }


        //ввод чисел через консоль в массив
Scanner console=new Scanner(System.in);
        int[]array=new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=console.nextInt();

        }
        for (int i = 9; i >=0 ; i--) {   //вывод чисел массива в консоль в обратном порядке
            System.out.println(array[i]);

        }







        }



    }


