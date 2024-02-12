package com.company.adapter;

public class ComputerGameAdapter implements PcGame {

    //Zadanie 6
    //Stwórz adapter klasy ComputerGame do interfejsu PCGame.
    //
    //Uwagi:
    //
    //liczba w nazwie wartości PegiAgeRating oznacza minimalny wiek gracza
    //potraktuj grę jako TripleA jeżeli jej budżet przekracza 50 milionów

    private final ComputerGame computerGame;

    public ComputerGameAdapter(final ComputerGame computerGame) {
        this.computerGame = computerGame;
    }

    @Override
    public String getTitle() {
        return computerGame.getName();
    }

    @Override
    public Integer getPegiAllowedAge() {
        switch (computerGame.getPegiAgeRating()) {
            case P3:
                return 3;
            case P7:
                return 7;
            case P12:
                return 12;
            case P16:
                return 16;
            case P18:
                return 18;
        }
        throw new RuntimeException("Unsupported PEGI rating");
    }

    @Override
    public boolean isTripleAGame() {
        return computerGame.getBudgetInMillionsOfDollars() > 50;
    }

    @Override
    public Requirements getRequirements() {
        return new Requirements(computerGame.getMinimumGpuMemoryInMegabytes() / 1024,
                computerGame.getDiskSpaceNeededInGB(), computerGame.getRamNeededInGb(), computerGame.getCoreSpeedInGhz(),
                computerGame.getCoresNeeded());
    }
}
