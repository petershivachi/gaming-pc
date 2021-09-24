import java.util.Scanner;

public class PC {
    private int spec_to_upgrade;
    private int spec_to_upgrade_type;
    private int spec_price;

    Scanner myScanner = new Scanner(System.in);

    public void specToUpgrade(){
        System.out.println("What would you like to upgrade?");
        System.out.println("1. Processor");
        System.out.println("2. Graphics Card");
        System.out.println("3. Memory");
        System.out.println("4. Monitor");
        System.out.println("5. Nothing else - I'm done");
        spec_to_upgrade = myScanner.nextInt();
    }

    public void priceOfSpecToUpgrade(){
        if (spec_to_upgrade == 1){
            System.out.println("Enter the number of your choice: ");
            System.out.println("Upgrade the processor to [1] Intel i7 ($200), [2] intel i9 ($300), [3] AMD 9 5950 ($500)");
            spec_to_upgrade_type=myScanner.nextInt();

            switch (spec_to_upgrade_type){
                case 1:
                    spec_price = 200;
                    System.out.println("$"+spec_price);
                    break;
                case 2:
                    spec_price = 300;
                    System.out.println("$"+spec_price);
                    break;
                case 3:
                    spec_price = 500;
                    System.out.println("$"+spec_price);
                    break;
                default:
                    System.out.println("Please select a valid number from the list of options");
            }
        }else if (spec_to_upgrade == 2){
            System.out.println("Enter the number of your choice: ");
            System.out.println("Upgrade the graphics card to [1] Nvidia 2060 ($150), [2] Nvidia 3060 ($250), [3] Nvidia 3080 ($500)");
            spec_to_upgrade_type=myScanner.nextInt();

            switch (spec_to_upgrade_type){
                case 1:
                    spec_price = 150;
                    System.out.println("$"+spec_price);
                    break;
                case 2:
                    spec_price = 250;
                    System.out.println("$"+spec_price);
                    break;
                case 3:
                    spec_price = 350;
                    System.out.println("$"+spec_price);
                    break;
                default:
                    System.out.println("Please select a valid number from the list of options");
            }
        }else if(spec_to_upgrade == 3){
            System.out.println("Enter the number of your choice: ");
            System.out.println("Upgrade the memory to [1] 16GB ($150), [2] 32GB ($250), [3] Nvidia 3080 ($500)");
            spec_to_upgrade_type=myScanner.nextInt();

            switch (spec_to_upgrade_type){
                case 1:
                    spec_price = 150;
                    System.out.println("$"+spec_price);
                    break;
                case 2:
                    spec_price = 250;
                    System.out.println("$"+spec_price);
                    break;
                default:
                    System.out.println("Please select a valid number from the list of options");
            }
        }else if(spec_to_upgrade == 4){
            System.out.println("Enter the number of your choice: ");
            System.out.println("Add a monitor of size [1] 24 inches ($200), [2] 27 inches ($250), [3] 32 inches ($350)");
            spec_to_upgrade_type=myScanner.nextInt();

            switch (spec_to_upgrade_type){
                case 1:
                    spec_price = 200;
                    System.out.println("$"+spec_price);
                    break;
                case 2:
                    spec_price = 250;
                    System.out.println("$"+spec_price);
                    break;
                case 3:
                    spec_price = 350;
                    System.out.println("$"+spec_price);
                    break;
                default:
                    System.out.println("Please select a valid number from the list of options");
            }
        }else if(spec_to_upgrade == 5) {
            System.out.println("You have not selected anything to upgrade ");
        }else {
            System.out.println("The number you selected is not among the choices given");
        }
    }
}
