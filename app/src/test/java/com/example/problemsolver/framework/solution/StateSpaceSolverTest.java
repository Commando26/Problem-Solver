package com.example.problemsolver.framework.solution;

import com.example.problemsolver.domains.farmer.FarmerProblem;
import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Problem;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author tcolburn
 */
public class StateSpaceSolverTest {

    private Problem problem;
    private Solver bfsSolver;

    @Test
    public void testFarmerStateSpaceSolver() {
        problem = new FarmerProblem();
        bfsSolver = new BFSStateSpaceSolver(problem);
        bfsSolver.solve();
        assertTrue(bfsSolver.getSolution().getLength() == 7);
        System.out.println("FWGC state space solver test passed");
    }

    @Test
    public void testPuzzleStateSpaceSolver() {
        problem = new PuzzleProblem();
        bfsSolver = new BFSStateSpaceSolver(problem);
        for (Benchmark b : problem.getBenchmarks()) {
            problem.setCurrentState(b.getStart());
            bfsSolver.solve();
            assertTrue(bfsSolver.getSolution().getLength() == b.getSolutionLength());
            System.out.println(b.getName() + " state space solver test" + " passed");
        }
    }
}
