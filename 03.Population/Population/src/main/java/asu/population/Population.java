package asu.population;

public class Population {

    public static void main(String[] args) {
        //Given: current pop, birth rate, death rate, imig. rate
        //predict the population for 5 years
        //a birth every 7 seconds
        //a death every 13 seconds
        
        //an immigrant every 45 seconds.
        int pop = 312032486;
        System.out.println("pop year 0 = " + pop);
        int n = 365 * 24 * 60 * 60;
        int births = n / 7;
        int deaths = n / 13;
        int immigrants = n / 45;
        int net = births + immigrants - deaths;
        int years = 5;
        for (int i = 1; i <= years; i = i + 1){
            pop = pop + net;
            System.out.println("pop year " + i + " = " + pop);
        }
    }

}
