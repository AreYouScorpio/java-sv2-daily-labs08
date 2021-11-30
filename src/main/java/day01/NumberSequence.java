package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NumberSequence {
    public static List<Integer> numbers = new ArrayList<>();
    int piece;
    int min;
    int max;



    public NumberSequence(List<Integer> numbers) {
        this.numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(this.numbers.toString());
    }

    public NumberSequence(int piece, int min, int max) {

                Random rand = new Random();
        for (int i=0; i<piece; i++) {
            int randomNumber = min + (int) (Math.random() * (max - min + 1));
            this.numbers.add(randomNumber);};
        System.out.println(this.numbers.toString());
                    }




    public List<Integer> closeToAverage(int value) {
    List<Integer> collected = new ArrayList<>();
    int sum = 0;
    int counter = 0;
    for (int i = 0; i<numbers.size(); i++){
        sum+= numbers.get(i);
                counter++;
        }
        System.out.println(sum);
        System.out.println(counter);
    double average = sum/(counter*1.00);
        System.out.println(average);
    for (int i=0; i<numbers.size(); i++){
        if (!(numbers.get(i)>(average+value))) {
            if (!(numbers.get(i)<(average-value) )) {collected.add(numbers.get(i));}
    }}
        System.out.println(collected.toString());
    return collected;
    }

    public static void main(String[] args) {
        NumberSequence numberSequence = new NumberSequence(5,1,8);
        System.out.println(numberSequence.closeToAverage(2).toString());
        //NumberSequence numberSequence2 = new NumberSequence(numbers);
        //System.out.println(numberSequence2.closeToAverage(2).toString());


    }

}
