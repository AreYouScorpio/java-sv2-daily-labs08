package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderAkos {




    public static void main(String[] args) {
        int min = new FileReaderAkos().findSmallestTemperatureSpread("weather.dat");
        String chosenClub = new FileReaderAkos().findSmallestDifference("football.dat");
        System.out.println(min);
        System.out.println(chosenClub);
    }


    private String findSmallestDifference(String filename){
        List<String> lines2;
        try {
            lines2 = Files.readAllLines(Paths.get("src/main/resources/" + filename));


            int minSpread = 1000;
            String club = null;
            for (int i = 1; i < lines2.size() - 5; i++) {
                if (i!=18) {
                String team = lines2.get(i).substring(7, 22).trim();
                int F = Integer.parseInt(lines2.get(i).substring(43, 45).trim());
                int A = Integer.parseInt(lines2.get(i).substring(50, 52).trim());
                int spread2 = Math.abs(F - A);
                if (minSpread > spread2) {
                    minSpread = spread2;
                    club = team;

                }}
            }
            return club;

        } catch (IOException e) {
            e.printStackTrace();
            throw new IllegalStateException("Can not read file", e);
        }
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


