import com.example.AlexLion;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    Feline feline;

    @Test
    public void checkAlexFriends() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertEquals("Метод getFriends() работает неверно!", List.of("Марти", "Глория", "Мелман"), alexLion.getFriends());
    }

    @Test
    public void checkAlexPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertEquals("Метод getPlaceOfLiving() работает неверно!", "Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void checkAlexKittens() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertEquals("Метод getKittens() работает неверно!", 0, alexLion.getKittens());
    }

    @Test
    public void isAlexHasMane() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertTrue("Метод doesHaveMane() работает неверно!", alexLion.doesHaveMane());
    }

    @Test
    public void checkAlexFood() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals("Метод getFood() работает неверно", List.of("Животные", "Птицы", "Рыба"), alexLion.getFood());
    }
}
