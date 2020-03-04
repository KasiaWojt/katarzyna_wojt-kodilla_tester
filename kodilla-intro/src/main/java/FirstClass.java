public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2019);
        System.out.println(notebook.weight + " " + notebook.price + " " + notebook.year);
        notebook.checkPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2018);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + " " + heavyNotebook.year);
        heavyNotebook.checkWeight();

        Notebook newAndCheapNotebook = new Notebook(1600, 500, 2017);
        System.out.println(newAndCheapNotebook.weight + " " + newAndCheapNotebook.price + " " + newAndCheapNotebook.year);
        newAndCheapNotebook.checkYearAdnPrice();

        Notebook oldAndCheapNotebook = new Notebook(2500, 599, 2015);
        System.out.println(oldAndCheapNotebook.weight + " " + oldAndCheapNotebook.price + " " + oldAndCheapNotebook.year);
        oldAndCheapNotebook.checkYearAdnPrice();

        Notebook oldAndExpensiveNotebook = new Notebook(2500, 2300, 2012);
        System.out.println(oldAndExpensiveNotebook.weight + " " + oldAndExpensiveNotebook.price + " " + oldAndExpensiveNotebook.year);
        oldAndExpensiveNotebook.checkYearAdnPrice();

        Notebook bestDealEverNotebook = new Notebook(1500, 450, 2019);
        System.out.println(bestDealEverNotebook.weight + " " + bestDealEverNotebook.price + " " + bestDealEverNotebook.year);
        bestDealEverNotebook.checkYearAdnPrice();

    }
}