package day01;

public class C01 {

    public static void main(String[] args) {


        System.out.println("Break Statement\n");
        for (int i = 1; i <= 5; i++) {

            if (i == 4) break;
            System.out.println(i);
        }
        System.out.println("Continue Statement\n");
        for (int i = 0; i <= 5; i++) {
            if (i == 1) continue;
            System.out.println(i);
        }
    }

}



