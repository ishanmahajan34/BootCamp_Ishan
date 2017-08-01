/**
 * Created by mahajani on 7/28/2017.
 */
class CustomerServiceImpl implements CustomerService {

    private String name;
    private String address;
    private String number;

    CustomerServiceImpl(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public void details() {
        System.out.println("NAME  : "+ this.name);
        System.out.println("ADDRESS  : "+ this.address);
        System.out.println("NUMBER  : "+ this.number);
    }

    @Override
    public void updateAddress(String address) {
        this.address = address;
    }

    @Override
    public void updateMobile(String number) {
        this.number = number;
    }
}
