package huhu.oopain;

import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DecisionAndLoopsHomework {

    public static void main(String[] args) throws FileNotFoundException {
        //guessNumber();
        guessWord();
    }

    static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        final int SECRET_NUMBER = (int) (Math.random() * 100);
        guessNumber(SECRET_NUMBER, sc);

    }

    static void guessNumber(int n, Scanner in) {
        int cnt = 0;
        while (true) {
            System.out.println("Key in your guess: ");
            int guess = in.nextInt();
            ++cnt;
            if (guess == n) {
                System.out.println("You got it in " + cnt + " trial!");
                return;
            } else if (guess < n) {
                System.out.println("Try bigger!");
            } else {
                System.out.println("Try lower!");
            }
        }
    }

    public static void guessWord() throws FileNotFoundException {
        FileInputStream inFile = new FileInputStream("G:\\java\\OOPAIN\\in.txt");
        String[] words = new String[100];
        int cnt = 0;
        Scanner sc = new Scanner(inFile);
        try {
            while (sc.hasNextLine()) {
                words[cnt++] = sc.nextLine();
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
        Scanner in = new Scanner(System.in);
        int random = (int) (Math.random() * cnt);
        guessWord(words[random], in);
    }

    public static void guessWord(String word, Scanner in) {
        int cnt = 0;
        boolean[] checkWord = new boolean[word.length()];
        for (int i = 0; i < word.length(); ++i) checkWord[i] = false;
        while (true) {
            System.out.print("Key in one character or your guess word :  ");
            String guessWord = in.nextLine();
            System.out.print("Trial " + (++cnt) + " : ");
            if (guessWord.length() == 1) {
                for (int i = 0; i < word.length(); ++i) {
                    if (word.charAt(i) == guessWord.charAt(0)) {
                        checkWord[i] = true;
                        System.out.print(guessWord.charAt(0));
                    } else if (checkWord[i]) {
                        System.out.print(word.charAt(i));
                    } else {
                        System.out.print("_");
                    }
                }
            } else {
                if (word.equals(guessWord)) {
                    System.out.println("Congratulation !");
                    break;
                } else {
                    System.out.println("Wrong answer ! Try again");
                }
            }
            System.out.println();
        }
        System.out.println("You got in " + cnt + " trials");
    }
}
