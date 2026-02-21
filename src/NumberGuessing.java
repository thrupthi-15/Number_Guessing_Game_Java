import java.util.Scanner;
public class NumberGuessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int attempts = 0;
        int n = 10;
        System.out.println("Enter a number from(1 to 100) to guess correct number you have "+ n +"chances to try");
        for(int i = 1; i<=n; i++){
            System.out.println("Enter a number");
            int guess=sc.nextInt();
            if(guess==number){
                attempts++;
                System.out.println("You guess correct number i.e "+number+" in "+ attempts +" attempts");
                break;
            }else if(number>guess){
                attempts++;
                System.out.println("The number is greater than "+ guess);
                System.out.println("you have "+(n-attempts)+" chances to guess");
            }else{
                attempts++;
                System.out.println("The number is lesser than "+ guess);
                System.out.println("you have "+(n-attempts)+" chances to guess");
            }

        }

    }
}
