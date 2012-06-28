import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.print.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.*;
import java.util.List;

import javax.swing.JOptionPane;
 
public class Printpdf  implements Printable {
	
	 static AttributedString myStyledText = null;
	 
	    public void start(String fileName) {
	        /**Location of a file to print**/
	    //    String fileName = "C:\\Users\\Parag\\ib.txt)";
	 
	        /**Read the text content from this location **/
	        String mText = readContentFromFileToPrint(fileName);
	 
	        /**Create an AttributedString object from the text read*/
	        myStyledText = new AttributedString(mText);
	 
	        printToPrinter();
	 
	    }
	    private static String readContentFromFileToPrint(String fileName) {
	        String dataToPrint = "";
	 
	        try {
	            BufferedReader input = new BufferedReader(new FileReader(fileName));
	            String line = "";
	            /**Read the file and populate the data**/
	            while ((line = input.readLine()) != null) {
	                dataToPrint += line + "\n";
	            }
	        } catch (Exception e) {
	            return dataToPrint;
	        }
	        return dataToPrint;
	    }
	    
	    public static void printToPrinter() {
	        /**
	         * Get a Printer Job
	         */
	        PrinterJob printerJob = PrinterJob.getPrinterJob();
	 
	        /**
	         * Create a book. A book contains a pair of page <span class="IL_AD" id="IL_AD8">painters</span>
	         * called <span class="IL_AD" id="IL_AD5">printables</span>. Also you have different pageformats.
	         */
	        Book book = new Book();
	        /**
	         * Append the Printable Object (this one itself, as it
	         * implements a printable interface) and the page format.
	         */
	        book.append(new Printpdf(), new PageFormat());
	        /**
	         * Set the object to be printed (the Book) into the PrinterJob. Doing this
	         * before bringing up the print dialog allows the print dialog to correctly
	         * display the page range to be printed and to dissallow any print settings not
	         * appropriate for the pages to be printed.
	         */
	        printerJob.setPageable(book);
	 
	        /**
	         * Calling the printDialog will pop up the Printing Dialog.
	         * If you want to print without user confirmation, you can directly call printerJob.print()
	         *
	         * doPrint will be false, if the user cancels the print operation.
	         */
	        boolean doPrint = printerJob.printDialog();
	        
	        if (doPrint) {
	            try {
	                printerJob.print();
	                JOptionPane.showMessageDialog(null, "Bill printed");
	            } catch (PrinterException ex) {
	                System.err.println("Error occurred while trying to Print: "
	                        + ex);
	            }
	        }
	    }
	     
	    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {

	    	if (page > 0) { /* We have only one page, and 'page' is zero-based */
            return NO_SUCH_PAGE;
	    	}

	    	/* User (0,0) is typically outside the imageable area, so we must
	    	 * translate by the X and Y values in the PageFormat to avoid clipping
	    	 */
	    	Graphics2D g2d = (Graphics2D)g;
	    	g2d.translate(pf.getImageableX(), pf.getImageableY());

	    	/* Now we perform our rendering */
	    	g.drawString("BIll Printed", 100, 100);

	    	/* tell the caller that this page is part of the printed document */
	    	return PAGE_EXISTS;
	    }

}   
	
	