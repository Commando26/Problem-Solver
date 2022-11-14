package com.example.problemsolver.framework.problem;


/**
 *
 * @author tcolburn
 */
public class Benchmark {
    private final State initialState;



    public Benchmark(String name, int solutionLength, State start, State goal) {
        this.name = name;
        this.solutionLength = solutionLength;
        this.start = start;
        this.goal = goal;
        this.initialState=start;

    }

    public String getName() {
        return name;
    }

    public int getSolutionLength() {
        return solutionLength;
    }

    public State getStart() {
        return start;
    }

    public State getGoal() {
        return goal;
    }



    @Override
    public String toString() {
        return getName() + ": " + solutionLength + " moves";
    }


    public State getState(){
        return this.state;
    }

    public State getInitState(){
        return this.initialState;
    }

    private State state;

    private final String name;
    private final int solutionLength;
    private final State start;
    private final State goal;
}
