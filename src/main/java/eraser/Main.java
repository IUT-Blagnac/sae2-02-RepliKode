package eraser;

public class Main {

    public static void main(String[] args) {
        String str = "T ex te  d e  Te st   : )";
        str = str.replaceAll("(?<! ) (?! )", "");
        System.out.println("résultats: " + str);
        System.out.println(Eraser.erase(args[1]));
    }
}
