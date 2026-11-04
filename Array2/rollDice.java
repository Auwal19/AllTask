```java
import java.util.Random;

public class DiceRolling {

    public static void main(String[] args) {

        Random random = new Random();

        int[] frequency = new int[13];

        for (int i = 0; i < 36000000; i++) {

