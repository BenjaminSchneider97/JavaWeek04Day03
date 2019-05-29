package Advanced_A5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        String[] names = {
                "Gruber", "Huber", "Bauer", "Wagner", "Müller",
                "Pichler", "Steiner", "Moser", "Mayer", "Hofer",
                "Leitner", "Beger", "Fuchs", "Eder", "Fischer",
                "Schmid", "Winkler", "Weber", "Schwarz", "Maier",
                "Schneider", "Reiter", "Mayr", "Schmidt", "Wimmer"
        };

        Random random = new Random();

        Customer[] customers = new Customer[1000];

        for(int i = 0; i < customers.length; i++){
            customers[i] = new Customer(names[random.nextInt(names.length)], random.nextInt(100));
        }

        for(int i = 0; i < customers.length; i++){
            for(int j = i+1; j < customers.length; j++){
                if(customers[i].name.equals(customers[j].name) && customers[i].id == customers[j].id){
                    customers[j].name = "ESSEN";
                }
            }
        }

        int counter = 0;
        for(int i = 0; i < customers.length; i++){
            if(!customers[i].name.equalsIgnoreCase("ESSEN")){
                counter++;
                System.out.println(counter + ") Name: " + customers[i].name + ", ID: " + customers[i].id);
            }
        }
    }
}