import java.util.Scanner;

public class Help {
    public static void main(String[] args) {
        System.out.println("User: Sunita Sharma");
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while(x!=4){
            System.out.println("Select from the options below: ");
            System.out.println("1. Appointments");
            System.out.println("2. Medicine");
            System.out.println("3. Emergency Info");
            System.out.println("4. Exit");
            System.out.println();
            System.out.print("Choose an Option: ");
            x = sc.nextInt();

            switch (x) {
                case 1:
                    System.out.println("Your Appointments :");
                    System.out.println("21st October 2022 : Dental Checkup at Nelson Hospital");
                    System.out.println("29th October 2022 : Eye Checkup at Look Hospital");
                    break;
                case 2:
                    System.out.println("Medication :");
                    System.out.println("Morning : TabletX - 1");
                    System.out.println("Afternoon : TabletY - 1");
                    System.out.println("Night : TabletZ - 1, TabletX - 1");
                    break;
                case 3:
                    System.out.println("Emergency Info: ");
                    System.out.println("Name : Sunita Sharma");
                    System.out.println("Blood Group : A +ve");
                    System.out.println("Ailment : Narcolepsy");
                    System.out.println("Guardian Contact Info : 8556790111");
                    System.out.println("In case of Emergency provide : TabletX - 1 dosage");
                    System.out.println("Doctor Contact Info : Dr. Zayn; Mobile Number : 987654321");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Input proper option.");
            }
            System.out.println();
        }
    }
}