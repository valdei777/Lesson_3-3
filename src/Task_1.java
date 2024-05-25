public class Task_1 {
    public static void main(String[] args) {
        // 1.Напишите программу, в которой переменная x объявляется 10 раз
        int x = 0;
        x1(x);

        System.out.println("Локальный х для main: " + x);


    }

    public static void x1(int i) {
        int x = i;
        System.out.println("Локальный х для х1: " + x);
        x2(x + 1);
    }

    public static void x2(int i) {
        int x = i;
        System.out.println("Локальный х для х2: " + x);
        x3(++x);
    }

    public static void x3(int i) {
        int x = i;
        System.out.println("Локальный х для х3: " + x);
        x4(++x);
    }

    public static void x4(int i) {
        int x = i;
        System.out.println("Локальный х для х4: " + x);
        x5(++x);
    }

    public static void x5(int i) {
        int x = i;
        System.out.println("Локальный х для х5: " + x);
        x6(++x);
    }

    public static void x6(int i) {
        int x = i;
        System.out.println("Локальный х для х6: " + x);
        x7(++x);
    }

    public static void x7(int i) {
        int x = i;
        System.out.println("Локальный х для х7: " + x);
        x8(++x);
    }
    public static void x8(int i) {
        int x = i;
        System.out.println("Локальный х для х8: " + x);
        x9(++x);
    }
    public static void x9(int i) {
        int x = i;
        System.out.println("Локальный х для х9: " + x);

    }

}
