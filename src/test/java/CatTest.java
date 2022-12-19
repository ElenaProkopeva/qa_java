import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void checkCatSound(){
        Cat cat = new Cat(feline);
        Assert.assertEquals("Метод cat.getSound() работает неверно", "Мяу", cat.getSound());
    }

    @Test
    public void checkCatFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Метод cat.getFood() работает неверно", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

}
