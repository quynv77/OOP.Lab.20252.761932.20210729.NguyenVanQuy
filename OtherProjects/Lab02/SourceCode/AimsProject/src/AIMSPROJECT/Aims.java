package AIMSPROJECT;
public class Aims {
	public static void main(String[] args) {

	    // Create a new cart
	    Cart anOrder = new Cart();

	    // Create new dvd objects and add them to the cart
	    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
	            "Animation", "Roger Allers", 87, 19.95f);
	    anOrder.addDigitalVideoDisc(dvd1);

	    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
	            "Science Fiction", "George Lucas", 87, 24.95f);
	    anOrder.addDigitalVideoDisc(dvd2);

	    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
	            "Animation", 18.99f);
	    anOrder.addDigitalVideoDisc(dvd3);

	 // In tổng tiền trước khi xóa
	    System.out.println("Total cost before removing: " + anOrder.totalCost());

	    // XÓA DVD
	    anOrder.removeDigitalVideoDisc(dvd2);

	    // In tổng tiền sau khi xóa
	    System.out.println("Total cost after removing: " + anOrder.totalCost());
	}
}