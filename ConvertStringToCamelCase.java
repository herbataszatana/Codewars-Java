public class ConvertStringToCamelCase {

    public static void main (String[] args){
        toCamelCase("WAstt-dfsf_ff");
    }

    static String toCamelCase(String s){
        char[] charsArray = s.toCharArray();
        StringBuilder result = new StringBuilder();

        boolean toUpperCase = false;
        for (int i = 0; i < charsArray.length; i++) {
            if (charsArray[i] == '_' || charsArray[i] == '-') {
                toUpperCase = true;
            } else {
                if (toUpperCase) {
                    result.append(Character.toUpperCase(charsArray[i]));
                    toUpperCase = false;
                } else {
                    result.append(charsArray[i]);
                }
            }
        }
        return result.toString();
    }
}
