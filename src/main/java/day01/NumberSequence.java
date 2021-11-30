package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberSequence {

    public static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
    int piece;
    int min;
    int max;



    public NumberSequence(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public NumberSequence(int piece, int min, int max) {
        this.numbers = numbers;
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
        NumberSequence numberSequence = new NumberSequence(5,5,5);
        System.out.println(numberSequence.closeToAverage(2).toString());


    }

}
