package medium;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //todo Задание №1
        double increment = 500_000;
        double result = 0;
        getCountIteration(increment, result);

        //todo Задание №2
        int[] arrayBefore = {1,1,1,1,1,1};
        int[] arrayAfter = getArrayWithChangeOddElement(arrayBefore);
        System.out.println(Arrays.toString(arrayAfter));

        //todo Задание №3
        boolean hasFuel = false;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = false;
        boolean hasWheelsProblem = false;
        autoService(hasFuel, hasElectricsProblem, hasMotorProblem, hasTransmissionProblem, hasWheelsProblem);

        //todo Задание №4
        Stock vodkaStock = new Stock(100);
        Employee firstEmployee = new Employee(1);
        Employee secondEmployee = new Employee(2);
        Employee thirdEmployee = new Employee(3);

        vodkaStock.addVodkaEmployee(firstEmployee);
        System.out.println("Количество водки на складе: " + vodkaStock.getVodka());
        System.out.println("Количество испорченного товара, первым работником: " + firstEmployee.getJournalDestroy());
        vodkaStock.addVodkaEmployee(secondEmployee);
        System.out.println("Количество водки на складе: " + vodkaStock.getVodka());
        System.out.println("Количество испорченного товара, первым работником: " + secondEmployee.getJournalDestroy());
        vodkaStock.addVodkaEmployee(thirdEmployee);
        System.out.println("Количество водки на складе: " + vodkaStock.getVodka());
        System.out.println("Количество испорченного товара, первым работником: " + thirdEmployee.getJournalDestroy());
    }

    private static void autoService(boolean hasFuel,
                                    boolean hasElectricsProblem,
                                    boolean hasMotorProblem,
                                    boolean hasTransmissionProblem,
                                    boolean hasWheelsProblem) {
        double account = 0;
        int sail = 0;
        if (hasElectricsProblem) {
            account += 5000;
            sail++;
        }
        if (hasMotorProblem) {
            account += 10_000;
            sail++;
        }
        if (hasTransmissionProblem) {
            account += 4000;
            sail++;
        }
        if (hasWheelsProblem) {
            account += 2000;
            sail++;
        }
        if (!(hasElectricsProblem || hasMotorProblem || hasTransmissionProblem || hasWheelsProblem) && !(hasFuel)) {
            account += 1000;
        }
        if (sail == 2) {
            account -= account * 0.1;
        }
        if ((hasElectricsProblem || hasMotorProblem) && hasTransmissionProblem) {
            account -= account * 0.2;
        }
        System.out.println("Ваш счет: " + account + "рублей");
    }

    private static int[] getArrayWithChangeOddElement(int[] arrayChange) {
        for (int i = 0; i < arrayChange.length; i++) {
            if (i % 2 == 0) {
                arrayChange[i] = 0;
            }
        }
        return arrayChange;
    }

    private static void getCountIteration(double increment, double result) {
        int count = 0;
        while (result < 1_000_000 && increment > 0) {
            result += increment;
            count++;
        }
        System.out.println(count);;
    }
}
