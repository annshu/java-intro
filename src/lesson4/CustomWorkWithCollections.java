package lesson4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomWorkWithCollections {
    /*1. Создать программу, в которой:
1.1. Формируется коллекция из строк типа ArrayList (5-6 строк)
1.2. Из коллекции удаляется одно из значений
1.3. Выполняется проверка, что коллекция больше не содержит удаленный объект (результат проверки выводится в консоль)
1.4. Выполняется сортировка объектов коллекции (Collections class в помощь)
1.5. Выполняется поочередный вывод строк в консоль до сортировки и после (Iterator class в помощь)

*/

    public static void main(String[] args){
            ArrayList<String> colors = new ArrayList<String>();
            colors.add("red");
            colors.add("blue");
            colors.add("green");
            colors.add("orange");
            colors.add("yellow");

            System.out.println("Colors. Input data: " + colors);

            Integer initial_size = colors.size();
            System.out.println("Initial size: " + initial_size);

            colors.remove("green");

            Integer output_size = colors.size();
            System.out.println("Output size: " + output_size);

            if (!colors.contains("green")){
                System.out.println("The element was deleted");

            }
            else {
                System.out.println("The element was not deleted");
            }

            System.out.println("Initial order after element was removed: ");

            Iterator colors_before_sorting = colors.iterator();
            while(colors_before_sorting.hasNext()) {
                Object element = colors_before_sorting.next();
                System.out.println(element);
            }
            System.out.println();

            Collections.sort(colors);

            System.out.println("Sorted order after element was removed: ");

            Iterator colors_after_sorting = colors.iterator();
            while(colors_after_sorting.hasNext()) {
                Object element = colors_after_sorting.next();
                System.out.println(element);
            }

        }


    }
