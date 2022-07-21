public class User {
    private String name;
    private int year;

    public User(String name, int year){
        this.name = name;
        this.year = year;
    }

    public int getYear(){
        return year;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        User bobby = new User("Bobby", 25);
        User john = new User("John", 42);
        User tom = new User("Tom", 22);
        User vicki = new User("Vicki", 31);
        User george = new User("George", 29);

        User[] users = {bobby,john,tom,vicki,george};

        int result = 0;
        for (int i=0;i< users.length;i++){
            result += users[i].year;

        }
        float average = (result/users.length);


        for(int a=0;a<users.length;a++){
            if ((users[a].getYear()) < average){
                System.out.println(users[a].getName());
            }
        }
    }
}
