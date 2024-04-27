import java.util.Arrays;

public class NumberFromAlphabet {

    public static void main(String[] args) {

        String str = "a1b2c3d4e5f6g7h8i9j0";

        String copy=new String(str);

        int[]a=copy.chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .toArray();

        System.out.println("a = " + Arrays.toString(a));

    }
}
