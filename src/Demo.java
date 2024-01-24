import java.util.Scanner;

public class Demo {
    public Scanner mainScanner = new Scanner(System.in);
    public int indecisive = 0;
    public static void main(String[] args)
    {
        Demo demo = new Demo();
        demo.saySomething();
    }

    public void saySomething()
    {
        if (indecisive < 3)
        {
            System.out.println("You reach a fork in the road. Would you like to go left or right?");
            String chooseDirection = mainScanner.nextLine();
            chooseDirection = chooseDirection.toLowerCase();
            goSomewhere(chooseDirection);
        }
        else
        {
            System.out.println("Make up your mind and come back later.");
            mainScanner.close();
        }
        
    }
    
    public void goSomewhere(String somewhere)
    {
        Direction direction;
        switch(somewhere)
        {
            case "left":
                direction = new Left();
                direction.WentIn();
                break;
            case "right":
                direction = new Right();
                direction.WentIn();
                break;
            default:
                System.out.println("I don't think you can go that way.");
                indecisive++;
                saySomething();
                break;
        }
    }
}
