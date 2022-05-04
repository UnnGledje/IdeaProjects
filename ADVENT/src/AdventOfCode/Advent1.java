package AdventOfCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Advent1 {
    String readLine = null;
    List<Integer> data = new ArrayList<>();
    List<Integer> bigger = new ArrayList<>();

    Advent1() {
        try (FileReader filereader = new FileReader("src/InputAdvent1.txt");
             BufferedReader bufIn = new BufferedReader(filereader);) {
            while ((readLine = bufIn.readLine()) != null) {
                data.add(Integer.valueOf(readLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        /*
        for(int i = 0; i < data.size(); i++) {
            if (data.get(0) < data.get(i + 1)) {
                i++;
                bigger.add(data.get(i));
                System.out.println(bigger.size());
            }
        }

         */

        public int run1(){
            int count = 0;
            for(int i = 1; i < data.size(); i++) {
                if(data.get(i) > data.get(i - 1)) {
                    count++;
                }
            }
            return count;
        }

        public int run2(){
            int count = 0;
            for(int i = 0; i < data.size() - 3; i++) {
                int sumA = data.get(i) + data.get(i + 1) + data.get(i + 2);
                int sumB = data.get(i + 1) + data.get(i + 2) + data.get(i + 3);

                if(sumB > sumA) {
                    count++;
                }
            }

            return count;
        }


       /* for(int d : data){  i++;
            if(d > d + 1){
                d++;
                bigger.get(d);
                System.out.println("amount of numbers:" + bigger.size());
            } if(d < d+1){
                System.out.println(data.size());
            }
        }
        */
        // pData.add(readLine);
        //System.out.println(data);

            public static void main(String[] args){
                Advent1 a1 = new Advent1();
                System.out.println(a1.run1());
                System.out.println(a1.run2());
            }
        }
