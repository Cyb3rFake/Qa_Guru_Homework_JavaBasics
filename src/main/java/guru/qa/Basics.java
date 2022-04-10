package guru.qa;

public class Basics {
    private Object my_var;
    public static String getType(Object my_var){
        String type = ((Object)my_var).getClass().getTypeName();
        return type;
    }
    public static void main(String[] args) {

        //Типы данных
        char aChar;
        aChar = '$';             // Character
        boolean aFlag = false;                // Boolean
        byte aByte = Byte.MAX_VALUE;         // 128 to 127
        short aShort = Short.MAX_VALUE;      // -32,768 to 32,767
        int aInt = Integer.MAX_VALUE;        //2,147,483,648 to 2,147,483,647
        long aLong = Integer.MAX_VALUE;      //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float aFloat = 1.2F;                 // Floating point number 6 to 7 decimal digits
        double aDouble = 1.2D;               // 15 decimal digits
        String aString = " sdf";                // String

        System.out.println("aFlag is a \""+ getType(aFlag)+"\"");
        System.out.println("aChar is a \""+ getType(aChar)+"\"");
        System.out.println("aByte is a \""+ getType(aByte)+"\"");
        System.out.println("aShort is a \""+ getType(aShort)+"\"");
        System.out.println("aInt is a \""+ getType(aInt)+"\"");
        System.out.println("aLong is a \""+ getType(aLong)+"\"");
        System.out.println("aLFloat is a \""+ getType(aFloat)+"\"");
        System.out.println("aDouble is a \""+ getType(aDouble)+"\"");
        System.out.println("aString is a \""+ getType(aString)+"\"");

        System.out.println(" ");
        System.out.println("Переполнеине типа aByte " + aByte+20000+" "+ getType(aByte)); //переполнение в большую сторону
        System.out.println(aByte-20000565); //переполнение в большую сторону
        System.out.println(aByte + aDouble); //сложение типов byte и double


        //Логические операторы(if, else, ese if,)
        System.out.println(" ");
        System.out.println("//Логические операторы(if, else, ese if,)");
        int temperature = 9;
        if (temperature > 30)
            System.out.println("жарко");
        else {
            if (temperature > 10 && temperature<=25)
                System.out.println("прохладно");
            else {
                if (temperature > 0)
                    System.out.println("холодно");
                else
                    System.out.println("очень холодно");
                }
        }

        //пример исполизования (switch case)
        System.out.println(" ");
        System.out.println("пример исполизования (switch case)");

        int day = 3;
        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            }

        //пример использования оператора (for())
        System.out.println("пример использования оператора (for())");
        for(int i=1;i<11;i++){
            System.out.println();
            for(int j=1;j<11;j++){
                System.out.print(i * j + " ");
            }
        }

        //пример использования оператора (while)
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("пример использования оператора (while)");
        int number = 3; // Возводимое в степень число
        int result = 1; // Результат возведения в степень
        int power = 1; // Начальный показатель степени
        while(power <= 10) { // условие входа в цикл
            result = result * number;
            System.out.println(number + " в степени " + power + " = " + result);
            power++;
        }

        }
    }

