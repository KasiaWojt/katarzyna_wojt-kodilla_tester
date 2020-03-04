public class Notebook {

    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price <= 1000) { // 600-1000
            System.out.println("The price is good.");
        } else { // >1000
            System.out.println("This notebook is quite expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 1600) {
            System.out.println("Urządzenie jest lekkie");
        } else if (this.weight <= 2000) { // 1600-2000
            System.out.println("Urządzenie niezbyt ciężkie");
        } else { // > 2000
            System.out.println("Urządzenie ciężkie");
        }
    }

    public void checkYearAdnPrice() {
        if (this.year < 2016 && this.price < 600) {
            System.out.println("Urządzenie jest stare ale tanie.");
        } else if (this.year < 2016) { // starczy niż 2015 a cena większa niż 600
            System.out.println("Urządzenie jest stare i drogie.");
        } else if (this.price < 600) { // 2016 lu nowszy i tańczy niż 600
            System.out.println("Urządzenie jest nowe i tanie.");
        } else { // 2016 lub nowszy i dena większa niż 600
            System.out.println("Urządzenie jest nowe ale drogie.");
        }
    }

}