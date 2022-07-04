public class LeapYear {
    public static void main(String[] args){
        isLeapYear(3128);
    }

    public static void isLeapYear(int year){

        if ((year % 4 == 0) || (year % 100 == 0 && year % 400 ==0) ) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }
    }
}
