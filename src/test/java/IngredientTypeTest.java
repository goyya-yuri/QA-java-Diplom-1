import org.junit.Assert;
import org.junit.Test;
import praktikum.IngredientType;

public class IngredientTypeTest {

    @Test
    public void enumValuesTest() {
        IngredientType[] expectedValues = {IngredientType.SAUCE, IngredientType.FILLING};
        Assert.assertArrayEquals(expectedValues, IngredientType.values());
    }

    @Test
    public void enumNameTest() {
        Assert.assertEquals("SAUCE", IngredientType.SAUCE.name());
        Assert.assertEquals("FILLING", IngredientType.FILLING.name());
    }

    @Test
    public void enumOrdinalTest() {
        Assert.assertEquals(0, IngredientType.SAUCE.ordinal());
        Assert.assertEquals(1, IngredientType.FILLING.ordinal());
    }
}
