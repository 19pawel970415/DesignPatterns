package com.company.memento;

public class Main {
    public static void main(String[] args) {

        //Zadanie 9 - memento
        //Stwórz prostą implementację edytora tekstowego, który ma możliwość cofnięcia ostatnich zmian (podobnie jak naciśnięcie kombinacji Ctrl + Z w IntelliJ). Aplikacja ta powinna wykorzystywać wzorzec memento. Zaimplementuj:
        //
        //klasę EditorText, która posiada pole value typu String, które reprezentuje aktualną wartość tekstu w edytorze tekstowym
        //klasę EditorTextMemento, która reprezentuje zapis obiektu EditorText
        //klasa ta powinna posiadać pole value typu String i powinna przyjmować obiekt typu EditorText w konstruktorze
        //klasę EditorTextMementoManager, która zarządza listą obiektów memento jako stos (wykorzystaj ArrayDeque). Dodaj metody:
        //save, która dodaje nowy zapis na stos
        //restore, która usuwa ostatni wpis ze stosu i go zwraca
        //do klasy EditorText dodaj metodę restoreFromMemento, która przywraca stan wartości tekstu edytora na podstawie zapisanego stanu (tzn. na podstawie obiektu EditorTextMemento)
        //klasę z metodą main, przetestuj swoją implementację, zmieniając i zapisując wartość edytora tekstowego kilka razy, a następnie przywracając kolejne zapisane stany.

        final EditorText editorText = new EditorText();
        final EditorTextMementoManager mementoManager = new EditorTextMementoManager();
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("This is first line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is second line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText("\nThis is third line");
        mementoManager.save(new EditorTextMemento(editorText));

        editorText.addText(" This is second part of 3rd line");
        mementoManager.save(new EditorTextMemento(editorText));

        System.out.println(editorText.getValue());
        System.out.println();

        mementoManager.restore();
        mementoManager.restore();
        editorText.restoreFromMemento(mementoManager.restore());
        System.out.println(editorText.getValue());

    }


}
