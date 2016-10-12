import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.employee.Address;
import com.employee.Employee;


public class MapDemo {
	public static void  main(String g[]) {
		Employee e1=new Employee();
		e1.setEmpId(5210);
		e1.setEmpNmae("John");
		Address adr1=new Address();
			adr1.setStreet("Shiv colony");
			adr1.setArea("Ameerpet");
			adr1.setDistrict("Hyd");
		e1.setAddr(adr1);
		
		Employee e2=new Employee();
		e2.setEmpId(52340);
		e2.setEmpNmae("cena");
		Address adr2=new Address();
			adr2.setStreet("bulkmpet");
			adr2.setArea("sr nagar");
			adr2.setDistrict("Hyd");
		e2.setAddr(adr2);
		
		Map<Integer, Address> empAddrMap=new HashMap<Integer, Address>();
		empAddrMap.put(e1.getEmpId(), e1.getAddr());
		empAddrMap.put(e2.getEmpId(), e2.getAddr());
		
		if(empAddrMap!=null && empAddrMap.size()>0){
			
			for(Entry<Integer, Address> entry : empAddrMap.entrySet()){
				if(entry!=null){
					System.out.println("Employee Id:"+ entry.getKey());
					Address ads=entry.getValue();
					System.out.println("Employee Addrss:"+ads.toString());

				}
			}
		}
		
		
	}

}
