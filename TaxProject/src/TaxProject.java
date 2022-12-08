import java.util.Scanner;

public class TaxProject {
    static double cStateTaxRate = 0.04;
    static double cCountyTaxRate = 0.02;
    static Scanner bro = new Scanner(System.in);
    public static void main(String[] args) {
        String iPrice;
        double cPrice, cStateTax, cCountyTax, cSalesTax, cTotalSale;

        System.out.print("Enter the purchase price: ");
        iPrice = bro.nextLine();
        cPrice = Double.parseDouble(iPrice);

        cStateTax = cPrice * cStateTaxRate;
        cCountyTax = cPrice * cCountyTaxRate;
        cSalesTax = cStateTax + cCountyTax;
        cTotalSale = cPrice + cSalesTax;

        System.out.println("Purchase Price: " + cPrice);
        System.out.println("State Tax: " + cStateTax);
        System.out.println("County Tax: " + cCountyTax);
        System.out.println("Total Sales Tax: " + cSalesTax);
        System.out.println("Total Sale: " + cTotalSale);



    }
}