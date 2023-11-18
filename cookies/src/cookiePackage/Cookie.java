package cookiePackage;

public class Cookie implements Cloneable {
    public Object clone() {
        try {
            Cookie clonedCookie = (Cookie) super.clone();
            return clonedCookie;
        } catch (CloneNotSupportedException cloneNotSupportedException) {
            cloneNotSupportedException.printStackTrace();
            return null;
        }
    }
}
