package cz.cvut.fel.pjv;

public class Main {
    public static void main(String[] args) {
        int[] f = {1, 2, 3, 4, 5, 6, 7};
        int[] z = {};
        int[] s = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] d = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Tree first = new TreeImp();
        first.setTree(d);
        first.toString();
    }
}
