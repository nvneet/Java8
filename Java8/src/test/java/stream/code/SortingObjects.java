package test.java.stream.code;

import java.util.Comparator;
import java.util.List;

import test.java.entity.Tenant;

public class SortingObjects {

	public static void main(String[] args) {
		
		List<Tenant> tenantList = Tenant.getTenantList();
		
		// FIRST
		tenantList.sort(Comparator.comparing(Tenant::getTenantName));
//		tenantList.stream().forEach(x -> System.out.println(x.getTenantName()));
		
		// SECOND		
		Comparator<Tenant> tenantIdComparator2 = Comparator.comparing(Tenant::getTenantId, (s1, s2) -> {
						            return s1.compareTo(s2);
						        });	 
//		Tenant[] tenants = tenantList.toArray(new Tenant[tenantList.size()]);
//	    Arrays.sort(tenants, tenantIdComparator2);
	    tenantList.stream().sorted(tenantIdComparator2).forEach(x -> System.out.println(x.getTenantId()));


	}
}
