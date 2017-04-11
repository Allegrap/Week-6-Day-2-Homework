public class DigitalCamera implements Printable {

  private String name;
  private String resolution;

  public DigitalCamera(String name, String resolution){
    this.name = name;
    this.resolution = resolution;
  }

  public String printDetails(){
    return this.name + this.resolution;
  }

  public String alive(){
    return "I'm alive!";
  }

}