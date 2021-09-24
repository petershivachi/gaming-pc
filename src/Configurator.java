import java.util.Scanner;

public class Configurator {
    private int no_of_pcs;
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*   Welcome to the PC Configurator   *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

//         int no_of_pcs;

//        System.out.println("How many PCs do you want to purchase?");
//        no_of_pcs = myScanner.nextInt();

        System.out.println("*               #PC1                    *");
        PC pc1 = new PC();
        pc1.specToUpgrade();
        pc1.priceOfSpecToUpgrade();

        System.out.println("*               #PC1                    *");
        PC pc2 = new PC();
        pc2.specToUpgrade();
        pc2.priceOfSpecToUpgrade();

        System.out.println("*               #PC3                    *");
        PC pc3 = new PC();
        pc3.specToUpgrade();
        pc3.priceOfSpecToUpgrade();

        System.out.println("*               #PC4                    *");
        PC pc4 = new PC();
        pc4.specToUpgrade();
        pc4.priceOfSpecToUpgrade();

//        System.out.println(no_of_pcs);



        System.out.println(pc1);
    }

}
