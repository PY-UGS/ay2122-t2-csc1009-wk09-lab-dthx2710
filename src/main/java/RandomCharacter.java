
import java.util.Arrays;
import java.util.Random;

public class RandomCharacter {
    Random rand = new Random();

    public char getRandomLowerCaseCharacter(){ //method to get a random lower character
        return (char) ('a' + rand.nextInt(26));
    }

    public char getRandomUpperCaseCharacter(){ //method to get a random character
        return (char) ('A' + rand.nextInt(26));
    }

    public int getRandomDigit(){ // method to get a random number between 0 to 9
        return rand.nextInt(10);
    }

    public char getRandomCharacter(){ // method to get any random character
        return (char) (rand.nextInt(95)+32);
    }



    public static void main(String[] args){

        RandomCharacter c = new RandomCharacter();

        int i = 0;
        char[] lowerCharArray = new char[15];
        char[] upperCharArray = new char[15];
        int[] randDigitArray = new int[15];
        char[] randCharArray = new char[15];


        for (i = 0; i<15 ; i++){
            lowerCharArray[i] = c.getRandomLowerCaseCharacter();
        }

        for (i = 0; i<15 ; i++){
            upperCharArray[i] = c.getRandomUpperCaseCharacter();
        }

        for (i = 0; i<15 ; i++){
            randDigitArray[i] = c.getRandomDigit();
        }

        for (i = 0; i<15 ; i++){
            randCharArray[i] = c.getRandomCharacter();
        }


        System.out.println("15 Lowercase characters: " + Arrays.toString(lowerCharArray));
        System.out.println("15 Uppercase characters: " + Arrays.toString(upperCharArray));
        System.out.println("15 random integers between 0 to 9: " + Arrays.toString(randDigitArray));
        System.out.println("15 random characters: " + Arrays.toString(randCharArray));


    }

}
