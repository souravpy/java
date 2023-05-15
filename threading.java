import java.util.Scanner;
class Tsum extends Thread{
        Thread t;
        String tnum;
        Tsum(String num){
                tnum=num;
                t=new Thread(this,tnum);
                t.start();
                }
                public void main(){
                        try{
                                Scanner sc=new Scanner(System.in);
                                System.out.println("Enter two numbers");
                                int a=sc.nextInt();
                                int b=sc.nextInt();
                                int c=a+b;
                                System.out.println("Enter two numbers");
                                Thread.sleep(500);
                        }
                        catch(InterruptedException iException){

                                System.out.println(tnum+"interrupted");
                        }
                                System.out.println(tnum+"Terminated");
                        }

class Tsub extends Thread{
        Thread t;
        String tnum;
        Tsub(String num){
                tnum=num;
                t=new Thread(this,tnum);
                t.start();
                }
                public void main(){
                        try{
                                Scanner sc=new Scanner(System.in);
                                System.out.println("Enter two numbers");
                                int a=sc.nextInt();
                                int b=sc.nextInt();
                                int c=a-b;
                                System.out.println("Enter two numbers");
                                Thread.sleep(500);
                        }
                        catch(InterruptedException iException){

                                System.out.println(tnum+"interrupted");
                        }
                                System.out.println(tnum+"Terminated");
                        }

class Tmult extends Thread{
        Thread t;
        String tnum;
        void Tsum(String num){
                tnum=num;
                t=new Thread(this,tnum);
                t.start();
                }
                public void main(){
                        try{
                                Scanner sc=new Scanner(System.in);
                                System.out.println("Enter two numbers");
                                int a=sc.nextInt();
                                int b=sc.nextInt();
                                int c=a*b;
                                System.out.println("Enter two numbers");
                                Thread.sleep(500);
                        }
                        catch(InterruptedException iException){

                                System.out.println(tnum+"interrupted");
                        }
                                System.out.println(tnum+"Terminated");
                        }
class Test{
        public static void main(String args[]){
                Tsum t1=new Tsum("Sum");
                Tsum t2=new Tsub("Sub");
                Tmul t3=new Tmult("Mult");
                try{
                        Thread.sleep(1000);
                }
                        catch(InterruptedException iException){
                                System.out.println(tnum+"interrupted");
                        }

}
