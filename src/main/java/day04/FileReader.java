package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {




    public static void main(String[] args) {
        int min = new FileReader().findSmallestTemperatureSpread("weather.dat");
        System.out.println(min);
    }
    private int findSmallestTemperatureSpread(String filename) {

        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/" + "weather.dat"));


            int minSpread = 1000;
            int minDay = 0;
            for (int i = 2; i < lines.size() - 1; i++) {
                int day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
                int max = Integer.parseInt(lines.get(i).substring(6, 8).trim());
                int min = Integer.parseInt(lines.get(i).substring(12, 14).trim());

                int spread = max - min;
                if (minSpread > spread) {
                    minSpread = spread;
                    minDay = day;
                }
            }
                return minDay;

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Can not read file", e);
        }
    }



    }


