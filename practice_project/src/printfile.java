import java.awt.*;
import java.awt.print.*;
import javax.print.attribute.*;
import javax.swing.UIManager;

public class printfile implements Printable {
	
	 public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
		 if (page > 0) { /* We have only one page, and 'page' is zero-based */
	            return NO_SUCH_PAGE;
	        }
		 
		 Graphics2D g2d = (Graphics2D)g;
	        g2d.translate(pf.getImageableX(), pf.getImageableY());
	        
	        g.drawString("Test the print dialog!", 100, 100);
	        
		 return PAGE_EXISTS; 
	 }

}
