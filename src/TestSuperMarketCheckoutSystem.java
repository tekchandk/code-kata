import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSuperMarketCheckoutSystem {
    @Test
    public void testGetTotalPrice() {

        assertEquals(0, SuperMarketCheckoutSystem.getTotalPrice(new String[]{""}));
        assertEquals(50, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A"}));
        assertEquals(80, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "B"}));
        assertEquals(115, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"C", "D", "B", "A"}));
        assertEquals(100, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A"}));
        assertEquals(130, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A"}));
        assertEquals(180, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A"}));
        assertEquals(230, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A", "A"}));
        assertEquals(260, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "A", "A", "A"}));
        assertEquals(160, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A", "A", "A", "B"}));
        assertEquals(175, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A","A","A", "B", "B"}));
        assertEquals(190, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"A","A","A", "B", "B", "D"}));
        assertEquals(190, SuperMarketCheckoutSystem.getTotalPrice(new String[]{"D", "A","B","A", "B", "C"}));
    }

}

