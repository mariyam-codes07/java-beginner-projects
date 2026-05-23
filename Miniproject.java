import java.util.Scanner;


public class Miniproject {
 

    //Method to calculate total marks
    static int calculationtotal( int m1, int m2, int m3){
        return m1 + m2 + m3;

  }

  // Method to calculate average 
  static double  calculateAverage(int total){
    return total / 3.0;
  }
  //Method to assign grade 
  static String assignGrade(double average){
    if( average >=90)
        return "A";
    else if(average >=75)
        return "B";
    else if(average >=60)
        return "C";
    else
        return "Fail";
  }

  //Method to display a result
      static void displayResult(String name, int total, double average, String grade) {
        System.out.println("\n-----RESULT-----");
        System.out.println("Name:" + name);
        System.out.println("Total Marks:" + total);
        System.out.println("Average:" + average);
        System.out.println("Grade:" + grade);

 }
   
   
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter Student Name:" );
        String name = sc.nextLine();
        
        System.out.print("enter Marks for Subject 1:" );
        int m1 = sc.nextInt();

        System.out.print("Enter Marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks for Subject 3: ");
        int m3 = sc.nextInt();

        int total = calculationtotal(m1, m2, m3);
        double average = calculateAverage(total);
        String grade = assignGrade(average);

        displayResult(name, total, average, grade);








    }
}

    

