import java.util.*;

class Grades
{
   static int high=-1, low=101;
   
   public static void main(String[] args){
       Scanner reader = new Scanner(System.in);
       
       int gradeA=0, gradeB=0, gradeC=0, gradeD=0, gradeF=0, total=0, input=0, numGrades=0, average=0;
      
       //If you want, you can break this up into a bunch  of methods
       do
       {
       
         //Grab input
         System.out.println("Enter Exam Scores 0 to 100(-1 to end input)?");
         input = reader.nextInt();
         
         if (input != -1)
         {
         
            //update the total
            total+=input;
            //call calcHigh to update the high variable
            calcHigh (input);
            //call calcLow to update the low variable
            calcLow (input);
            
            //update the counts for the grades using if or switch statements
            if(input >= 90 & input <= 100)
            {
               gradeA++;
               numGrades++;
              }
            else if(input >= 80 & input <= 89)
            {
               gradeB++; 
               numGrades++;
            }
            else if(input >= 70 & input <= 79)
            {
               gradeC++; 
               numGrades++;
            }
            else if(input >= 60 & input <= 69)
            {
               gradeD++; 
               numGrades++;
            }
            else if(input <= 59)
            {
            gradeF++; 
            numGrades++;
            }
                
                
           //update the total number of grades for average calculatio
           //numGrades++;
         }    
                                       
       }while(input != -1);
      
       //You can call a method for this part as well
       if (numGrades > 0)
       {
         System.out.print("Here is your list!\n");
         //Display the various counts, averages, hights and lowest scores
         System.out.print("Number of A's: " + gradeA);
         System.out.print("\nNumber of B's: " + gradeB);
         System.out.print("\nNumber of C's: " +  gradeC);
         System.out.print("\nNumber of D's: " +  gradeD);
         System.out.print("\nNumber of F's: " + gradeF);
         
         System.out.print("\n");
         System.out.print("\nHighest Score: " +  high); 
         System.out.print("\nLowest Score: " +  low); 
         System.out.print("\nAverage Score: " + calcAvg(total, numGrades));
         
         
         
         //to make sure that numGrades are right and practice
         //System.out.println("\nnumGrades: " + numGrades);
         //System.out.println("total: " + total);
         
       }
 
   }
   
   
   static int calcAvg(int total, int numGrades)
   {
      //return average
      return (total / numGrades);
   }
   
   static void calcHigh(int input)
   {
      //assign the high variable
      if (input > high)
        high = input;      
   }
   
   static void calcLow(int input)
   {
      //assign low variable
      if( input < low)
        low = input;
       
   }  
}
 
