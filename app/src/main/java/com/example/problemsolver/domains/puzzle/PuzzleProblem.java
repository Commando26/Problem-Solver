package com.example.problemsolver.domains.puzzle;

import com.example.problemsolver.framework.problem.Problem;
import java.util.HashSet;
import java.util.Set;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Benchmark1;
/**
 *
 * @author George Popov
 */
public class PuzzleProblem extends Problem
{
    public PuzzleProblem()
    {
        super.setName("8-Puzzle");
        super.setMover(new PuzzleMover());
        super.setIntroduction(INTRO);
        super.setInitialState(PuzzleProblem.START);
        super.setCurrentState(super.getInitialState());
        super.setFinalState(PuzzleProblem.END);

        super.addBenchmark(new Benchmark("8-Puz 1", 5, BENCH1, GOAL1));
        super.addBenchmark(new Benchmark("8-Puz 2", 10, BENCH2, GOAL2));
        super.addBenchmark(new Benchmark("8-Puz 3", 13, BENCH3, GOAL3));
        super.addBenchmark(new Benchmark("8-Puz 4", 18, BENCH4, GOAL4));
        super.addBenchmark(new Benchmark("8-Puz 5", 20, BENCH5, GOAL5));
        super.addBenchmark(new Benchmark("8-Puz 6", 24, BENCH6, GOAL6));
        super.addBenchmark(new Benchmark("8-Puz 7", 30, BENCH7, GOAL7));
        super.addBenchmark(new Benchmark("8-Puz 8", 30, BENCH8, GOAL8));

        this.Benchmark1 = new Benchmark1();
        Benchmark1.setBenchMarkName("Bench 1: 5 Moves");
        Benchmark1.setStart(PuzzleProblem.START);
        Benchmark1.setGoal(PuzzleProblem.END);
        this.Benchmark2 = new Benchmark1();
        Benchmark2.setBenchMarkName("Bench 2: 10 Moves");
        Benchmark2.setStart(PuzzleProblem.START2);
        Benchmark2.setGoal(PuzzleProblem.END);
        this.Benchmark3 = new Benchmark1();
        Benchmark3.setBenchMarkName("Bench 3: 13 Moves");
        Benchmark3.setStart(PuzzleProblem.START3);
        Benchmark3.setGoal(PuzzleProblem.END);
        this.Benchmark4 = new Benchmark1();
        Benchmark4.setBenchMarkName("Bench 4: 18 Moves");
        Benchmark4.setStart(PuzzleProblem.START4);
        Benchmark4.setGoal(PuzzleProblem.END);
        this.Benchmark5 = new Benchmark1();
        Benchmark5.setBenchMarkName("Bench 5: 20 Moves");
        Benchmark5.setStart(PuzzleProblem.START5);
        Benchmark5.setGoal(PuzzleProblem.END);
        this.Benchmark6 = new Benchmark1();
        Benchmark6.setBenchMarkName("Bench 6: 24 Moves");
        Benchmark6.setStart(PuzzleProblem.START6);
        Benchmark6.setGoal(PuzzleProblem.END);
        this.Benchmark7 = new Benchmark1();
        Benchmark7.setBenchMarkName("Bench 7: 30 Moves");
        Benchmark7.setStart(PuzzleProblem.START7);
        Benchmark7.setGoal(PuzzleProblem.END);
        this.Benchmark8 = new Benchmark1();
        Benchmark8.setBenchMarkName("Bench 8: 30 Moves");
        Benchmark8.setStart(PuzzleProblem.START8);
        Benchmark8.setGoal(PuzzleProblem.END);

    }

    public static final PuzzleState BENCH1 =
            new PuzzleState(new int[][]{new int[]{2, 8, 3},
                    new int[]{1, 6, 4},
                    new int[]{7, 0, 5}});

    private static final PuzzleState GOAL1 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH2 =
            new PuzzleState(new int[][]{new int[]{3, 6, 4},
                    new int[]{1, 0, 2},
                    new int[]{8, 7, 5}});

