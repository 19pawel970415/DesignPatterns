package com.company.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Servers {

    //Zadanie 1 - singleton
    //Stwórz singleton Servers typu lazy. Singleton ten przechowuje listę serwerów (jako String). Zaimplementuj następujące funkcjonalności:
    //dodanie serwera do listy
    //metoda dodająca serwer do listy powinna zwracać boolean (true jeżeli serwer został dodany do listy, false w przeciwnym wypadku)
    //dodanie jest możliwe, jeżeli jego nazwa zaczyna się od http lub https
    //dodanie zduplikowanej nazwy jest niemożliwe
    //pobranie listy serwerów, których nazwa zaczyna się od http
    //pobranie listy serwerów, których nazwa zaczyna się od https

    //Zadanie 2 - singleton
    //Zmień singleton z zadania 1 w taki sposób, aby można było z niego korzystać w aplikacji wielowątkowej.

    //Zadanie 3 - singleton
    //Zmień typ singletonu z poprzedniego zadania. Wykorzystaj singleton typu eager.

    //Zadanie 4 - singleton
    //Zmień typ singletonu z poprzedniego zadania. Wykorzystaj enum.

    private static Servers instance;

    private final List<String> servers;

    private Servers() {
        servers = new ArrayList<>();
    }

    public Servers getInstance() {
        if (instance == null) {
            synchronized (Servers.class) {
                if (instance == null) {
                    instance = new Servers();
                }
            }
        }
        return instance;
    }

    public boolean addServer(String server) {
        boolean added = false;
        if ((server.startsWith("http") || server.startsWith("https")) && !servers.contains(server)) {
            servers.add(server);
            added = true;
        }
        return added;
    }

    public List<String> getHttpServers() {
        return servers.stream().filter(s -> s.startsWith("http")).collect(Collectors.toList());
    }

    public List<String> getHttpsServers() {
        return servers.stream().filter(s -> s.startsWith("https")).collect(Collectors.toList());
    }


}
