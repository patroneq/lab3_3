package lab3_3;

import org.junit.Test;
import org.junit.Assert;

import edu.iis.mto.time.CustomTimeProvider;
import edu.iis.mto.time.Order;
import edu.iis.mto.time.SystemTimeProvider;
import edu.iis.mto.time.OrderExpiredException;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

public class OrderTest {
	 @Test
     public void checkIfOrderExpired_notExpiredOrder() throws Exception {
         Order order = new Order(new SystemTimeProvider());
         order.submit();
         order.confirm();
      }
	 
	 @Test (expected = OrderExpiredException.class)
     public void checkIfOrderExpired_ExpiredOrder() throws Exception {
         Order order = new Order(new CustomTimeProvider());
         order.submit();
         order.confirm();
     }
	 
	 @Test (expected = OrderExpiredException.class)
     public void checkIfOrderHasBeenCancelled_expiredOrder() throws Exception {
         Order order = new Order(new CustomTimeProvider());
         order.submit();;
         order.confirm();
         Assert.assertThat(order.getOrderState(),is(equalTo(Order.State.CANCELLED)));
     }
}