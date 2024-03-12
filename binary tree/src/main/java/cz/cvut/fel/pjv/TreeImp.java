package cz.cvut.fel.pjv;

import java.util.Arrays;

class TreeImp extends Tree{

    NodeImp start;
    int calc;

    public TreeImp(){
        start = null;
    };

    @Override
    public void setTree(int[] values) {
        if (values.length == 0){
            return;
        }
        start = new NodeImp();
        set_value(values, start);
    }

    private void set_value(int[] values, NodeImp node){
        node.setValue(values[(values.length / 2)]);
        if (values.length == 1){
            return;
        }
        int [] leftSubArray = Arrays.copyOfRange(values, 0, values.length / 2);
        if (leftSubArray.length > 0) {
            NodeImp leftChild = new NodeImp();
            node.setLeft(leftChild);
            set_value(leftSubArray, leftChild);
        }
        int [] rightSubArray = Arrays.copyOfRange(values, (values.length / 2) + 1, values.length);
        if (rightSubArray.length > 0) {
            NodeImp rightChild = new NodeImp();
            node.setRight(rightChild);
            set_value(rightSubArray, rightChild);
        }
    }

    @Override
    public Node getRoot() {
        if (start == null) {
            return null;
        }
        return start;
    }

    @Override
    public String toString() {
        if (start == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        toStringBuild(start, sb, 0);
        return sb.toString();
    }

    private void toStringBuild(Node node, StringBuilder sb, int depth) {
        if (node != null) {
            for (int i = 0; i < depth; i++) {
                sb.append(" ");
            }
            sb.append("- ").append(node.getValue()).append("\n");

            toStringBuild(node.getLeft(), sb, depth + 1);
            toStringBuild(node.getRight(), sb, depth + 1);
        }
    }


};
