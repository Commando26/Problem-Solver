package com.example.problemsolver.framework.solution;

import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Problem;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tcolburn
 */
public class BestFirstSolverTest {

    @Test
    public void testPuzzleBestFirstSolver() {
        Problem problem = new PuzzleProblem();
        BestFirstSolver bestFirstSolver = new BestFirstSolver(problem);
        for (Benchmark b : problem.getBenchmarks()) {
            problem.setCurrentState(b.getStart());
            bestFirstSolver.solve();
            System.out.println(b.getName() + " best-first solver test: " + bestFirstSolver.getSolution().getLength() + " moves");
        }
    }

}
