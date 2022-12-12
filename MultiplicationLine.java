/**
 * Same as Multiplication class but print the table in line 
 */
public class MultiplicationLine {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\u250c"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+" Table of "+i+"\u0020"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2510");
            System.out.print("\n");

            for (int j = 1; j <= 10; j++) {
                
                System.out.print("\u2502" +"\t"+ i + " * " + j + " = " + i * j  +"\t "+"\u2502");
                System.out.println();
            }
            //close the table
            System.out.print("\u2514"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2500"+"\u2518");
            System.out.println();
        }
    }
    
}
