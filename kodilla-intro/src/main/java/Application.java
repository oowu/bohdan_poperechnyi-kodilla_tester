import java.util.List;

public class Application {
    private String name;
    private double age;
    private double height;


    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
    public static void main(String[] args) {
        Application adam = new Application("Adam", 23, 170);
        Application eve = new Application("Eve", 20, 157);
        Application samuel = new Application("Samuel", 52, 183);
        Application rebecca = new Application("Rebecca", 31, 160);
        Application victor = new Application("Victor", 33, 168);

        Application[] users = {adam,eve,samuel,rebecca,victor};

        for(int i=0;i< users.length;i++){
            if (users[i].getName()!=null){
                if (users[i].getAge() > 30 && users[i].getHeight() >160){
                    System.out.println("User is older than 30 and taller than 160cm");
                }else {
                    System.out.println("User is 30 (or younger) or 160cm (or shorter)");

                }
            }
        }

    }
}
