package com.example.problemsolver.framework.solution;

import com.example.problemsolver.domains.example.ExampleGraph;
import static com.example.problemsolver.domains.example.ExampleGraph.A;
import static com.example.problemsolver.domains.example.ExampleGraph.B;
import static com.example.problemsolver.domains.example.ExampleGraph.C;
import static com.example.problemsolver.domains.example.ExampleGraph.D;
import static com.example.problemsolver.domains.example.ExampleGraph.E;
import com.example.problemsolver.framework.graph.GraphSearcher;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the Solution class on the ExampleGraph.
 * @author tcolburn
 */
public class SolutionTest {

    public SolutionTest() {
        graph = new ExampleGraph();
        searcher = new GraphSearcher(graph);
    }

    @Test
    public void testBFS() {
        searcher.breadthFirstSearch(A);
        Solution solution = new Solution(A, D);    // Predecessor Tree:
        assertTrue(solution.getLength() == 2);     //
        assertTrue(solution.hasNext());            //       A
        assertTrue(solution.next() == A);          //     /   \
        assertTrue(solution.next() == B);          //    B     C
        assertTrue(solution.next() == D);          //    |     |
        assertFalse(solution.hasNext());           //    D     E
    }

    @Test
    public void testDFS() {
        searcher.depthFirstSearch(A);
        Solution solution = new Solution(A, D);    //       A
        assertTrue(solution.getLength() == 3);     //     /   \
        assertTrue(solution.hasNext());            //    B     C
        assertTrue(solution.next() == A);          //          |
        assertTrue(solution.next() == C);          //          E
        assertTrue(solution.next() == E);          //          |
        assertTrue(solution.next() == D);          //          D
        assertFalse(solution.hasNext());
    }

    private ExampleGraph graph;
    private GraphSearcher searcher;

}
