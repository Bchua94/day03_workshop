package sg.edu.nus.iss;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        String dirPath = args[0];

        File newDirectory = new File(dirPath);
        if (newDirectory.exists()) {
            System.out.println("Directory" + newDirectory + "already exists");
        } else {
            newDirectory.mkdir();
        }

        System.out.println("Welcome to my Shopping Card");

        // List collection to store the cart items of login user
        List<String> cartItems = new ArrayList<String>();
        
        // use Console class to read from keyboard input
        Console con = System.console();
        String input = "";

        // use to keep track of current login-in user
        // this is also used as the filename to store the user cart items
        String loginuser = "";

        //exit while loop if keyboard 'input' equals to 'quit'
        while(!input.equals("quit")) {
            input = con.readLine("What do you want to do?");

            if (input.startsWith("login")) {
                Scanner scan = new Scanner(input.substring(6));

                while(scan.hasNext()) {
                    loginuser = scan.next();

                }

                // check if the file <loginuser> exists
                // if not exists, create a new file
                // else (maybeg) override

                File loginFile = new File(dirPath + File.separator + loginuser);
                if (loginFile.exists()) {

                } else {
                    loginFile.createNewFile();
                }
            }

            if (input.equals("users")) {
                File directoryPath = new File(dirPath);

                String [] directoryListing = directoryPath.list();
                System.out.println("List of files and directories in the specific folder" + dirPath);
                for (String dirList : directoryListing) {
                    System.out.println(dirList);
                }

        
            if (input.startsWith("Add")) {
                input = input.replace(',' , ' ');

                
                String currentScanString = "";
                Scanner inputScanner = new Scanner(input.substring(4));
                while(inputScanner.hasNext()) {
                    currentScanString = inputScanner.next();
                    cartItems.add(currentScanString);
                }
            }

            pw.write("\n" + currentScanString);

            
            }
            pw.flush();
            pw.close();
            fw.close();
        }
    }
}
