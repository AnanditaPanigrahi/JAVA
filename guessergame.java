import java.util.Scanner;

public class guessergame {
    public static void main(String[] args) {
        // Generate a random number between 1 and 100
        int randomNumber = (int) (Math.random() * 100) + 1;
        int attempts = 0;//we start the count from zero, ensuring that the first guess is counted as the first attempt.
        boolean guessedCorrectly = false;//to control the flow of the loop.It ensures that the loop continues to run as long as the game conditions are not met (e.g., the correct number has not been guessed).
        Scanner scanner = new Scanner(System.in);

        // Loop until the user guesses the correct number
        while (!guessedCorrectly) {
            System.out.print("Guess a number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            attempts++;

            // Check if the user's guess is correct
            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                guessedCorrectly = true;
            } else if (userGuess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Your guess is too low. Try again.");
            }
        }

        scanner.close();
    }
}

}
