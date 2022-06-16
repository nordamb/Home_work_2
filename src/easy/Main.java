package easy;

public class Main {

    public static void main(String[] args) {
        //todo Задание №1
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            System.out.print("a");
            System.out.print(" ");
        }
        System.out.println();

        //todo Задание №2
        int ageChildren = 6;
        getChildrenPosition(ageChildren);

        //todo Задание №3
        boolean chicken = false;
        boolean vegetables = true;
        boolean sour = false;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;
        getSalad(chicken, vegetables, sour, toast, sausage, eggs);
    }

    private static void getSalad(boolean chicken,
                                 boolean vegetables,
                                 boolean sour,
                                 boolean toast,
                                 boolean sausage,
                                 boolean eggs) {
        if (chicken && sour && vegetables && toast) {
            System.out.println("Цезарь");
        } else if (vegetables && eggs && (sausage || chicken)) {
            System.out.println("Оливье");
        } else if (vegetables) {
            System.out.println("Овощной");
        } else {
            System.out.println("У меня ничего нет");
        }
    }

    private static void getChildrenPosition(int ageChildren) {
        if (ageChildren < 6) {
            System.out.println("Пошел в сад");
        } else if (ageChildren < 11) {
            System.out.println("Пошел в младшую школу");
        } else if (ageChildren < 17) {
            System.out.println("Пошел в старшую школу");
        } else {
            System.out.println("Пошел в университет");
        }
    }
}
