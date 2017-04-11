import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogCamera analogcamera;
  DigitalCamera digitalcamera;

  @Before
  public void before(){
  photographer = new Photographer("Allegra");
  analogcamera = new AnalogCamera("Polaroid");
  digitalcamera = new DigitalCamera("Canon");
  }

  @Test
  public void hasName(){
    assertEquals("Allegra", photographer.getName());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(digitalcamera);
    assertEquals(1, photographer.cameraCount());
  }





}