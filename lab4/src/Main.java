public class Main {
    public static void main(String[] args) {
        Seasons myFavoriteTime = Seasons.Spring;

        iLove(myFavoriteTime);
        myFavoriteTime.getDescription();

        for(Seasons season: Seasons.values()){
            System.out.println(season);
            season.getDescription();
            System.out.println(season.getTemp());
        }
    }
    public static void iLove(Seasons season){
        switch (season){
            case Autumn:
                System.out.println("Я люблю осень");
                break;
            case Summer:
                System.out.println("Я люблю лето");
                break;
            case Spring:
                System.out.println("Я люблю весну");
                break;
            case Winter:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}