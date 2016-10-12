import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapPractice{

     public static void main(String []args){
         HashMap<String,Integer>  hm=new HashMap<String,Integer>();
         hm.put("Gangu",773);
         hm.put("stev",700);
         hm.put("hemantj",750);
         if(hm!=null && hm.size()>0){
         for(Map.Entry<String,Integer> hs : hm.entrySet()){
             System.out.println("Key is "+ hs.getKey());
             System.out.println("Value is "+ hs.getValue());
         }
         }
         
     }
}
