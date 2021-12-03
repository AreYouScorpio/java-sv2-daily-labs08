package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReader {




    public static void main(String[] args) {
        int min = new FileReader().findSmallestTemperatureSpread("weather.dat");
        String chosenClub = new FileReader().findSmallestDifference("football.dat");
        System.out.println(min);
        System.out.println(chosenClub);
    }


    private String findSmallestDifference(String filename){
        List<String> lines;
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/" + filename));


            int minSpread = 1000;
            String club = null;
            for (int i = 1; i < lines.size() - 5; i++) {
                String team = lines.get(i).substring(7, 21).trim();
                int F = Integer.parseInt(lines.get(i).substring(43, 45).trim());
                int A = Integer.parseInt(lines.get(i).substring(50, 52).trim());
                //System.out.println(F);
                //System.out.println(A);
                int spread2 = Math.abs(F - A);
                if (minSpread > spread2) {
                    minSpread = spread2;
                    club = team;

                }
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


