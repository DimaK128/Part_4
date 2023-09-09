import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("Hi, I can recommend a book based on your age and the genre of books you are interested in.");
            System.out.println("May I know your name? ");
            String name = scanner.nextLine();

            System.out.println("How old are you, " + name + "? ");
            int age = scanner.nextInt();

            System.out.println("What is your favorite book genre? ");
            scanner.nextLine();
            String genre = scanner.nextLine();
            recommendBook(age, genre, name);

            System.out.println("Do you want to continue Yes or No? ");
            continueChoice = scanner.next().charAt(0);
            scanner.nextLine();
        } while (continueChoice == 'Y' || continueChoice == 'y');

        System.out.println("Bye!");
        scanner.close();
    }

    public static void recommendBook(int age, String genre, String name) {
        if (age >= 10 && age <= 18) {
            if (genre.equalsIgnoreCase("detective")) {
                System.out.println("Based on your answers, " + name + ", I recommend you the book named:");
                System.out.println("The Hound of the Baskervilles by Arthur Conan Doyle");
            }
        } else if (age >= 18 && age <= 44) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                System.out.println("Based on your inputs, " + name + ", I recommend you the book named:");
                System.out.println("How Big Things Get Done by Bent Flyvbjerg");
            }
        }
        if (age >= 18 && age <= 44) {
            if (genre.equalsIgnoreCase("detective")) {
                System.out.println("Based on your answers, " + name + ", I recommend you the book named:");
                System.out.println("Murder on the Orient Express by Agatha Christie");
            }
        } else if (age >= 10 && age <= 18) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                System.out.println("Based on your inputs, " + name + ", I recommend you the book named:");
                System.out.println("In Cold Blood by Truman Capote");
            }
        }
        if (age >= 45 && age <= 74) {
            if (genre.equalsIgnoreCase("detective")) {
                System.out.println("Based on your answers, " + name + ", I recommend you the book named:");
                System.out.println("The Maltese Falcon by Dashiell Hammett");
            }
        } else if (age >= 75) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                System.out.println("Based on your inputs, " + name + ", I recommend you the book named:");
                System.out.println("The Name of the Rose by Umberto Eco");
            }
        }
        if (age >= 75) {
            if (genre.equalsIgnoreCase("detective")) {
                System.out.println("Based on your answers, " + name + ", I recommend you the book named:");
                System.out.println("The Big Sleep by Raymond Chandler");
            }
        } else if (age >= 45 && age <= 74) {
            if (genre.equalsIgnoreCase("non-fiction")) {
                System.out.println("Based on your inputs, " + name + ", I recommend you the book named:");
                System.out.println("In the Woods by Tana French");
            }
        }
    }
}



