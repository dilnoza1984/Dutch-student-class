class Main {
  public static void main(String[] args) {
    // Create 1 object of DuotechStudent
    DuotechStudent stud1 = new DuotechStudent();
    System.out.println(stud1.getInfo());
    DuotechStudent stud2 = new DuotechStudent("Bob",20,"VA",false,new int[]{90,60,90},5000);
    System.out.println(stud2.getInfo());
    System.out.println(stud2.getAverageGrade());
    stud2.payTuition(2300);
    System.out.println(stud2.getTuition());
    stud2.payTuition(3000);
    System.out.println(stud2.getTuition());
  
  }
}