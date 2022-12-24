import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineFoodTest {

    String animalKind;
    List<String> foods;

    public FelineFoodTest(String animalKind, List<String> foods) {
        this.animalKind = animalKind;
        this.foods = foods;
    }

    @Parameterized.Parameters
    public static Object[][] felineData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"1", List.of("2", "Птицы", "Рыба")},
        };
    }

    @Test
    public void isLionHasManeTest() {
        try {
            Feline feline = new Feline();
            assertEquals("Метод getFood() работает неверно!", foods, feline.getFood(animalKind));
        } catch (Exception exception) {
            Assert.assertEquals("Неверный текст ошибки", "Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
        }
    }
}
