/**
 * Created by mahajani on 7/26/2017.
 */
public class MovieService{

    public void watch(User user) throws InvalidAgeException {
        if(user.getAge() <= 0 ) {
            InvalidAgeException e = new InvalidAgeException("INVALID AGE!!");
            throw e;
        }
        else if(user.getAge() > 0 && user.getAge() <= 10 ) {
            InvalidAgeException e = new InvalidAgeException("AGE BETWEEN 0  to 10 !!");
            throw e;
        }
        System.out.println("Enjoy the movie!!!!!");


    }

    public void buy(User user, double price) throws InvalidPriceException {
        if(price <= 0 ) {
            InvalidPriceException e = new InvalidPriceException("INVALID PRICE!!");
            throw e;
        }
         else if(price > 0 && price <= 20 ) {
             InvalidPriceException e = new InvalidPriceException("PRICE BELOW 2000!!");
             throw e;
         }
        System.out.println("YOU HAVE BOUGHT THE MOVIE, ENJOY!!!!");
    }

}
