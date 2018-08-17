//David Gray
//ICT4361
//FormLetterFile.java

package edu.du4361.playground;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FormLetterFile {

    private FormLetter formLetter;

    public static void main(String[] args) {


        //get two file names using scanner
        Scanner templateScanner = new Scanner(System.in);
        System.out.println("Enter file name:");
        String templateFile = templateScanner.nextLine();

//        Scanner propsScanner = new Scanner(System.in);
//        System.out.println("Enter properties file name:");
//        String propertiesFile = propsScanner.nextLine();

        //Set a default, and message the user that the file doesn't exist so you're using the default

        FormLetterFileReader f = new FormLetterFileReader();
        try {
            f.setFile(templateFile);
        } catch (FileNotFoundException fnfe){
            System.out.println("File Not found");
            System.exit(0);
        }

        List<String> p = new LinkedList<String>();

        try {
            while (f.readLine() != null){
                p.add(f.readLine());
            }

            String rawdata = p.toString();
            String[] tokenArray = f.getTokens(rawdata);

            FormLetter fl = new FormLetter(templateFile);

            for (String x : tokenArray){
                if (x.charAt(0) == '{'){
                    fl.addDataItemEntry(x);
                } else {
                    fl.addTextEntry(x);
                }
            }
            fl.printFormLetterTemplate(System.out);


        } catch (IOException iox){
            System.out.println("IO Exception occurred");
            System.exit(0);
        }


        //use text methods such as trimming, and substrings

        //load properties with the associated filename from above

        //Run doFormLetter on the Form letter
//        fl.doFormLetter();

    }
}
