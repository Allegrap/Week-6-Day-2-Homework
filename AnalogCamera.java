public class AnalogCamera implements Printable {

  private String name;
  private String filter;

  public AnalogCamera(String name, String filter){
    this.name = name;
    this.filter = filter;
  }

  public String printDetails(){
    return this.name + this.filter;
  }

}