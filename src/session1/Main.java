package session1;

public class Main {
    public static void main(String[] args) {

            cars car1 = new cars("BMW", "Red", 180, true);
            cars car2 = new cars("KIA", "green", 100, false);
            cars car3 = new cars("Volvo", "White", 160, true);
            cars car4 = new cars("VS", "gray", 150, false);
            cars car5 = new cars();

            System.out.println("car1Info");
            car1.printinfo();
            System.out.println("car2Info");
            car2.printinfo();
            System.out.println("car3Info");
            car3.printinfo();
            System.out.println("car4Info");
            car4.printinfo();




    }
    }
