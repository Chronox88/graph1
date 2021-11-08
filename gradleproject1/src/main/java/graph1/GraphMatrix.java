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
public class GraphMatrix {

    private int MAX_VERTS = 5;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;

    public GraphMatrix(int maxVerts) {
        this.MAX_VERTS=maxVerts;
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
    }

    public void addVertex(String lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public void displayGraph() {
        System.out.print("  ");
        for (int j = 0; j < MAX_VERTS; j++) {
            System.out.print(vertexList[j]!=null?vertexList[j].label+" " : "- ");
        }
        System.out.println();
        for (int j = 0; j < MAX_VERTS; j++) {
            System.out.print(vertexList[j]!=null?vertexList[j].label+" " : "- ");
            for (int k = 0; k < MAX_VERTS; k++) {
                System.out.print(adjMat[j][k] + " ");
            }
            System.out.println();
        }
    }
}
