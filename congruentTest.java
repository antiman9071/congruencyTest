import java.util.*;
public class congruentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int y;
        int m;
        switch(args.length){
            case 3:
                m = Integer.parseInt(args[2]);
                y = Integer.parseInt(args[1]);
                x=Integer.parseInt(args[0]);
                break;
            case 2:
                y = Integer.parseInt(args[1]);
                x=Integer.parseInt(args[0]);
                System.out.println("What is the mod");
                m = input.nextInt();
                break;
            case 1:
                x=Integer.parseInt(args[0]);
                System.out.println("What is the other value");
                y = input.nextInt();
                System.out.println("What is the mod");
                m = input.nextInt();
                break;
            default:
                System.out.println("What is the value");
                x = input.nextInt();
                System.out.println("What is the other value");
                y = input.nextInt();
                System.out.println("What is the mod");
                m = input.nextInt();
           break; 
        }
        System.out.println("x mod m is " + x%m + " and y mod m is " + y%m);
        if(x%m == y%m)
            System.out.println("The numbers are congruent");
        else 
            System.out.println("The numbers are not congruent");
    }
}
