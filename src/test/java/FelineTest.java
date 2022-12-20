import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void checkFelineFood() throws Exception {
        Feline feline = new Feline();
        Assert.assertEquals("Метод getFood() работает неверно", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void checkFelineFamily(){
        Feline feline = new Feline();
        Assert.assertEquals("Метод getFamily() работает неверно", "Кошачьи", feline.getFamily());
    }

    @Test
    public void checkFelineKittens(){
        Feline feline = new Feline();
        int expected = 5;
        Assert.assertEquals("Метод getKittens() работает неверно", expected, feline.getKittens(expected));
    }

    @Test
    public void checkFelineKittensCount(){
        Feline feline = new Feline();
        Assert.assertEquals("Метод getKittens() работает неверно", 1, feline.getKittens());
    }
}
