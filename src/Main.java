public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int totalBonusMiles = service.calculate(10000);
        System.out.println("Your bonus Miles = " + totalBonusMiles);
    }
}