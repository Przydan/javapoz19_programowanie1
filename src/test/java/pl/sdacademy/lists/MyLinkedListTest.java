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

    @Test
    public void getShouldReturnFirstElement() {
        // TODO - dopisać testy
    }

    @Test
    public void getShouldReturnLastElement() {
        // TODO - dopisać testy
    }

    @Test
    public void getShouldReturnMiddleElement() {
        // given
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(0);
        myLinkedList.add(10);
        myLinkedList.add(20);
        myLinkedList.add(30);
        myLinkedList.add(40);
        myLinkedList.add(50);

        // when
        Integer result = myLinkedList.get(3);

        // then
        Assert.assertEquals((Integer) 30, result);

    }
}