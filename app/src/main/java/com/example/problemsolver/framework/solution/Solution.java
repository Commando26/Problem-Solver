package com.example.problemsolver.framework.solution;

import com.example.problemsolver.framework.graph.Vertex;
import java.util.Iterator;
import java. util. Stack;
/**
 *
 * @author tcolburn/George Popov
 */
public class Solution implements Iterator<Vertex> {
    private Stack<Vertex> S1;
    private Vertex ver;
    /**
     * Creates an object that represents a path from a start
     * vertex to an end vertex in a problem solving domain.
     * This constructor will be called after a search has been
     * initiated on the start vertex.
     * If a path from start to end exists, it can be constructed
     * from the predecessor information stored in the end vertex.
     * @param start the start vertex
     * @param end the end vertex
     */
    public Solution(Vertex start, Vertex end) {
        ver = null;
        S1 = new Stack<Vertex>();
        Vertex ver = end;

        //while(curr = end);

        while(ver != null){
            S1.push(ver);

            ver = ver.getPredecessor();
            if(ver.equals(start)){
                S1.push(ver);
                ver = null;
            }
        }
        if (S1.peek() !=start){
            S1.clear();
        }
        /*
       stack = new Stack<>();
       Vertex v = end;
       stack.push(end);
       while(v!=null){
           end=end.getPredecessor();
           stack.push(end);

       }
       stack.push(stack);
        // You must provide
    }

*/
    }
    /**
     * Gets the length of the solution.
     * This is the number of moves in the solution, not the
     * number of vertices.
     * @return the solution length
     */
    public int getLength() {
        return S1.size()-1;
        // You must provide
        //return 0;
    }

    /**
     * Checks whether there are more vertices in this solution.
     * @return true if there are more vertices in this solution, false
     * otherwise
     */
    @Override
    public boolean hasNext() {

        return !S1.isEmpty();
        // You must provide
        //return false;
    }

    /**
     * Removes and returns the next vertex in this solution.
     * @return the next vertex in this solution
     * @throws RuntimeException if there are no more vertices
     */
    @Override
    public Vertex next() {

        ver= S1.pop();
        return ver;
        // You must provide
        //return null;
    }

    // Private instance fields here

}