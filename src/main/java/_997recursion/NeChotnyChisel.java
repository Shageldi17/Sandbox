package _997recursion;

public class NeChotnyChisel {
    public static void main (String[] args ){
        for (int i = 1; i < 100; i++){
            if (i % 2 == 1) {                    //    14 / 2 = 7 остаток 0        15 / 2 = 7 остаток 1        16 / 2 = 8 остаток 0
                System.out.println(i);
            }
        }
    }
}

// 1 / 2 = 0.5 = 0
// 2 / 2 = 1
// 3 / 2 = 1.5 = 1
// 4 / 2 = 2

// 1 % 2 = 0 остаток 1 = 1
// 2 % 2 = 1 остаток 0 = 0
// 3 % 2 = 1 остаток 1 = 1
// 4 % 2 = 2 остаток 0 = 0
