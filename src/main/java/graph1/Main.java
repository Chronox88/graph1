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
        GraphMatrix graph = new GraphMatrix(5);
        graph.addVertex("1");//0
        graph.addVertex("2");//1
        graph.addVertex("3");//2
        graph.addVertex("4");//3
        graph.addVertex("5");//4

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 4);
        graph.addEdge(3, 4);
        graph.addEdge(2, 4);

        graph.displayGraph();
    }

}
