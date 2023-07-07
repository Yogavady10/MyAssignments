package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SalesForceHooks {
	@Before
	public void before(Scenario sc) {
		System.out.println(" Before : ");
		System.out.println(sc.getName());
		System.out.println(sc.getLine());
	}
	
	@After
	public void after(Scenario sc) {
		System.out.println(" After : ");
		System.out.println(sc.getName());
		System.out.println(sc.getStatus());
	}
}
