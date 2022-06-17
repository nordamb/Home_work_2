package hard;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        getFivePopularRegion(data).forEach(System.out::println);
        System.out.println(getSpecCarNumber(data));
    }
    //todo: Задание 1
    static List<Map.Entry<Integer, Integer>> getFivePopularRegion(Map<Integer, Map<String, String[]>> data) {
        Map<Integer, Integer> countNumberRegion = new HashMap<>();
        for (Map.Entry<Integer, Map<String, String[]>> item : data.entrySet()) {
            String[] numbersCar = item.getValue().get("input");
            for (String numberCar : numbersCar) {
                if(data.containsKey((Integer.parseInt(numberCar.split("[А-Я]+")[2])))) {
                    if (countNumberRegion.containsKey(item.getKey())) {
                        countNumberRegion.computeIfPresent(item.getKey(), (k, v) -> ++v);
                    } else {
                        countNumberRegion.put(item.getKey(), 0);
                    }
                }
            }
        }
        return countNumberRegion.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed()).limit(5).collect(Collectors.toList());
    }

    //todo: Задание 2
    static int getSpecCarNumber(Map<Integer, Map<String, String[]>> data) {
        Set<String> countSpecNumber = new HashSet<>();
        for (Map.Entry<Integer, Map<String, String[]>> item : data.entrySet()) {
            Map<String, String[]> numbersCar = item.getValue();
            for (String[] arrayNumberCar : numbersCar.values()) {
                for (String numberCar : arrayNumberCar) {
                    if(numberCar.split("\\d+")[0].contains("М") && numberCar.split("\\d+")[1].contains("АВ")) {
                        countSpecNumber.add(numberCar);
                    }
                }
            }
        }
        return countSpecNumber.size();
    }
}
