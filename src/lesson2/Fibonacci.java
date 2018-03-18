package lesson2;

public class Fibonacci {
    /*
    Числа ряда Фибоначчи
1. В пакете lesson02 создать класс Fibonacci с методом printFibonacciNumbers,
 который выводит числа ряда Фибоначчи в консоль.
 Предусмотреть, чтоб количество выводимых чисел было параметром этого метода.
2. Вызвать метод в главном методе (main) и проверить его работу.

!!! Numeration in list starts from 1

    */

    public static void main(String[] args){
        printFibonacciNumbers(0);
        printFibonacciNumbers(1);
        printFibonacciNumbers(20);

    }

    public static void printFibonacciNumbers(int count){
        System.out.println("Fibonacci numbers for:"+ count);
        if (count == 1){
            System.out.println(0);
        }
        else if (count == 2){
            System.out.println(0);
            System.out.println(1);
        }
        else if (count > 2){
            System.out.println(0);
            System.out.println(1);
            int current = 1;
            int previous = 0;
            for (int i=0;i < (count-2); i++){
                int temp = current;
                current = current + previous;
                previous = temp;
                System.out.println(current);
            }
        }
        else {
            System.out.println("Incorrect value " + count);
        }

    }

}
