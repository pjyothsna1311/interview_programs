package ravi;

public class Crypto {
	private String name;
	private String code;
	private long marketCap;
	private double totalSupply;
	
	public Crypto(String name, String code, long marketCap, double totalSupply){
		this.name = name;
		this.code = code;
		this.marketCap = marketCap;
		this.totalSupply = totalSupply;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public long getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(long marketCap) {
		this.marketCap = marketCap;
	}

	public double getTotalSupply() {
		return totalSupply;
	}

	public void setTotalSupply(double totalSupply) {
		this.totalSupply = totalSupply;
	}

}
