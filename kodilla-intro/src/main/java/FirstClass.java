public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(500,100, 2010);
        Notebook heavyNotebook = new Notebook(1000,1400, 2017);
        Notebook oldNotebook = new Notebook(2000,1000, 2020);

        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkPurchase();

        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkPurchase();

        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkPurchase();
        }
    }

