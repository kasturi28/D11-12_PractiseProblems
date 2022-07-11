import java.util.ArrayList;
import java.util.Scanner;

public class StockAccount {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<stockDetails> stockList = new ArrayList<stockDetails>();

	public void addStock() {

		stockDetails stock1 = new stockDetails();

		System.out.println("Plase Enter Stock Details");
		System.out.println("Plase Enter Stock Name");
		stock1.setStockName(sc.next());
		System.out.println("Plase Enter Number of Shares ");
		stock1.setNumOfShare(sc.nextInt());
		System.out.println("Plase Enter Share Price");
		stock1.setSharePrice(sc.nextInt());
		stockList.add(stock1);
		System.out.println("The Stock Details Are ");
		System.out.println("The value of Each Stock : " + (stock1.getNumOfShare() * stock1.getSharePrice()));
        System.out.println(stockList);

	}
}