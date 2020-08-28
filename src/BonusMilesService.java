public class BonusMilesService {

    public int calculate(int ticketPrice, int bonusPerMile) {
        int totalBonusMiles = ticketPrice / bonusPerMile;
        return totalBonusMiles;
    }
}
