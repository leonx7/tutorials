package com.examples.creational.prototype.cookiemachine;

//Client Class
public class CookieMachine {
    private Cookie cookie;

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return this.cookie.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie copy;
        Cookie prototype = new CoconutCookie();
        Cookie prototype2 = new ChocolateCookie();

        CookieMachine cm = new CookieMachine(prototype);
        for (int i = 0; i < 10; i++) {
            copy = cm.makeCookie();
            System.out.println(copy);
            System.out.println(copy.equals(prototype));
        }

        CookieMachine cm2 = new CookieMachine(prototype2);
        for (int i = 0; i < 10; i++) {
            copy = cm2.makeCookie();
            System.out.println(copy);
            System.out.println(copy.equals(prototype));
        }
    }
}
