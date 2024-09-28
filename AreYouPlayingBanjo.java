public class AreYouPlayingBanjo {
    public static void main (String[] args){
        areYouPlayingBanjo("Anna");
        areYouPlayingBanjo("Robert");
    }

    public static String areYouPlayingBanjo(String name) {
        if (name.charAt(0) == 'R' || name.charAt(0) == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
