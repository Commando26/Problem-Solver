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
public class AStarSolverTest {

    @Test
    public void testPuzzleAStarSolver() {
        Problem problem = new PuzzleProblem();
        AStarSolver aStarSolver = new AStarSolver(problem);
        for (Benchmark b : problem.getBenchmarks()) {
            problem.setCurrentState(b.getStart());
            aStarSolver.solve();
            assertTrue(aStarSolver.getSolution().getLength() == b.getSolutionLength());
            System.out.println(b.getName() + " A* solver test: " + " passed");
        }
    }

}
