import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to currency convert.");
        ArrayList<String> resultlist= new ArrayList<String>();

        while (Objects.equals(Scan.input2, "y")) {
                Screens.screen1();
                Scan.scan1();
                while (Scan.input != 1 & Scan.input != 2) {
                    Screens.screen1();
                    Scan.scan1();
                }
                if (Scan.input == 1) {

                    Screens.screen2(); //
                    Scan.scan1();
                    CoinFactory coinFactory = new CoinFactory();
                    Coin USDCoin = coinFactory.getCoin("USD");
                    double result = USDCoin.calculate(Scan.input);
                    String r=Double.toString(result);
                    resultlist.add(r);
                    System.out.println(result);
                }
                else if (Scan.input == 2) {
                    Screens.screen2();
                    Scan.scan1();
                    CoinFactory coinFactory = new CoinFactory();
                    Coin ILSCoin = coinFactory.getCoin("ILS");
                    double result = ILSCoin.calculate(Scan.input);
                    String r=Double.toString(result);
                    resultlist.add(r);
                    System.out.println(result);
                }
                System.out.println("Do you want to star over?");
                Scan.scan2();
          if (Objects.equals(Scan.input2, "n")) {
                    System.out.println("Thanks for using our currency converter.");
                    System.out.println("All results:");
                    for (String r : resultlist) {
                        System.out.println(r);
                    }
    }
    }
        String filePath="C:\\Users\\User\\Desktop\\results.txt";
        File results=new File(filePath);

        try {
        Files.write(Paths.get(filePath),resultlist);}
        catch (Exception e){}

}
}