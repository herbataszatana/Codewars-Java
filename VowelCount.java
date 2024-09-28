public class VowelCount {

    public static void main(String[] args){
        getCount("Samochod");
    }


    public static int getCount(String str) {
        str = str.toLowerCase();
        char[] chaArray = str.toCharArray();
        int count = 0;
        for(char c : chaArray){
            if(c =='a' || c =='e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
        }
        return count;
    }
}
