
public class SymbolsString {

	public static void main(String[] args) {
		//  How to remove Dollar($), Euro (€) and Rupee (₹) symbols from the String
		
		
		String price1 = "$9,999.00";
		String price2 = "€9,999.98";
		String price3 = "₹9,999.99";
		
		System.out.println(price1.replaceAll("[$,]",""));
		System.out.println(price2.replaceAll("[€,]",""));
		System.out.println(price3.replaceAll("[₹,]",""));
		
		

	}

}
