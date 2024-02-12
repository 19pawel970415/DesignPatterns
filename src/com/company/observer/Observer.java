package com.company.observer;

public abstract class Observer {

    //Zadanie 8 - observer
    //Wykorzystując wzorzec projektowy observer zaimplementuj program, który daje możliwość obserwowania pewnej liczby i reakcji na jej zmianę. W tym celu zaimplementuj:
    //
    //klasę Subject, która ma pola:
    //
    //observers typu List<Observer>
    //value type int
    //oraz ma możliwość zarejestrowania Observera (tzn. subskrypcji), zaktualizowania pola value i poinformowania wszystkich observerów o aktualizacji wartości
    //klasę abstrakcyjną Observer, która ma pola:
    //
    //subject type Subject
    //abstrakcyjną metodę void update(), która jest reakcją na zmianę stanu (tzn. pola value w klasie Subject)
    //3 implementacje klasy Observer, które w konstruktorze przyjmują pole typu Subject i subskrybują się do niego
    //
    //klasę ConcreteValueObserver, która w metodzie update() zawsze wypisuje nową wartość na ekran
    //klasę ValueLoweredObserver, która w metodzie update() wypisuje nową wartość na ekran tylko, gdy zaktualizowana wartość jest mniejsza niż poprzednia
    //klasę ByTenChangedObserver, która w metodzie update() wypisuje wartość na ekran, jeżeli nowa wartość różni się przynajmniej o 10 od poprzedniej
    //klasę, która w metodzie main stworzy instancję klasy Subject oraz każdy z 3 typów observerów. Zasubskrybuj je do obiektu typu Subject. Następnie kilka razy zaktualizuj wartość na obiekcie Subject i poinformuj wszystkich observerów o zmianach.

    protected Subject subject;

    public Observer(final Subject subject) {
        this.subject = subject;
        subject.subscribe(this);
    }
    public abstract void update();
}
