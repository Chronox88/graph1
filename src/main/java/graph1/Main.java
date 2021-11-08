/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph1;

/**
 *
 * @author djeq
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix(4);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addEdge(1, 2);
        graph.addEdge(0, 2);
        graph.addEdge(3, 2);
        graph.displayGraph();
    }

}
