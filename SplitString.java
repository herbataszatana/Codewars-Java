public class SplitString {

    public static void main(String[] args){
        solution("soreS");
    }

    public static String[] solution(String s) {
        //Write your code here
        String[] finalArray;
        if(s.length()%2 !=0){
            finalArray = new String[(s.length()+1)/2];
            s = s + "_";
        }
        else {
            finalArray = new String[s.length()/2];
        }
        int j =0;
        for (int i = 0; i < s.length(); i += 2) {
            finalArray[i / 2] = s.substring(i, i + 2);
        }
        return finalArray;
    }
}

/*
Complete the solution so that it splits the string into pairs
of two characters. If the string contains an odd number of
characters then it should replace the missing second character
of the final pair with an underscore ('_').
 */
