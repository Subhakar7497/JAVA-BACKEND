// Using remove() method by values

import java.util.ArrayList;
import java.util.List;

public class remove {

    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<>();

        // Adding elements to ArrayList class
        // using add() method
        answer.add(10);
        answer.add(20);
        answer.add(30);
        answer.add(1);
        answer.add(2);

        System.out.println(answer);

        answer.remove(Integer.valueOf(1));

        answer.remove(Integer.valueOf(3));

        System.out.println(answer);
    }
}