public class SimpleArray {
    public static void main(String[] args) {
        String[] games = new String[5];

        int numberOfElements = games.length;

        games[0] = "Metro Exodus";
        games[1] = "Dark Alliance";
        games[2] = "Nier Replicant";
        games[3] = "RE: Village";
        games[4] = "Dragon Quest VII";

        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów.");
        System.out.println(games[4]);


    }
}
