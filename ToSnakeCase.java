package homework7;

public class ToSnakeCase {

    public static void main(String[] args) {


        String[] arrDefault = {"myAwsomePhrase", "iLoveJustinBieber", "captainJackSparrow"};

        for (int i = 0; i <= arrDefault.length-1; i++) {
            String replaceString = arrDefault[i].replaceAll("([A-Z]+)", "\\_$1").toLowerCase();
            System.out.println(replaceString);
        }
    }
}
