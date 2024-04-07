package day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
* The following program is able to read the files given and count the number of lines and characters from a sample text.
* The program uses file and scanner class respectively to perform its tasks.
* */
public class CountFileContents{

/**
* The main method is used to initialize objects and execute the program.
 * In this method, the text file is scanned and the lines are read.
 * Then using the in-built hasnextline and hasnext function which returns a boolean value of another line or word existing,
 * In the case of having those characters, the lines and words are counted.
* */
    public static void main(String []args) throws FileNotFoundException {//the method may throw filenotfound exception since the file location may change
        //Declaring the counting variables
        int countlines = 0;
        int countwords =0;
        try {// to detect if file has been found or not
            //access the file given through file class
            File samplefile = new File("sampletext.txt");
            //Scanning the file to be able to read the lines
            Scanner scanfile = new Scanner(samplefile);
            while(scanfile.hasNextLine()){//hasnextfile returns boolean on whether teh file has next line or not
                String line = scanfile.nextLine();//storing teh line in a string variable
                Scanner scanline = new Scanner(line);//scanning the variable with the line to detect words
                countlines++;//counting of lines
                while(scanline.hasNext()){//scans through the line and loops until no words are remaoned
                    scanline.next();
                    countwords++;//counting of words
                }
            }
        } catch (FileNotFoundException e) {//catch thefilenotfound exception
            e.printStackTrace();
        }
        //print the number of lines and words
        System.out.println(countlines);
        System.out.println(countwords);
    }

}





