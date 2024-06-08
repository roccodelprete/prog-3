import cookiePackage.CoconutCookie;
import cookiePackage.Cookie;
import cookiePackage.CookieMachine;

public class Main {
    public static void main(String[] args) {
        Cookie tmp;
        Cookie cookie = new CoconutCookie();
        CookieMachine cookieMachine = new CookieMachine(cookie);

        for (int i = 0; i < 100; i++) {
            tmp = cookieMachine.makeCookie();
            System.out.println(tmp);
        }
    }
}