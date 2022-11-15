import java.util.Scanner;   // for getting input using Scanner
import javax.swing.*;       // for JOptionPane
import java.io.*;           // for File I/O
import java.text.NumberFormat;  // for formatting currenct

/** ***************************************************
 *  Name:           Liam
 *  Class:          CS20S
 * 
 *  Assignment:     A1.5 Q2
 * 
 *  Description:    This program will read the data file created by the writer
 *                  program
 * 
 *************************************************************/

public class A1Point5Reader {

    public static void main(String[] args) throws IOException{
    // ***** constants *******
    
    // ***** variables *****
    
        String banner = "";             // output banner
        String prompt = "";             // prompt for user input
        
        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output
        
        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        // a new line character that works on every computer system
        String nl = System.lineSeparator();
        
        int num = 0;
        int input = 0;
        int[] list = new int[51];
    
    // ***** objects *****
    
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // file io buffers for reading and writing to text files
        
        BufferedReader fin = new BufferedReader(new FileReader("A1.5Info.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS20S-00x" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        
        System.out.println(banner);
        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window
    
    // ***** Main Processing *****
        
        for(int i = 0; i <= 1000; i++){
            num = Integer.valueOf(fin.readLine());
            try{
            list[num] = list[num] + 1;
        } catch(ArrayIndexOutOfBoundsException e){}
        }
    
    // ***** Print Formatted Output *****
    
        System.out.println("Enter a number to see its frequency");
        input = scanner.nextInt();
        System.out.println(input + " appears " + list[input] + " times");
    
    // ***** Closing Message *****
    
        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
