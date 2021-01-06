import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSuperMarketCheckoutSystem {
    @Test
    public void testGetTotalPrice() {

        SuperMarketCheckoutSystem superMarketCheckoutSystem = new SuperMarketCheckoutSystem();
        assertEquals(0, superMarketCheckoutSystem.getTotalPrice(new String[]{""}));
        assertEquals(50, superMarketCheckoutSystem.getTotalPrice(new String[]{"A"}));
        assertEquals(80, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "B"}));
        assertEquals(115, superMarketCheckoutSystem.getTotalPrice(new String[]{"C", "D", "B", "A"}));
        assertEquals(100, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A"}));
        assertEquals(130, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A"}));
        assertEquals(180, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A"}));
        assertEquals(230, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A", "A"}));
        assertEquals(260, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A", "A", "A"}));
        assertEquals(160, superMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "B"}));
        assertEquals(175, superMarketCheckoutSystem.getTotalPrice(new String[]{"A","A","A", "B", "B"}));
        assertEquals(190, superMarketCheckoutSystem.getTotalPrice(new String[]{"A","A","A", "B", "B", "D"}));
        assertEquals(190, superMarketCheckoutSystem.getTotalPrice(new String[]{"D", "A","B","A", "B", "B"}));
    }

}

