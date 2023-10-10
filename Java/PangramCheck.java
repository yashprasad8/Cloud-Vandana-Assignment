import java.util.Scanner;
                                    
public class PangramChecker 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        sc.close();

        if (isPangram(input))
         {
            System.out.println("This Sentence is a pangram.");
        } 
        else 
        {
            System.out.println("This Sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String input)
     {
        boolean[] alphaCheck = new boolean[26];
        input = input.toLowerCase();

        for (int i = 0; i < input.length(); i++)
         {
            char checkChar = input.charAt(i);
            if (checkChar >= 'a' && checkChar <= 'z')
             {
                alphaCheck[checkChar - 'a'] = true;
            }
        }

        for (boolean isPresent : alphaCheck) 
        {
            if (!isPresent)
             {
                return false;
            }
        }
        return true;

    }
}
