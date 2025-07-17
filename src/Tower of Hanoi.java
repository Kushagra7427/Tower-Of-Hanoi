import java.util.*;
public class Toh {
    public static void towerofHanoi(int n,String s,String h,String d){
        if (n==1) {
            System.out.println("Transfer disk"+n+"from"+s+"to"+d);
            return;

        }
            towerofHanoi(n-1, s, h, d);

            System.out.println("Transfer disk"+n+"from"+s+"to"+d);
            towerofHanoi(n-1, h, s, d);
    }
        public static void main(String args[]){
            int n=3;
            towerofHanoi(n, "s", "h", "d");
        }           
    
}
