package hw7;

import hw7.client.Client;
import hw7.server.MServer;
import javafx.application.Application;

/**
 * Homework #7
 *
 * @author Aleksandr Kurov
 * @version dated Сентябрь 9, 2018
 */
public class Runner {
    public static void main(String[] args) {
        new Thread(() -> new MServer()).start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        new Thread(() -> Application.launch(Client.class, args)).start();
    }
}
