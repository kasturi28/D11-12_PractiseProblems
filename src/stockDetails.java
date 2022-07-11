
public class stockDetails {

	private String stockName;
	private int numOfShare;
	private int sharePrice;

	public stockDetails(String stockName, int numOfShare, int sharePrice) {
		super();
		this.stockName = stockName;
		this.numOfShare = numOfShare;
		this.sharePrice = sharePrice;
	}
	
	public stockDetails() {
		// TODO Auto-generated constructor stub
	}
	
	public void addStock() {
		// TODO Auto-generated method stub
		
	}


	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumOfShare() {
		return numOfShare;
	}

	public void setNumOfShare(int numOfShare) {
		this.numOfShare = numOfShare;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	@Override
	public String toString() {
		return "stockDetails [stockName=" + stockName + ", numOfShare=" + numOfShare + ", sharePrice=" + sharePrice
				+ "]";
	}

	
	


	
}
