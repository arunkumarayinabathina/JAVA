import java.util.ArrayList;
import java.util.Scanner;
public class OnlineFoodOrdering{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Customer obj = new Customer();
        System.out.println("Enter the User name :");
        String user_name = sc.nextLine();
        System.out.println("Enter user mobile number : ");
        Long mobile_number = sc.nextLong();
        obj.setDetails(user_name, mobile_number);

		Order order = new Order();

		boolean ordering = true;

		while(ordering){
			System.out.println("Choose item to order : \n 1.Pizza\n 2.Burger\n 3.Drink\n 4.Finish");

			int choice = sc.nextInt();

			switch(choice){
				case 1:
                    System.out.println("Select Pizza:\n1. Margherita (Rs.200)\n2. Farmhouse (Rs.250)");
                    int ptype = sc.nextInt();
                    sc.nextLine();
                    String pname = (ptype == 1) ? "Margherita Pizza" : "Farmhouse Pizza";
                    double pprice = (ptype == 1) ? 200 : 250;
                    System.out.print("Extra toppings? (yes/no): ");
                    String toppings = sc.nextLine();
                    boolean extraToppings = toppings.equals("yes");
                    order.addItem(new Pizza(pname, pprice, extraToppings));
                    break;

				case 2:
                    System.out.println("Select Burger:\n1. Veggie Burger (Rs.100)\n2. Chicken Burger (Rs.150)");
                    int btype = sc.nextInt();
                    sc.nextLine();
                    String bname = (btype == 1) ? "Veggie Burger" : "Chicken Burger";
                    double bprice = (btype == 1) ? 100 : 150;
                    System.out.print("Add cheese? (yes/no): ");
                    String cheese = sc.nextLine();
                    boolean addCheese = cheese.equals("yes");
                    order.addItem(new Burger(bname, bprice, addCheese));
                    break;
                case 3:
                    System.out.println("Select Drink(small/medium/large):");
                    sc.nextLine(); 
                    double dprice = 30; 
                    String dname = "Soft Drink";
                    String size = sc.nextLine().toLowerCase();
                    if(size.equals("small")){
                        dname = "Small Soft Drink";
                    }
                    else if(size.equals("medium")){
                        dname = "Medium Soft Drink";
                    }
                    else{
                        dname = "Large Soft Drink";
                    }
                    order.addItem(new Drink(dname, dprice, size));
                    break;
                case 4:
                    ordering = false;
                    break;
                default:
                    System.out.println("Invalid choice.");
			}
		}


        System.out.println("Customer: "+obj.getName()+" | "+ "Phone: "+obj.getNumber());


		double total = 0;

		for(Food item : order.getItems()){
			double price = item.calculatePrice();
            System.out.println(item.getName() + " -> Rs." + price);
            total += price;
		}
		System.out.println("Total (incl. tax): Rs." + total);

		System.out.println("Choose the payment : \n1.card\n2.upi\n3.cash");
		int paymentType = sc.nextInt();
		Payment payment;
        switch(paymentType){
            case 1:
                payment = new CardPayment();
                break;
            case 2:
                payment = new UPI();
                break;
            case 3:
                payment = new Cash();
                break;
            default:
                payment = new Cash();
                break;
        }
        payment.pay(total);
        sc.close();
    }
}

class Customer{
    private String name;
    private Long mobile_number;

    public void setDetails(String name,Long number){
        this.name = name;
        this.mobile_number = number;
    }

    public String getName(){
        return name;
    }
    public Long getNumber(){
        return mobile_number;
    }
}

class Order {
    private ArrayList<Food> items = new ArrayList<>();
    public void addItem(Food item) {
        items.add(item);
    }
    public ArrayList<Food> getItems() {
        return items;
    }
}


abstract class Food {
	protected String name;
	protected double basePrice;
	public Food(String name, double basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}
	public String getName() { return name; }
	public abstract double calculatePrice();
}

class Pizza extends Food {
	private boolean extraToppings;
	public Pizza(String name, double basePrice, boolean extraToppings) {
		super(name, basePrice);
		this.extraToppings = extraToppings;
	}
	public double calculatePrice() {
		return basePrice + (extraToppings ? 60 : 0);
	}
}

class Burger extends Food {
	private boolean cheese;
	public Burger(String name, double basePrice, boolean cheese) {
		super(name, basePrice);
		this.cheese = cheese;
	}
	public double calculatePrice() {
		return basePrice + (cheese ? 20 : 0);
	}
}

class Drink extends Food {
	private String size;
	public Drink(String name, double basePrice, String size) {
		super(name, basePrice);
		this.size = size;
	}
	public double calculatePrice() {
		if (size.equals("small")) return basePrice;
		else if (size.equals("medium")) return basePrice + 20;
		else return basePrice + 40;
	}
}


abstract class Payment{
	abstract void pay(double amount);
}
class CardPayment extends Payment{
	public void pay(double amount){
		System.out.println("Paid Rs : " + amount +" through the Crad.");
	}
}
class UPI extends Payment{
	public void pay(double amount){
		System.out.println("Paid Rs : "+amount+" through upi.");
	}
}
class Cash extends Payment{
	public void pay(double amount){
		System.out.println("Paid Rs : "+amount+" by cash.");
	}
}