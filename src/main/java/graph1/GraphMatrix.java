package graph1;

/**
 *
 * @author Kevin Setyadi
 */
public class GraphMatrix {

    private int MAX_VERTS = 5;
    private Vertex vertexList[];
    private int adjMat[][];
    private int nVerts;
    private Queue theQueue;
    

    public GraphMatrix(int maxVerts) {
        this.MAX_VERTS = maxVerts;
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for (int j = 0; j < MAX_VERTS; j++) {
            for (int k = 0; k < MAX_VERTS; k++) {
                adjMat[j][k] = 0;
            }
        }
        theQueue = new Queue();   
    }

    public void addVertex(String lab) {
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public int getAdjUnvisitedVertex(int v) {
        for(int j=0; j<nVerts; j++)
            if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
                return j;
        return -1;
    }

    public void bfs() {
        // begin at vertex 0
        vertexList[0].wasVisited = true; // mark it
        displayVertex(0); // display it
        theQueue.insert(0); // insert at tail
        int v2;
        while( !theQueue.isEmpty() ) {
            int v1 = theQueue.remove();
            // until it has no unvisited neighbors
            while( (v2=getAdjUnvisitedVertex(v1)) != -1 ) {
                // get one,
                vertexList[v2].wasVisited = true; // mark it
                displayVertex(v2); // display it
                theQueue.insert(v2); // insert it
            } // end while
        } // end while(queue not empty)
        // queue is empty, so we're done
        for(int j=0; j<nVerts; j++) // reset flags
            vertexList[j].wasVisited = false;
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