    private static final PuzzleState GOAL2 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH3 =
            new PuzzleState(new int[][]{new int[]{3, 0, 4},
                    new int[]{1, 6, 5},
                    new int[]{8, 2, 7}});

    private static final PuzzleState GOAL3 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH4 =
            new PuzzleState(new int[][]{new int[]{2, 1, 3},
                    new int[]{8, 0, 4},
                    new int[]{6, 7, 5}});

    private static final PuzzleState GOAL4 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH5 =
            new PuzzleState(new int[][]{new int[]{4, 2, 0},
                    new int[]{8, 3, 6},
                    new int[]{7, 5, 1}});

    private static final PuzzleState GOAL5 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH6 =
            new PuzzleState(new int[][]{new int[]{1, 6, 3},
                    new int[]{4, 0, 8},
                    new int[]{7, 2, 5}});

    private static final PuzzleState GOAL6 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH7 =
            new PuzzleState(new int[][]{new int[]{5, 6, 7},
                    new int[]{4, 0, 8},
                    new int[]{3, 2, 1}});

    private static final PuzzleState GOAL7 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});

    public static final PuzzleState BENCH8 =
            new PuzzleState(new int[][]{new int[]{5, 2, 7},
                    new int[]{8, 0, 4},
                    new int[]{3, 6, 1}});

    private static final PuzzleState GOAL8 =
            new PuzzleState(new int[][]{new int[]{1, 2, 3},
                    new int[]{8, 0, 4},
                    new int[]{7, 6, 5}});


    /**
     * static set new puzzle to the configuration meant to be followed.
     */
    static
    {
        START = new PuzzleState(new int[][] { { 2, 8, 3 }, { 1, 6, 4 },
                { 7, 0, 5 } });
        END = new PuzzleState(new int[][] { { 1, 2, 3 }, { 8, 0, 4 },
                { 7, 6, 5 } });

        START2 = new PuzzleState(new int[][] { { 3, 6, 4 }, { 1, 0, 2 },
                { 8, 7, 5 } });
        START3 = new PuzzleState(new int[][] { { 3, 0, 4 }, { 1, 6, 5 },
                { 8, 2, 7 } });
        START4 = new PuzzleState(new int[][] { { 2, 1, 3 }, { 8, 0, 4 },
                { 6, 7, 5 } });
        START5 = new PuzzleState(new int[][] { { 2, 8, 3 }, { 1, 6, 4 },
                { 7, 0, 5 } });
        START6 = new PuzzleState(new int[][] { { 4, 2, 0 }, { 8, 3, 6 },
                { 7, 5, 1 } });
        START7 = new PuzzleState(new int[][] { { 5, 6, 7 }, { 4, 0, 8 },
                { 3, 2, 1 } });
        START8 = new PuzzleState(new int[][] { { 5, 6, 7 }, { 4, 0, 8 },
                { 3, 2, 1 } });


    }
    private static final PuzzleState START;
    private static final PuzzleState END;
    private static final PuzzleState START2;
    private static final PuzzleState START3;
    private static final PuzzleState START4;
    private static final PuzzleState START5;
    private static final PuzzleState START6;
    private static final PuzzleState START7;
    private static final PuzzleState START8;


    private static final String INTRO = "You are given a board in which "
            + "numbered "
            + "tiles can slide around. There is one blank space that holds "
            + "no tile.  "
            + "A legal move consists of sliding a tile into the blank space "
            + "if the "
            + "tile is adjacent to it. The goal is to move tiles around "
            + "until the "
            + "board looks like the goal state below.";
    private Benchmark1 Benchmark1;
    private Benchmark1 Benchmark2;
    private Benchmark1 Benchmark3;
    private Benchmark1 Benchmark4;
    private Benchmark1 Benchmark5;
    private Benchmark1 Benchmark6;
    private Benchmark1 Benchmark7;
    private Benchmark1 Benchmark8;
}
