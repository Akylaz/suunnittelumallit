package teht12ProxyPattern;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Scanner;

class ProxyExample {

	   /**
	    * Test method
	    */
	   public static void main(final String[] arguments) {
	        final Image image1 = new ProxyImage("HiRes_10MB_Photo1");
	        final Image image2 = new ProxyImage("HiRes_10MB_Photo2");
	        final Image image3 = new ProxyImage("HiRes_10MB_Photo3");
	        final Image image4 = new ProxyImage("HiRes_10MB_Photo4");
	        Scanner scan = new Scanner(System.in);
	        List<Image> kansio = new ArrayList<Image>();
	        kansio.add(image1);
	        kansio.add(image2);
	        kansio.add(image3);
	        kansio.add(image4);

	        ListIterator<Image> it = kansio.listIterator();
	        int input;

	        System.out.println("Kansion sisältö:");
	        kansio.forEach(image ->image.showData());

	        System.out.println("\nSelaa kansiota (1=taaksepäin 2=eteenpäin 0=lopetus)");
	        do {
		        input = scan.nextInt();
		        if(input == 1 && !it.hasPrevious() || input == 2 && !it.hasNext()) {
		        	System.out.println("Albumissa ei ole enempää kuvia tässä suunnassa.");
		        } else if(input == 1) {
		        	it.previous().displayImage();
		        } else if (input == 2 ) {
		        	it.next().displayImage();
		        } else if (input != 0 ) {
		        	System.out.println("Invalid input");
		        }
	        } while(input != 0);
	    }
	}