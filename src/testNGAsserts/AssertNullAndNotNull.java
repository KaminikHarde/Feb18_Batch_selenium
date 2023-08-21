package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void a()
  {
	  String s=null;
	  
	  String s1="abc";
	  
	//  Assert.assertNull(s, "Tc is failed value is not null");
	  
	Assert.assertNotNull(s, "TC is faied value is null");
  }
}
