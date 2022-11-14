package com.example.problemsolver.framework.problem;

public class Benchmark1 {


    @Override
    public String toString(){
        return this.benchmark;
    }

    public String getBenchMarkName() {
        return benchmark;
    }

    public void setBenchMarkName(String benchmark){
        this.benchmark = benchmark;
    }

    public State getStartState(){
        return this.start;
    }

    public void setStart(State start){
        this.start = start;
    }

    public State getGoalState(){
        return this.goal;
    }

    public void setGoal(State goal){
        this.goal= goal;
    }

    public State getState(){
        return this.state;
    }

    private State state;
    private String benchmark;
    private State start;
    private State goal;
}