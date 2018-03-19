package lesson2;

public class CustomWorkWithStrings {
    /*
    1. В пакете lesson02 создать класс с методом eachNth,
     который принимает непустую строку и номер n.
     Метод должен возвращать строку, состоящую из каждого n-го символа, начия с 0-го.
      Например, для n=3, должны возвращаться 0, 3, 6, ... символы исходной строки, т.е.
everyNth("Miracle", 2) → "Mrce"
everyNth("abcdefg", 2) → "aceg"
everyNth("abcdefg", 3) → "adg"
2. Вызвать метод в главном методе (main) и проверить его работу на нескольких примерах.

     */
    public static void main(String[] args){
        eachNth("Miracle",2);
        eachNth("abcdefg",2);
        eachNth("abcdefg", 3);

    }

    public static String eachNth(String inputString, int n){
        System.out.println("Input: "+ inputString);
        int stringLength = inputString.length();
        String[] splitString = inputString.split("");
        String outputString = "";
        int index = 0;
        for (int i = 0; i < stringLength; i++) {
            index = n*i;
            if (index > stringLength)
            {
                break;
            }
            else
                {
                    outputString += splitString[index];
                }
        }
        System.out.println("Output: " + outputString);
        return outputString;
    }
}
