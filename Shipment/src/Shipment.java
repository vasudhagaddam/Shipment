

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Shipment {
	public static void menus() {
		System.out.println("1.Display");
		System.out.println("2.SortColor");
		System.out.println("3.SortDate");
		System.out.println("4.Exit");
		System.out.println("Choose one of the above options:");
	}

	public static void main(String[] args) {
		int option;
		boolean a=true;
		while (a) {
			menus();
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			switch (option) {
			case 1:
				List<Widget> widget1 = WidgetUtils.getSampleWidgets();
				for (Widget item : widget1) {   
        		    System.out.println(item.getSerialNumber() + " " + item.getColor()+ " " + item.getProductionDate());
        		}
				break;
			case 2:
				List<Widget> widget2 = WidgetUtils.getSampleWidgets();
				System.out.println("Color Sorting:");
				Collections.sort(widget2, ShipmentTest.ColorComparator);
				   for(Widget colors: widget2){
					   System.out.println(colors.getSerialNumber() + " " + colors.getColor());
				   }
				break;
			case 3:
				List<Widget> widget3 = WidgetUtils.getSampleWidgets();
				System.out.println("SortDate:");
				Collections.sort(widget3, ShipmentTest.DateComparator);
				   for(Widget dat: widget3){
					   System.out.println(dat.getSerialNumber() + " " + dat.getProductionDate());
				   }
				   break;
			case 4:
				System.out.println("Thank You!");
				a=false;
				break;
			default:
				System.out.println("Invalid Option.");
			}
		}
	}
}
