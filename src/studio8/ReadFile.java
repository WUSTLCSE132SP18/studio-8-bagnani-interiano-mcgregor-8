package studio8;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {

        try {

            File file = new File("/Users/aprilbagnani/git/studio-8-bagnani-interiano-mcgregor-8/steps/data.csv");

            Scanner input = new Scanner(file);


            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] numbers = line.split(",");
                for(int i = 0; i<numbers.length; i++) {
                		System.out.println(numbers[i]);
                }
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}