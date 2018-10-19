package DesignPatterns.proxy;

import java.util.concurrent.TimeUnit;

public class Proxy {

    public static void main(String[] args) throws InterruptedException {

        DataLoader loader = new ProxyDataLoader();
        System.out.println(loader.fetchData());
        System.out.println(loader.fetchData());
        TimeUnit.SECONDS.sleep(11);
        System.out.println(loader.fetchData());

    }
}
