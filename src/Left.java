import java.util.Scanner;
public class Left extends Direction{
    public int mumble = 0;
    void WentIn()
    {
        Scanner leftScanner = new Scanner(System.in);
        System.out.println("Are you sure? yes/no");
        String yikes = leftScanner.nextLine();
        yikes = yikes.toLowerCase();

        if (yikes.equals("yes"))
        {
            System.out.println("Perhaps you might" + 
        " encounter the big, terrible monster that" +
        " lives in the dark, black forest...");
        }
        else if (yikes.equals("no"))
        {
            System.out.println("Smart choice.");
        }
        else
        {
            System.out.println("I didn't catch that...");
            mumble++;
            if (mumble > 2)
            {
                System.out.println("Eh, never mind.");
            }
            else
            {
                WentIn();
            }
        }
        leftScanner.close();
    }
}
