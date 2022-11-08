import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n,flag=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = in.nextInt();
        if(n==1){
            System.out.println("1 is not a prime number");
            System.exit(0);
        }
        if(n>500)
            System.out.println("You have entered more than 500\n");
        else
        {
            for(int i=2; i<=n/2; i++){
                if(n % i == 0 ){
                    flag = 1;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(n+"is a prime number");
            }
            else{
                System.out.println(n+"is not a prime number");
            }

        }
    }
}
