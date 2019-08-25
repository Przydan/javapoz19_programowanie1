package pl.sdacademy.lists;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {

    @Test
    public void addShouldAddElementToEmptyList() {
        // given
        MyLinkedList myLinkedList = new MyLinkedList();

        // when
        myLinkedList.add(5);

        //then
        Assert.assertEquals(1, myLinkedList.size());
    }

    @Test
    public void addShouldAddElementToNonEmptyList() {
        // given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);

        // when
        myLinkedList.add(5);
        //then
        Assert.assertEquals(5, myLinkedList.size());
    }
}