public class ValidPhoneNumber {
    public static void main(String[] args){
        validPhoneNumber("(123) 456-7890");
    }

    /*
    "(123) 456-7890"  => true
    "(1111)555 2345"  => false
    "(098) 123 4567"  => false     */
      public static boolean validPhoneNumber(String phoneNumber) {

          String regex = "\\(\\d{3}\\) \\d{3}-\\d{4}";

          return phoneNumber.matches(regex);}

}
