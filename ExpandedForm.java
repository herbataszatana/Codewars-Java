public class ExpandedForm {
    public static void main(String[] args){
        expandedForm(324);
    }


    public static String expandedForm(int num)
    {
        String returnValue = "";
        String string = String.valueOf(num);
        int lenght = string.length();
        int dif = 0;
        for(int x=0; x < string.length() ; x++){
            dif = string.length()- x;
            string.charAt(x);
            returnValue.concat(String.valueOf(string.charAt(x)));
            if (dif > 0){
                returnValue.concat("0");
            }
        }

        return "";
        //your code here
    }
    //int number = 12345; // Example number
    //        int roundedDown = (number / 1000) * 1000;
}
