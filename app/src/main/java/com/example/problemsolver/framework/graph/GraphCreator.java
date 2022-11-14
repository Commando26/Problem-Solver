package com.example.problemsolver.framework.graph;

import com.example.problemsolver.framework.problem.Problem;
import com.example.problemsolver.framework.problem.Mover;
import com.example.problemsolver.framework.problem.State;
import java.util.Stack;
import java.util.List;
import com.example.problemsolver.framework.graph.Vertex;
/**
 * @author George Popov
 */
public class GraphCreator {

    private Vertex start;

    private Vertex u;
    private Stack<Vertex> stack = null;
    private Graph graph = null;


    private List<String> moves;



    public Graph createGraphFor(Problem problem) {
        graph = new Graph();
        stack = new Stack();

        start = new Vertex(problem.getInitialState());
        stack.push(start);
        moves = problem.getMover().getMoveNames();

        while(!stack.isEmpty()){
            u = (Vertex)stack.pop();
            for(int i=0; i<moves.size(); i++){
                State next = problem.getMover().doMove(moves.get(i),(State)u.getData());

                if(next != null){
                    Vertex v = new Vertex(next);
                    if(graph.getVertices().containsKey(v)){
                        v = graph.getVertices().get(v);
                    }
                    else{
                        stack.push(v);
                    }

                    graph.addEdge(u,v);
                }
            }

        }
        return graph;
    }

}