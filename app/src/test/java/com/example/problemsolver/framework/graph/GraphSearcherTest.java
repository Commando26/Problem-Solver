package com.example.problemsolver.framework.graph;

import com.example.problemsolver.domains.farmer.FarmerProblem;
import com.example.problemsolver.domains.puzzle.PuzzleProblem;
import com.example.problemsolver.framework.problem.Benchmark;
import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.State;
import com.example.problemsolver.framework.solution.Solution;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * @author tcolburn
 */
public class GraphSearcherTest {

    private Problem problem;
    private State initial;
    private State goal;
    private GraphCreator creator;
    private Graph graph;
    private GraphSearcher searcher;
    private Vertex start;
    private Vertex end;
    private Solution solution;

    @Test
    public void testFarmerGraphSearch() {
        problem = new FarmerProblem();
        createGraph();
        goal = problem.getFinalState();
        initial = problem.getInitialState();
        searchGraph();
        assertTrue(solution.getLength() == 7);
        System.out.println("Farmer graph search passed");
    }

    @Test
    public void testPuzzleGraphSearch() {
        problem = new PuzzleProblem();
        createGraph();
        for (Benchmark b : problem.getBenchmarks()) {
            initial = b.getStart();
            goal = b.getGoal();
            searchGraph();
            assertTrue(solution.getLength() == b.getSolutionLength());
            System.out.println("Puzzle " + b.getName() + " passed");
        }
    }

    private void createGraph() {
        creator = new GraphCreator();
        graph = creator.createGraphFor(problem);
    }

    private void searchGraph() {
        start = graph.find(new Vertex(initial));
        end = graph.find(new Vertex(goal));
        searcher = new GraphSearcher(graph);
        searcher.breadthFirstSearch(start);
        solution = new Solution(start, end);
    }
}
