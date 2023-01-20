public class CoinFactory {
    public Coin getCoin(String CoinType){
        if (CoinType==null){
            return null;
        }
        if (CoinType.equalsIgnoreCase("USD")){
            return new USD();
        }else if (CoinType.equalsIgnoreCase("ILS")){
            return new ILS();
        }
        return null;
    }
}
