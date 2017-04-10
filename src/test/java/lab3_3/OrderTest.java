package lab3_3;

import org.junit.Test;

import edu.iis.mto.time.Order;
import edu.iis.mto.time.SystemTimeProvider;

public class OrderTest {
	 @Test
     public void checkIfOrderExpired_notExpiredOrder() throws Exception {
         Order order = new Order(new SystemTimeProvider());
         order.submit();
         order.confirm();
      }
}