import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionHasManeTest {

    String sex;
    boolean isLionHasMane;

    public LionHasManeTest(String sex, boolean isLionHasMane) {
        this.sex = sex;
        this.isLionHasMane = isLionHasMane;
    }

    @Parameterized.Parameters(name = "{index}:Лев с sex = {0} имеет гриву = {1}")
    public static Object[][] lionData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"1", false},
        };
    }

    @Test
    public void isLionHasManeTest() {
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(sex, feline);
            assertEquals("Метод doesHaveMane() работает неверно!", isLionHasMane, lion.doesHaveMane());
        } catch (Exception exception) {
            assertEquals("Неверный текст ошибки", "Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}
