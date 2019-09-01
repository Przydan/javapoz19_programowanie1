package pl.sdacademy.recursive;

import java.util.ArrayList;
import java.util.List;

public class Tree {
    private TreeItem root;

    public void addIteration(int value) {
        TreeItem cursor = root;
        TreeItem itemToAdd = new TreeItem(value);

        while (true) {
            if (value > cursor.value) {
                if (cursor.right != null) {
                    cursor = cursor.right;
                } else {
                    cursor.right = itemToAdd;
                    break;
                }
            } else {
                if (cursor.left != null) {
                    cursor = cursor.left;
                } else {
                    cursor.left = itemToAdd;
                    break;
                }
            }
//            cursor = value > cursor.value ?
//                    cursor.right :
//                    cursor.left;
//
//            if (value > cursor.value) {
//                cursor = cursor.right;
//            } else {
//                cursor = cursor.left;
//            }
        }
    }

    public void addRecursive(int value) {
        if (root == null) {
            root = new TreeItem(value);
        } else {
            addItem(root, new TreeItem(value));
        }
    }

    public List<Integer> treeInOrder() {
        if (root == null) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        collectPreOrder(list, root);
        return list;
    }

    private void collectPreOrder(List<Integer> list, TreeItem item) {
        list.add(item.value);
        if (item.left != null) {
            collectPreOrder(list, item.left);
        }

        if (item.right != null) {
            collectPreOrder(list, item.right);
        }
    }

    private void addItem(TreeItem to, TreeItem itemToAdd) {
        if (itemToAdd.value <= to.value) {
            addLeft(to, itemToAdd);
        } else {
            addRight(to, itemToAdd);
        }

    }

    private void addRight(TreeItem to, TreeItem itemToAdd) {
        if (to.right != null) {
            addItem(to.right, itemToAdd);
        } else {
            to.right = itemToAdd;
        }
    }

    private void addLeft(TreeItem to, TreeItem itemToAdd) {
        if (to.left != null) {
            addItem(to.left, itemToAdd);
        } else {
            to.left = itemToAdd;
        }
    }

    private static class TreeItem {
        private int value;
        private TreeItem left;
        private TreeItem right;

        public TreeItem(int value) {
            this.value = value;
        }
    }
}
