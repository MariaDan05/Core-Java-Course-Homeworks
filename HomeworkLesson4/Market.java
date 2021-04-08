package model;

//JavaBean
public class Market {
    private String marketName;
    private String address;
    private int countOfBranches;
    private double marketBranchRate;
    private boolean isMarket;

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountOfBranches() {
        return countOfBranches;
    }

    public void setCountOfBranches(int countOfBranches) {
        this.countOfBranches = countOfBranches;
    }

    public double getMarketBranchRate() {
        return marketBranchRate;
    }

    public void setMarketBranchRate(double marketBranchRate) {
        if(marketBranchRate >= 0.0 && marketBranchRate <= 5.0) {
            this.marketBranchRate = marketBranchRate;
        }
        else {
            System.out.println("Invalid marketBranchRate");
        }
    }

    public boolean isMarket() {
        return isMarket;
    }

    public void setMarket(boolean market) {
        isMarket = market;
    }
  
}
