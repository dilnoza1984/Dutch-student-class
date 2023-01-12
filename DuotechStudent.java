public class DuotechStudent{
 // implement based on the requirements
String name;
  int age;
  String stateOfResidence;
  boolean isOnline;
  int[] grades;
  double tuition;

  public DuotechStudent(String name1, int newAge, String stateOfResidence1, boolean isOnline1, int[] grades1, double tuition1){
    name = name1;
    age = newAge;
    stateOfResidence = stateOfResidence1;
    isOnline = isOnline1;
    grades =grades1;
    tuition = tuition1;
  }
  public DuotechStudent(){
    name ="Jonh Doe";
    age = 34;
    stateOfResidence = "New York";
    isOnline = false;
    grades = new int[]{88,99,78,56};
    tuition =5000;
  }
  public DuotechStudent(String newName){
    name = newName;
  }
  public String getInfo(){
    return name + " is " + age + " years old and lives in " + stateOfResidence;
  }
  public double getAverageGrade(){
    double sum = 0;
    for(int i = 0; i < grades.length; i++){
      sum += grades[i];
    }
    return sum/grades.length;
  }
  public void payTuition(double newTuition){
    tuition = newTuition;
  }
  public double getTuition(){
    return tuition;
  }
   
}

