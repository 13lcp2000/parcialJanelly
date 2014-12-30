package parcialDiego;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        problem1();
        problem2();
    }
    
    //Solved Problems
    
    private static void problem1() {

        show("PROBLEM #1");
        String Answer;
        int numStudents = 0;
        double AverageGroup = 0;
        int numStudentsApproved = 0;
        
        do {
            
            Student e = makeStudent();
            numStudents += 1;
            
            AverageGroup += (e.toCalculateFinalRating());
            if (e.toCalculateFinalRating() > 2.95) {numStudentsApproved += 1;}
            
            Answer = setString("Is there any other Student?");
            
        }while(((Answer.charAt(0)+"").equalsIgnoreCase("s")));
        
        averageOfTheGroup(numStudents, AverageGroup);
        show(""+numStudentsApproved + " Students Approved.");
    }
    
    public static void problem2() {
        
        show("PROBLEM #2");
        int wonAnUsb = 0;
        int pucharseBuy = 0;
        String answer = "";
        int totalDiscounts = 0;

        //message to avoid repeating those lines
        String StandartMessage = "You just won a Discount "
                + "\n of the 23% about the value of your pucharse"
                + "\nthe total amount payable is ";
        
        do {            
            pucharseBuy = setInteger("Enter the amount of your purchase");
            
            if ((pucharseBuy >= 100000) && (pucharseBuy < 999.999 )) {
               show(StandartMessage + (pucharseBuy * 0.77));
               totalDiscounts += (pucharseBuy * 0.23);
            }else if(pucharseBuy > 1000000){
               show(StandartMessage + (pucharseBuy * 0.77));
               show("And besides ... you also won a USB! :D");
               totalDiscounts += (pucharseBuy * 0.23);
            }
        answer = setString("Hay otro Cliente?");
        }while(((answer.charAt(0)+"").equalsIgnoreCase("s")));
        show("The total discount that was granted by the\n"
                + "Supermarket was a value of: " + totalDiscounts);
    } 
    
    //Methods for solving problems
    
    public static Student makeStudent() {
        Student s = new Student(
                setDouble("Type note number 1 of the student"),
                setDouble("Type note number 2 of the student"),
                setDouble("Type note number 3 of the student"));
        return s;
    }

    public static double setDouble(String str) {
        double d = (Double.parseDouble(JOptionPane.showInputDialog(str)));
        return d;
    }
    
    public static int setInteger(String str) {
        Integer i = (Integer.parseInt(JOptionPane.showInputDialog(str)));
        return i;
    }
    
    public static String setString(String str) {
        String s = JOptionPane.showInputDialog(str);
        return s;
    }

    public static void show(String str) {
        JOptionPane.showMessageDialog(null, str);
    }
    
    public static void averageOfTheGroup(int numStd, double AverGroup){
        show("The average of the whole group was:" + (AverGroup / numStd) + ".");
    }
    
}