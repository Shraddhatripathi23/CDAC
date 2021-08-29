import java.io.File;
import java.io.FileWriter;
import java.io.File;
public class Filehandling {
	public static void main(String[] args) {

	    // create a file object for the current location
	    File file = new File("newFile.txt");
	     String data = "This is the data in the output file";
	     

	    try {
	    	// trying to create a file based on the object
	      boolean value = file.createNewFile();
	      if (value) {
	        System.out.println("The new file is created.");
	      }
	      else {
	        System.out.println("The file already exists.");
	      }
	      // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter("output.txt");

	       // Writes string to the file
	       output.write(data);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     
	    }
	    catch(Exception e) {
	      e.getStackTrace();
	    }
	    
	    //delete file
	    
	    File f0 = new File("filee.txt");   
	    if (f0.delete()) {   
	      System.out.println(f0.getName()+ " file is deleted successfully.");  
	    } else {  
	      System.out.println("Unexpected error found in deletion of the file.");  
	    }   
	  }
}
