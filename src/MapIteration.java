import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


public class MapIteration {

	public  static void  iterateMap() {
		
		Map<String,Integer> nameSalMap=new HashMap<String,Integer>();
		nameSalMap.put("Stev", null);
		nameSalMap.put(null, 16000);
		nameSalMap.put("Hemanth", 19000);
		nameSalMap.put("Naidu", 0);
		nameSalMap.put("Kumar", 25000);
		nameSalMap.put(null, null);
		if(nameSalMap!=null && nameSalMap.size()>0){
			long startTime=System.currentTimeMillis();
			/*Iterator<Entry<String, Integer>> itr=nameSalMap.entrySet().iterator();
			long startTime=System.currentTimeMillis();
			while(itr.hasNext()){
				Entry<String,Integer> entr=itr.next();
				String key=entr.getKey();
				Integer value=entr.getValue();
				System.out.println("name is: "+key);
				System.out.println("value is: "+value);
			}
			System.out.println("Execution time: "+(System.currentTimeMillis()-startTime));*/
			
			for (Entry<String,Integer> entry : nameSalMap.entrySet()){
				System.out.println("key is:"+entry.getKey());
				System.out.println("value is:"+entry.getValue());
			}
			System.out.println("Execution time: "+(System.currentTimeMillis()-startTime));
		}
	}
	public static void main(String args[]){
		MapIteration.iterateMap();
	}
	
}
