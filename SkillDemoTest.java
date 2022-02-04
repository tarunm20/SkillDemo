import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void exclaimTest() {
        assertEquals("hello!", SkillDemo.exclaim("hello"));
    }
}
