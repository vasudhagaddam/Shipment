import java.util.Comparator;
import java.util.Date;

public class ShipmentTest {

	public static Comparator<Widget> ColorComparator = new Comparator<Widget>() {

		public int compare(Widget s1, Widget s2) {
		   String color1 = s1.getColor().toUpperCase();
		   String color2 = s2.getColor().toUpperCase();
		   return color1.compareTo(color2);
	    }};
	    
	    public static Comparator<Widget> DateComparator = new Comparator<Widget>() {

			public int compare(Widget s1, Widget s2) {
			   Date date1 = s1.getProductionDate();
			   Date date2 = s2.getProductionDate();
			   return date1.compareTo(date2);
		    }};
}