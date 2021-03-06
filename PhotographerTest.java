import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest {
  Photographer photographer;
  AnalogCamera analogcamera;
  DigitalCamera digitalcamera;

  @Before
  public void before(){
  photographer = new Photographer("Allegra");
  analogcamera = new AnalogCamera("Polaroid", "hipster");
  digitalcamera = new DigitalCamera("Canon", "Hi");
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

  @Test
  public void canRemoveCamera(){
    photographer.addCamera(digitalcamera);
    photographer.removeCamera();
    assertEquals(0, photographer.cameraCount());
  }

  @Test
  public void canReturnAllDetails(){
    assertEquals("Polaroid hipster Canon Hi", Printable.printDetails());
  }



}