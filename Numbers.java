import java.util.*;
public class Number{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Integer num = Integer.valueOf(sc.nextInt());
        Map<Integer,String> mapob=new HashMap<>();
        mapob.put(1,"One");
        mapob.put(2,"Two");
        mapob.put(3,"Three");
        mapob.put(4,"Four");
        mapob.put(5,"Five");
        mapob.put(6,"Six");
        mapob.put(7,"Seven");
        mapob.put(8,"Eight");
        mapob.put(9,"Nine");
        mapob.put(0,"Zero");
         System.out.println(mapob.get(num));
    }
}
