import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;

  @Before
  public void before(){
  photographer = new Photographer("Allegra");
  }

  @Test
  public void hasName(){
    assertEquals("Allegra", photographer.getName());
  }





}