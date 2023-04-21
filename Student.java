public class Student{
  private String name;
  private int grade;
  private double gradeLevel;
  
  public Students(String name, int grade, double gradeLevel){
    this.name = name;
    this.grade = grade;
    this.gradeLevel = gradeLevel;
  }
  
  public String getName(){
    return name;
  }
  
  public void setName(newName){
    name = newName;
  }
  
  public int getGrade(){
    return grade;
  }
  
  public void setgrade(newgrade){
    grade = newgrade;
  }
  
  public double getGradeLevel(){
    return gradeLevel;
  }
  
  public void setGradeLevel(){
    return gradeLevel();
  }
  
  public String toString(){
    return name + " is a grade " + grade + " student with grade level of " + gradeLevel;
  }
  
  public String higherGrade(Student other){
    if (getGradeLevel() > other.getGradeLevel()){
      return getName;
    }else{
      return other.getName;
    }
  }
}
