import java.util.Scanner;

class test{
public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int balance=sc.nextInt();
        int withdraw=sc.nextInt();
        int s=0, c=0;
        try{
                c=a/b;
                s=1;
        }
        //Exception can be vaguely mentioned
        catch(ArithmeticException ae){
                s=0;
                System.out.println("Cause of exception"+ae);
        }
        finally{
                if (s==1){
                        System.out.println("Division output is: "+c);
                        System.out.println("Division is successful");
                }

                else{
                        System.out.println("withdraw is failed: ");
                }
        }

}
}
