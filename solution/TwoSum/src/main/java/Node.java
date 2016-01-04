import java.util.Comparator;

/**
 * Created by yes on 4/1/16.
 */
public class Node implements Comparable<Node>{
    private int pos;
    private int num;

    @Override
    public int compareTo(Node node) {
        if (this.num == node.getNum()) {
            return 0;
        } else if (this.num > node.getNum()) {
            return 1;
        }else{
            return -1;
        }
    }
    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Node(int pos, int num) {

        this.pos = pos;
        this.num = num;
    }
}
