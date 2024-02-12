package com.company.observer;

public class SpecificValueObserver extends Observer {

    public SpecificValueObserver(final Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Specific value observer: " + subject.getState());
    }
}
