package com.example.problemsolver.domains.farmer;

import com.example.problemsolver.framework.problem.State;

/**
 *
 * @author George Popov
 */

public class FarmerState extends State
{
    public FarmerState(Side farmer, Side wolf, Side goat,
                       Side cabbage) {
        this.farmer = farmer;
        this.wolf = wolf;
        this.goat = goat;
        this.cabbage = cabbage;
    }

    public FarmerState(String farmer, String wolf, String goat,
                       String cabbage) {
        this(toSide(farmer), toSide(wolf), toSide(goat), toSide(cabbage));
    }

    public Object getItems() { return items; }
    public Side getFarmer() { return this.farmer; }
    public Side getWolf() { return this.wolf; }
    public Side getGoat() { return this.goat; }
    public Side getCabbage() { return this.cabbage; }


    @Override
    public boolean equals(final Object other)
    {
        if (this == other) { return true; }
        if (other == null) { return false; }
        if (this.getClass() != other.getClass()) { return false; }
        final FarmerState state = (FarmerState)other;
        return this.farmer == state.farmer && this.wolf == state.wolf &&
                this.goat == state.goat && this.cabbage == state.cabbage;
    }

    @Override
    public int hashCode() {
        return this.farmer.hashCode() + this.wolf.hashCode() + this.goat.hashCode() + this.cabbage.hashCode();

    }

    @Override
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        String start = "   |  |   \n";
        String cabbageWest = " C |  |   \n";
        String cabbageEast = "   |  | C \n";
        String farmerWest = " F |  |   \n";
        String farmerEast = "   |  | F \n";
        String goatWest = " G |  |   \n";
        String goatEast = "   |  | G \n";
        String wolfWest = " W |  |   \n";
        String wolfEast = "   |  | W \n";
        String end = "   |  |   ";
        str.append(start);

        if(this.farmer == Side.WEST)str.append(farmerWest);
        else str.append(farmerEast);

        if(this.wolf==Side.WEST)str.append(wolfWest);
        else str.append(wolfEast);

        if(this.goat==Side.WEST)str.append(goatWest);
        else str.append(goatEast);

        if(this.cabbage==Side.WEST)str.append(cabbageWest);
        else str.append(cabbageEast);

        str.append(end);
        return str.toString();
    }

    private static Side toSide(String toCheck)
    {
        if (toCheck.equalsIgnoreCase("west")) { return Side.WEST; }
        if (toCheck.equalsIgnoreCase("east")) { return Side.EAST; }
        throw new RuntimeException("Bad side: " + toCheck);
    }
    private Side farmer;
    private Side wolf;
    private Side goat;
    private Side cabbage;

    public enum Side { WEST, EAST; }
    Object items;
}
