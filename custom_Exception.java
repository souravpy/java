public class custom_Exception extends Exception{
        int amt;
        public custom_Exception(int a){
                amt=a;
        }
        public String toString(){
                String msg ="Insufficient funds error:" +amt+"short in account";
                return msg;
        }
}
