// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class HelloWorld {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String s=in.nextLine();
       
       int res=binarytoDec(s);
       System.out.println(res);
    }
    
    static int binarytoDec(String s){
        int res=0;
        
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                res+=(int)Math.pow(2,s.length()-i-1);
            }
        }
        return res;
    }
}
