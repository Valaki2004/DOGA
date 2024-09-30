import java.util.Scanner;

public class Bundaskenyer {

    public void Cica(){
        Scanner sc = new Scanner(System.in);
        System.out.println("A rombusz területét számolja ki ez a program");
        System.out.println("Varas-Tóth Gergő alias VTG, 2024.09.30 17:40, II-1-N");
    
        System.out.print("Első átló: ");
        String egyatlostr = sc.nextLine();
        Double egyatlo = Double.parseDouble(egyatlostr);

        System.out.print("Második átló: ");
        String kettoatlostr = sc.nextLine();
        Double kettoatlo = Double.parseDouble(kettoatlostr);

        Double eredmeny = (1.0/2.0) * egyatlo * kettoatlo;

        System.out.println("A rombusz területe: " + eredmeny);

        sc.close();
    }

}
