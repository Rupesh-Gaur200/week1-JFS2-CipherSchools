public class Main implements olaowner,oladriver,olaCustomer{
    public static void main(String[] args) {
       olaCustomer sc=new Main();
       olaowner b=new Main();
       oladriver c=new Main();

    }

    @Override
    public void signup() {

    }

    @Override
    public void cancelride() {

    }

    @Override
    public void searchride() {

    }

    @Override
    public void choosepickup() {

    }

    @Override
    public void choosedrop() {

    }

    @Override
    public void acceptaride() {

    }

    @Override
    public void cancelaaride() {

    }

    @Override
    public void seeroute() {

    }

    @Override
    public void transfermoneytowallet() {

    }

    @Override
    public void myearings() {

    }

    @Override
    public void carservicebooking() {

    }

    @Override
    public void getcustomerlocation() {

    }

    @Override
    public void login() {

    }

    @Override
    public void logout() {

    }

    @Override
    public void getdriverinfo() {

    }
}
public interface olaCustomer{
    void signup();
    void logout();
    void cancelride();
    void searchride();
    void choosepickup();
    void choosedrop();

}
public interface oladriver{
    void acceptaride();
    void cancelaaride();
    void seeroute();
    void transfermoneytowallet();
    void myearings();
    void carservicebooking();
    void login();
    void logout();
    void getcustomerlocation();
}
public interface olaowner{
    void login();
    void logout();
    void getdriverinfo();


}