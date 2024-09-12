import java.util.ArrayList;
import java.util.HashMap;

public class GoodVsEvil {

    public static void main(String[] args){
        battle("Hobbits, Men, Elves, Dwarves, Eagles, Wizards", "Orcs, Men, Wargs, Goblins, Uruk Hai, Trolls, Wizards");
    }
    public static String battle(String goodAmounts, String evilAmounts) {
        int goodScore = 0;
        int evilScore = 0;

        goodAmounts = goodAmounts.replace(String.valueOf(","), "");
        String[] goodAmountsArray = goodAmounts.split("\\s+");


        for(String warior : goodAmountsArray){
            if (warior.equals("Hobbits") ){
                goodScore = goodScore + 1;
            }
            if (warior.equals("Men")){
                goodScore = goodScore + 2;
            }
            if (warior.equals("Elves") || warior.equals("Dwarves")){
                goodScore = goodScore + 3;
            }
            if (warior.equals("Eagles") ){
                goodScore = goodScore + 4;
            }
            if (warior.equals("Wizards")){
                goodScore = goodScore + 10;
            }
        }

        /*
        Orcs: 1
Men: 2
Wargs: 2
Goblins: 2
Uruk Hai: 3
Trolls: 5
Wizards: 10
         */
        evilAmounts = evilAmounts.replace(String.valueOf(","), "");
        String[] evilAmointsArray = evilAmounts.split("\\s+");

        for(String warior : evilAmointsArray){
            if (warior.equals("Orcs") ){
                evilScore = evilScore + 1;
            }
            if (warior.equals("Men")  || warior.equals("Wargs")|| warior.equals("Goblins")){
                evilScore = evilScore + 2;
            }
            if (warior.equals("Uruk Hai")  ){
                evilScore = evilScore + 3;
            }
            if (warior.equals("Trolls") ){
                evilScore = evilScore + 5;
            }
            if (warior.equals("Wizards")){
                evilScore = evilScore + 10;
            }
        }
        String returnMessage = null;
        if(evilScore > goodScore){
            returnMessage = "Battle Result: Evil eradicates all trace of Good";
        }
        if (evilScore< goodScore){
            returnMessage = "Battle Result: Good triumphs over Evil";
        }
        if (evilScore == goodScore) {
            returnMessage = "Battle Result: No victor on this battle field";
        }
        return returnMessage;}
}
