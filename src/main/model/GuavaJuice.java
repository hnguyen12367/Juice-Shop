package model;

//Represents guava juice that extends FruitJuice
public class GuavaJuice extends FruitJuice {
    private static int totalVolumeOfGuava = 0;

    //EFFECTS: calls the constructor from the superclass FruitJuice to instantiate guava juice
    public GuavaJuice() {
        super(FruitType.GUAVA);
    }

    //EFFECTS: calls the constructor from the superclass FruitJuice to instantiate guava juice
    public GuavaJuice(DrinkSize size) {
        super(FruitType.GUAVA, size);
        setTotalVolume(size);
    }

    /*
     *MODIFIES: this
     *EFFECTS: sets totalVolumeOfGuava to 0
     */
    public static void resetTotalVolume() {
        totalVolumeOfGuava = 0;
    }

    @Override
    public int getTotalVolume() {
        return totalVolumeOfGuava;
    }

    //REQUIRES: delta >= 0
    //MODIFIES: this
    //EFFECTS: add delta to totalVolume
    @Override
    public void addToTotalVolume(int delta) {
        totalVolumeOfGuava += delta;
    }

    /*
     *MODIFIES: this
     *EFFECTS: the totalVolume is subtracted by the amount of volume
     */
    @Override
    public void subtractTotalVolume(int volume) {
        totalVolumeOfGuava -= volume;
    }

    /*
     * EFFECTS: return a boolean true if getTotalVolume() > FruitJuice.MAX_VOLUME, false otherwise
     */
    @Override
    public boolean isOutOfOrder() {
        return getTotalVolume() > FruitJuice.MAX_VOLUME;
    }

    /*
     * EFFECTS: return an integer that is the remaining volume of the juice after every order
     */
    @Override
    public int remainingVolume() {
        return FruitJuice.MAX_VOLUME - getTotalVolume();
    }
}
