import java.util.Scanner;

public class StoreUserInput {

    public static void main(String args[]){

        /* this program get user inputs and summerise them */
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        String age = "";
        String origin= "";
        String major= "";
        String javaExperience= "";
        String aboutYou= "";

        // get name
        System.out.println("Hello! What's your name?");
        name = keyboard.nextLine();

        // get age
        System.out.println("Thanks! What's your age?");
        age = keyboard.nextLine();

        // get origin
        System.out.println("Thanks. Where you are from?");
        origin = keyboard.nextLine();

        // get major
        System.out.println("Thanks. What's your Major?");
        major = keyboard.nextLine();

        // get the user java experience
        System.out.println("Thanks. What's your level of experience with java?");
        javaExperience = keyboard.nextLine();

        // Get something interesting about the user
        System.out.println("Thanks. Now can you tell me something interesting about you?");
        aboutYou = keyboard.nextLine();

        // Print out the summery
        System.out.println();
        System.out.println("Hello "+name+ ". You are "+ age +" years old. You came from " + origin + " and here an interesting fact about you: "
        + aboutYou + ".");
        System.out.println("You have a major in " + major + " and your level of experience wit java is "+ javaExperience + "." );

    }
}
