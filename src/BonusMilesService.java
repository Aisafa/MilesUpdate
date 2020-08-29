public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int bonusPerMile=20;
        int totalBonusMiles = ticketPrice / bonusPerMile;
        return totalBonusMiles;
    }
}
