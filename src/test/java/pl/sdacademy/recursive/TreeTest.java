package pl.sdacademy.recursive;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TreeTest {

    @Test
    public void addRecursive() {
        // given
        Tree tree = new Tree();

        // when
        tree.addRecursive(6);
        tree.addRecursive(4);
        tree.addRecursive(2);
        tree.addRecursive(9);
        tree.addRecursive(5);
        tree.addRecursive(7);
        tree.addRecursive(13);
        tree.addRecursive(12);
        tree.addRecursive(14);

        // then
        List<Integer> expected = Arrays.asList(6, 4, 2, 5, 9, 7, 13, 12, 14);
        List<Integer> actual = tree.treeInOrder();
        Assert.assertEquals(expected, actual);


    }
}