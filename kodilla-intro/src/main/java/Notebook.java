public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight,int price,int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else if (this.price >= 600 && this.price < 1000) {
            System.out.println("The price is good.");
        }else
            System.out.println("This notebook is expensive.");
    }

    public void checkWeight(){
        if (this.weight < 4) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 5 && this.weight < 10) {
            System.out.println("This notebook is not too heavy.");
        }else
            System.out.println("This notebook is heavy.");
    }

    public void checkYearAndPrice(){
        if (this.year <= 2005 && this.price > 500) {
            System.out.println("It's not worth it.");
        } else if (this.year < 2015 && this.price > 600) {
            System.out.println("It's your choice of either to buy or not.");
        }else
            System.out.println("You should buy this notebook!");
    }
}
