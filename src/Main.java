import java.util.Scanner;

public class Main {

    static String word = "rabbit";

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Guess the word");
        int lengthWord = word.length();
        String maskWord = "-".repeat(lengthWord);
        System.out.println(maskWord);

        do {
            System.out.println("Please, print letter");
            char c = input.next().charAt(0);
            if (word.indexOf(c) >= 0 ) {
                System.out.println("You're lucky boooy!");
                maskWord = "";
                for (char elem: word.toCharArray()) {
                    if (elem == c) {
                        maskWord+=c;
                    } else {
                        maskWord+="-";
                    }
                }
                System.out.println(maskWord);
            } else {
                System.out.println("Miss(. \n Try again");
            }
        } while(maskWord.contains("-"));
    }
}