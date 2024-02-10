import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class Indexprint {
      public static void main(String [] args){
        List<Integer> arrl=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        while(true){
            Integer num=Integer.valueOf(sc.nextInt());
            if(num==0){
                break;
            }
             arrl.add(num);
        }
         int indexnum=sc.nextInt();
         sc.close();
         System.out.println(arrl.get(indexnum));
      }
}
