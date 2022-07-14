public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(2, 700, 2020);
        System.out.println(notebook.weight +" "+ notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();

        Notebook heavyNotebook = new Notebook(11, 1600, 2010);
        System.out.println(heavyNotebook.weight + " "+heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        Notebook oldNotebook = new Notebook(5, 600, 2005);
        System.out.println(oldNotebook.weight + " "+oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();

    }
}
