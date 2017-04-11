import java.util.*;

public class Photographer {
  private String name;
  private ArrayList<Printable> collection;

  public Photographer(String name){
    this.name = name;
    this.collection = new ArrayList<Printable>();
  }

  public String getName(){
    return this.name;
  }

  public void addCamera(Printable printable){
    collection.add(printable);
  }

  public int cameraCount(){
    return collection.size();
  }

  public Printable removeCamera(){
    if(cameraCount() > 0){
      return collection.remove(0);
    }
    return null;
  }

}