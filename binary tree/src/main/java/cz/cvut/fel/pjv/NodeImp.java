package cz.cvut.fel.pjv;

class NodeImp implements Node{

    private int value;
    private NodeImp left;
    private NodeImp right;

    NodeImp() {
        left = null;
        right = null;
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setLeft(NodeImp left) {
        this.left = left;
    }

    public void setRight(NodeImp right) {
        this.right = right;
    }
}
