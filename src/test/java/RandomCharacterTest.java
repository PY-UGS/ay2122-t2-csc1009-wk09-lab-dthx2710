import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;


public class RandomCharacterTest {
    @Test //test for lowercase method
    public void allValuesShouldBeLowerCaseLetters(){
        RandomCharacter random = new RandomCharacter();
        assertTrue((int)((random.getRandomLowerCaseCharacter())) >= 97 );
        assertTrue((int)((random.getRandomLowerCaseCharacter())) <= 122 );
    }

    @Test //test for uppercase method
    public void allValuesShouldBeUpperCaseLetters(){
        RandomCharacter random = new RandomCharacter();
        assertTrue((int)((random.getRandomUpperCaseCharacter())) >= 65 );
        assertTrue((int)((random.getRandomUpperCaseCharacter())) <= 90 );
    }

    @Test //test for all digits method
    public void allValuesShouldBeDigits(){
        RandomCharacter random = new RandomCharacter();
        assertTrue(random.getRandomDigit() >= 0 );
        assertTrue(random.getRandomDigit() <= 9 );
    }

    @Test //test for all characters method
    public void allValuesShouldBeCharacter(){
        RandomCharacter random = new RandomCharacter();
        assertTrue(random.getRandomCharacter() >= 0);
        assertTrue(random.getRandomCharacter() <= 127);
    }

    @Test //test for prime numbers method
    public void allValuesShouldBePrimeNumber(){
        RandomCharacter random = new RandomCharacter();
        int randomValue = random.getRandomDigit();
        System.out.println("Random Number to test: "+randomValue);
        boolean notPrime = false;
        if (randomValue == 0){
            notPrime = true;
        }
        else{
            // to check if randomValue is divisible by 2 and onwards
            // this is because a number is not divisible by more than its half
            // this will reduce our loops by half (n/2)-3,
            // while also taking in account that it is not divisible by itself
            for (int i = 2; i <= randomValue / 2 ; ++i){
                if (randomValue % i == 0){
                    // if divisible, it is not prime
                    notPrime = true;
                    break;
                }
            }
        }
        // return unit test result depending on whether it is prime or not
        if (!notPrime){
            System.out.println(randomValue+" is a prime number!");
            assertTrue(true);
        } else{
            System.out.println(randomValue+" is not a prime number!");
            assertFalse(true);
        }
    }
}
