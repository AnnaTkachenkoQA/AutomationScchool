package homework7;

public class ReplaceSymbolsInString {
    public static void main(String[] args) {
        String defaultString= "Это ##тестовый пример## для задачи ##на## строки";
        String onlyAString= defaultString.replaceAll(" ##", " <");
        String finalString= onlyAString.replaceAll("## ", "> ");

        System.out.println(finalString);

    }

}
