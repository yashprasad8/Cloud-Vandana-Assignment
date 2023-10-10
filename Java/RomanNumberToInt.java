import java.util.Scanner;

public class RomanNoToInt {
    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char Character = s.charAt(i);
            int currentValue = getRoman(Character);

          
            if (i < s.length() - 1) {
                char Pair = s.charAt(i + 1);
                int nextValue = getRoman(Pair);
                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int getRoman(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String roman = sc.nextLine();
        int result = romanToInt(roman);
        System.out.println("Roman numeral " + roman + " is equivalent to " + result);
    }
}
