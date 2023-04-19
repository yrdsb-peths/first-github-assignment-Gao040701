public class Rectangle{
  private String name;
  private double width;
  private double length;
  
  public Rectangle(String name){
    this.name = name;
    this.width = 0;
    this.length = 0;
  }
  
  public Rectangle(String name, double width, double length){
    this.name = name;
    this.width = width;
    this.length = lenght;
  }
  
  public void setName(String newName){
    name = newName;
  }
  
  public void setWidth(double newWidth){
    width = newWidth;
  }
  
  public void setLength(double newLength){
    length = newLength;
  }
  
  public String getName(){
    return name;
  }
  
  public doule getWidth(){
    return width;
  }
  
  public double getLength(){
    return length;
  }
  
  pulic double getArea(){
    return width * length;
  }
  
  public double getPerimeter(){
    return 2*(width + length);
  }
}
