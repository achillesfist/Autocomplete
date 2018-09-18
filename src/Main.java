import java.util.Scanner;

/**
 * This is the class you would run to start the application.
 *
 */

public class Main {
    public static void main(String args[]){
        AutocompleteProvider acp = new AutocompleteProvider();

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("To train a passage, type an entire sentence ending with a period, question mark or exclamation point.");
            System.out.println("To get autocomplete suggestions, type a fragment (with no punctuation).");
            System.out.println("To quit, type a single period.");


            while (true) {
                System.out.print("Input: ");
                String input = scanner.nextLine();
                char last = input.charAt(input.length() - 1);
                if (last == '.' || last == '?' || last == '!' ) {
                    if (input.length() == 1) {
                        break;
                    } else {
                        acp.train(input);
                    }
                } else {
                    System.out.println(acp.getWords(input));
                }
            }

        }catch(Exception e){
            System.out.println("Some exception was thrown!");
        }

    }
}
