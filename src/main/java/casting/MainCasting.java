package casting;

public class MainCasting {

    public static void main(String[] args) {

        int num1 = 3;
        double num2 = num1;

        double num3 = 3.9999;
        int num4 = (int) num3;
        System.out.println(num4);

        long num5 = 5;
        int num6 = (int) num5;

        float num7 = 2.7f;

        // todo float <-> double - показать когда кастинг нужен, а когда не нужен

//        Тип	Размер (байт),
//
//        byte	1	        -128 .. 127	0	Самое маленькое целое — один байт
//        short	2       	-32,768 .. 32,767	0	Короткое целое, два байта
//        int	4	        -2*109 .. 2*109	0	Целое число, 4 байта
//        long	8        	-9*1018 .. 9*1018	0L	Длинное целое, 8 байт
//        float	4           -1038 .. 1038	0.0f	Дробное, 4 байта
//        double  8	       -10308 .. 10308	0.0d	Дробное, двойной длины, 8 байт
//        boolean  1	    true, false	false	Логический тип (только true & false)
//        char	  2	        0 .. 65,535	'\u0000'	Символы, 2 байта, все больше 0

        float num8 = 7.5f;
        double num9 = num8;
        System.out.println(num9);

        double x = 9.3;
        float y = (float) x;
        System.out.println(y);


    }
}