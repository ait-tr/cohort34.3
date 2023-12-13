package homework.passengers;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StatisticsImpl implements Statistics {

    File file;
    String delimeter; // это разделитель

    public StatisticsImpl(File file, String delimeter) {
        this.file = new File(String.valueOf(file));
        this.delimeter = delimeter;
    }

    // Метод, который читает данные из файла.
    // Возвращает поток, в котором на конвейере String[]
    private Stream<String[]> getData(BufferedReader br) {
        return br.lines().skip(1).map(s -> s.split(delimeter)); // skip(1) - пропускает 1-ю строку
    }

    // c[10] - стоимость поездки
    @Override
    public double totalFares() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return getData (br)
                    .map(c -> c[10])
                    .mapToDouble(Double::parseDouble)
                    .sum();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    // c[2] - класс каюты
    @Override
    public Map<String, Double> avgFaresByClasses() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return getData(br).collect(
                    Collectors.groupingBy(c -> c[2], Collectors.averagingDouble(c -> Double.parseDouble(c[10]))));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    // c[1] - выжил или нет
    @Override
    public Map<String, Long> totalSurvived() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return getData(br).collect(
                    Collectors.groupingBy(c -> c[1].equals("1") ? "Survived" : "Non survived", Collectors.counting()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    // c[5] - пол
    @Override
    public Map<String, Long> totalSurvivedByGender() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return getData(br)
                    .collect(Collectors.groupingBy(c -> survivedGender(c[5], c[1]), Collectors.counting()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }

    private String survivedGender(String gender, String survived) {
        survived = survived.equals("1") ? "survived" : "non survived";
        return gender + " " + survived;
    }

    @Override
    public Map<String, Long> totalSurvivedChildren() {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return getData(br)
                    .filter(c -> c[6] != null && !c[6].isEmpty())
                    .filter(c -> Double.parseDouble(c[6]) < 18)
                    .collect(Collectors.groupingBy(c -> c[1].equals("1") ? "Survived" : "Non survived",
                            Collectors.counting()));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new HashMap<>();
    }
}
