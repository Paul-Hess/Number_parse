import org.junit.*;
import static org.junit.Assert.*;

public class WordToNumberTest {

  @Test
  public void WordToNumber_returnUniqueBase1Value_String() {
    WordToNumber testWordToNum = new WordToNumber();
    String expect = "one";
    assertEquals(expect,testWordToNum.getWords(1));
  }

  @Test
  public void WordToNumber_returnUniqueBase10Value_String() {
        WordToNumber testWordToNum = new WordToNumber();
        String expect = "twenty";
        assertEquals(expect, testWordToNum.getWords(20));
  }

  @Test
  public void WordToNumber_returnConcatenatedStringOfNumber_String() {
    WordToNumber testWordToNum = new WordToNumber();
    String expect = "twenty one";
    assertEquals(expect, testWordToNum.getWords(21));
  }

}
