import org.junit.Assert;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

public class IngredientTest {
    public IngredientType type = IngredientType.SAUCE;
    public String name = "name";
    public float price = 1.0f;
    Ingredient ingredient = new Ingredient(type, name, price);


    @Test
    public void getNameTest() {
        Assert.assertEquals(name, ingredient.getName());
    }
    @Test
    public void getPriceTest() {
        Assert.assertEquals(price, ingredient.getPrice(), Config.DEF_ASSERT_DELTA);
    }
    @Test
    public void getTypeTest() {
        Assert.assertEquals(type, ingredient.getType());
    }
}
