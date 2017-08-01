/**
 * Created by mahajani on 7/26/2017.
 */
class Cinema {
    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        User user1 = new User(12,"ISHAN", 30,12);
        try {
            movieService.watch(user1);
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
        try{
            movieService.buy(user1,350);
        }catch (InvalidPriceException e) {
            System.out.println(e);
        }
    }
}
