package assignment_day4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class TimeServer {
    public static interface Client {
        void updateTime(LocalDateTime now);
    }
    private List<Client> clients = new ArrayList<>();

    public void registerClient(Client client) {
        clients.add(client);
    }
    public void notifyClients() {
        LocalDateTime now = LocalDateTime.now();
        for (Client client : clients) {
            client.updateTime(now);
        }
    }
}
class DigitalClock implements TimeServer.Client {
    private String name;

    public DigitalClock(String name) {
        this.name = name;
    }
    public void updateTime(LocalDateTime now) {
        System.out.println(name + " shows time: " + now);
    }
}
class Logger implements TimeServer.Client {
    public void updateTime(LocalDateTime now) {
        System.out.println("Logger recorded time: " + now);
    }
}
public class Timeserver_demo {
    public static void main(String[] args) {
        TimeServer server = new TimeServer();

        DigitalClock clock1 = new DigitalClock("Office Clock");
        Logger logger = new Logger();
        server.registerClient(clock1);
        server.registerClient(logger);
        server.notifyClients();
    }
}
