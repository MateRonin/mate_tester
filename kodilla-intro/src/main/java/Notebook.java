public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook (int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        }
        else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        }
        else {
            System.out.println("This notebook is expensive");
        }
    }
    public void checkWeight() {
        if (this.weight < 600) {
            System.out.println("This notebook is very light");
        }
        else if (this.weight >= 600 && this.weight <= 1000) {
            System.out.println("This notebook is not so heavy");
        }
        else {
            System.out.println("This notebook is heavy as metal");
        }
    }
    public void checkPurchase() {
        if (this.year >= 2010 && this.price <= 600) {
            System.out.println("That's excellent bargain!");
        }
        else if (this.year >= 2018 && this.price < 1500) {
            System.out.println("You should consider buying it.");
        }
        else {
            System.out.println("Don't buy it! It's overpriced!");
        }
    }

}
