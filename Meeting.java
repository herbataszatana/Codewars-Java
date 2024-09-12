import java.util.Arrays;

public class Meeting {
    public static void main(String[] args){
        meeting("Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;");
    }

    //s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
    public static String meeting(String s) {
        // your code
        String guests[]  = s.toUpperCase().split(";");

        Arrays.sort(guests, (a, b) -> {
            String[] nameA = a.split(":");
            String[] nameB = b.split(":");
            int lastNameComparison = nameA[1].compareTo(nameB[1]);
            return lastNameComparison != 0 ? lastNameComparison : nameA[0].compareTo(nameB[0]);
        });
        return "";
    }

}
