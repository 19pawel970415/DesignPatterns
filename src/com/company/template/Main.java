package com.company.template;

public class Main {
    public static void main(String[] args) {

        // Zadanie 10 - template¶
        //Wykorzystując wzorzec template method, stwórz szkielet testu wydajnościowego:
        //
        //stwórz klasę abstrakcyjną PerformanceTestTemplate, a w niej 3 metody abstrakcyjne:
        //void testIteration() - wykonująca pojedynczą iterację testu
        //int getWarmupIterationsNum() - zwracająca ilość iteracji rozgrzewających JVM
        //int getIterationsNum() - zwracająca ilość iteracji w teście
        //do klasy PerformanceTestTemplate dodaj metodę void run(), która najpierw wykonuje rozgrzewkowe iteracje testu (których wyniki są ignorowane), a następnie właściwe iteracje testu. Test taki po wykonaniu wszystkich iteracji powinien wyświetlić na ekranie średni czas trwania pojedynczej iteracji.
        //implementację klasy PerformanceTestTemplate, która podczas pojedynczej iteracji stworzy listę losowych 10000 liczb całkowitych typu Long. Zapisze je do listy, a następnie posortuje.
        //klasę, z metodą main, która uruchomi stworzony test.

        final PerformanceTestTemplate test = new SortingPerformanceTest();
        test.run();

    }
}
