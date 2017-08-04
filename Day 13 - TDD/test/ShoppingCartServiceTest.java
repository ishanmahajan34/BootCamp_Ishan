import com.cdk.shopping.Product;
import com.cdk.shopping.ShoppingCartService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by mahajani on 8/2/2017.
 */
public class ShoppingCartServiceTest {

    ShoppingCartService shoppingCartService = null;

    @Before
    public void init() {
        shoppingCartService = new ShoppingCartService();
//        Product product1 = new Product("Colgate", 120, 12);
//        Product product2 = new Product("Lays", 25, 8);
//        Product product3 = new Product("Bread", 20, 10);
//        shoppingCartService.addItem(product1);
//        shoppingCartService.addItem(product2);
//        shoppingCartService.addItem(product3);

    }

    @Test
    public void testCountItems() {
        int intitialCount = shoppingCartService.countItems();
        Assert.assertEquals(0, intitialCount);
        shoppingCartService.addItem(new Product("LAPTOP",500000,1));
        Assert.assertEquals(1,shoppingCartService.countItems());
    }

    @Test
    public void testAddItemFunctionality() {
        Product product4 = new Product("Hat", 120, 12);
        int intitialCount = shoppingCartService.countItems();
        shoppingCartService.addItem(product4);
        int finalCount = shoppingCartService.countItems();
        Assert.assertEquals(12, finalCount - intitialCount);
    }


}
