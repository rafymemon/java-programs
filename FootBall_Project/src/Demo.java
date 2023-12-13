import java.util.ArrayList;
import java.util.Scanner;

class Shop {
    protected String shopName;
    protected String ownerName;
    protected String location;

    public Shop(String shopName, String ownerName, String location) {
        this.shopName = shopName;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getShopName() {
        return shopName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}


class FruitJuiceShop extends Shop{

    private ArrayList<FruitFlavours> fruitFlavours = new ArrayList<>();

    public FruitJuiceShop(String shopName, String ownerName, String location, ArrayList<FruitFlavours> fruitFlavours) {
        super(shopName, ownerName, location);
        this.fruitFlavours = fruitFlavours;
    }

    public ArrayList<FruitFlavours> getFruitFlavours() {
        return fruitFlavours;
    }

    public void setFruitFlavours(ArrayList<FruitFlavours> fruitFlavours) {
        this.fruitFlavours = fruitFlavours;
    }

    public void FruitList(){
        for (int i = 0; i < fruitFlavours.size(); i++){
            System.out.print(i+1+". ");
            fruitFlavours.get(i).Fruit();
        }
        System.out.println("\n");
    }
    public void FruitListWithPrice(){
        for(int i = 0; i < fruitFlavours.size(); i++){
            System.out.print(i+1+".");
            fruitFlavours.get(i).FruitWithPrice();
        }
        System.out.println("\n");
    }
    public int FlavourPrice(String flavour) {
        int price = -1;
        for (int i = 0; i < fruitFlavours.size(); i++) {
            if (fruitFlavours.get(i).getFlavourName().equalsIgnoreCase(flavour)) {
                price = fruitFlavours.get(i).getPrice();
            }
        }
        return price;
    }
}

class FruitFlavours {
    private String flavourName;
    private int price;

    public FruitFlavours(String flavourName, int price) {
        this.flavourName = flavourName;
        this.price = price;
    }

    public String getFlavourName() {
        return flavourName;
    }

    public int getPrice() {
        return price;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void Fruit(){
        System.out.println(flavourName);
    }
    public void FruitWithPrice(){
        System.out.println(flavourName +" : "+price);
    }

}

class Customers implements Runnable{
    private FruitJuiceShop shop;
    public Customers(FruitJuiceShop shop){
        this.shop = shop;
    }
    public void run(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\tCustomer's details");
            System.out.println("\n");
            System.out.print("Name : ");
            String name = sc.nextLine();
            System.out.print("Flavour : ");
            String flavour = sc.next();
            System.out.println(flavour + " :" + shop.FlavourPrice(flavour));
            System.out.print("How Much :");
            int count = sc.nextInt();
            int bill = shop.FlavourPrice(flavour) * count;
            System.out.println("Bill : " + bill);
            System.out.print("Payment : ");
            int amount = sc.nextInt();
            if (amount == bill) {
                Thread.sleep(1000);
                System.out.println("\n");
                System.out.println("Successfully done!!!");
                Thread.sleep(1000);
                System.out.println("Receipt!!!! (Y/N)");
                char ch = sc.next().charAt(0);
                if(ch == 'y' || ch == 'Y'){
                    System.out.println("\n\n");
                    System.out.println("\tReceipt");
                    System.out.println("Name : "+name);
                    System.out.println("Flavour : "+flavour);
                    System.out.println("Price : "+shop.FlavourPrice(flavour));
                    System.out.println("Bill : "+bill);
                    System.out.println("Status : Paid");
                    System.out.println("\n");
                }
            } else {
                System.out.println("Sorry unsuccessful...");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Demo {
    static void View(){

        System.out.println("\tWELCOME TO JUICE SHOP");
        System.out.println("\n");
        System.out.println("--------------------------------------");
        System.out.println("Press -> 1. Available Fruit Juice List");
        System.out.println("Press -> 2. Check Price of Fruit Juices");
        System.out.println("Press -> 3. Wanna Purchase Juice");
        System.out.println("Press -> 4. No! Not Interested!!!!");
        System.out.println("--------------------------------------");
        System.out.println("\n");

    }
    public static void main(String[] args) {


        FruitFlavours apple = new FruitFlavours("Apple",150);
        FruitFlavours banana = new FruitFlavours("Banana",100);
        FruitFlavours orange = new FruitFlavours("Orange",120);
        FruitFlavours pineapple = new FruitFlavours("Pineapple",180);
        FruitFlavours mango = new FruitFlavours("Mango",200);
        FruitFlavours strawberry = new FruitFlavours("Strawberry",250);
        FruitFlavours lemon = new FruitFlavours("Lemon",140);
        FruitFlavours papaya = new FruitFlavours("papaya",170);
        FruitFlavours grapes = new FruitFlavours("Grapes",220);
        FruitFlavours watermelon = new FruitFlavours("Watermelon",80);

        ArrayList<FruitFlavours> fruitFlavours = new ArrayList<>();

        fruitFlavours.add(apple);
        fruitFlavours.add(banana);
        fruitFlavours.add(orange);
        fruitFlavours.add(pineapple);
        fruitFlavours.add(mango);
        fruitFlavours.add(strawberry);
        fruitFlavours.add(lemon);
        fruitFlavours.add(papaya);
        fruitFlavours.add(grapes);
        fruitFlavours.add(watermelon);


        FruitJuiceShop shop = new FruitJuiceShop("Rohit Fruit Shop","Rohit Kumar","Hyderabad",fruitFlavours);

        Customers c = new Customers(shop);
        Thread customer = new Thread(c);

        while(true){
            try{
                View();
                Scanner scan = new Scanner(System.in);
                int opt = scan.nextInt();
                char key;
                switch (opt) {
                    case 1: {
                        shop.FruitList();
                        Thread.sleep(1000);
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Press any key to continue");
                        key = sc.next().charAt(0);
                    }
                    case 2: {
                        shop.FruitListWithPrice();
                        Thread.sleep(1000);
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Press any key to continue");
                        key = sc.next().charAt(0);
                    }
                    case 3: {
                        customer.start();
                        customer.join();
                        Thread.sleep(1000);
                        Scanner sc = new Scanner(System.in);
                        System.out.println("Press any key to continue");
                        key = sc.next().charAt(0);

                    }
                    case 4: {
                        System.out.println("\t------ THANK YOU ------");
                        return;
                    }
                    default: {
                        System.out.println("Sorry Invalid Input try again....");
                        Thread.sleep(1000);
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
