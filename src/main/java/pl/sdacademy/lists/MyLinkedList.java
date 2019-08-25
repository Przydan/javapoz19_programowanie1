package pl.sdacademy.lists;

public class MyLinkedList {

    private MyLinkedListItem head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(Integer value) {
        //1. tworzymy nowy item
        //2. przechodzimy na koniec
        //3. i dodajemy itemsize
        MyLinkedListItem myLinkedListItem = new MyLinkedListItem(value);

        if (this.head == null) {
            this.head = myLinkedListItem;
        } else {
            MyLinkedListItem lastItem = getLastItem();
            lastItem.nextItem = myLinkedListItem;
        }
        size++;
    }

    public int size() {
        return size;
    }

    //TODO - obsługa pustej listy
    //TODO - obsluga blednego indexu (ArrayIndexOutOfBoundException)
    public Integer get(int index) {
        return getElement(index).value;
    }

    private MyLinkedListItem getElement(int index) {
        MyLinkedListItem tmpItem = head;
        for (int i = 0; i < index; i++) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    public void remove(int index) {
        // 1. pobieramy poprzednik elementu index
        // 2. pobieramy element do usuniecia
        // 3. zmieniamy nextValue w poprzedniku na NextValue elementu ktory usuwamy
        // 4. w usuwanym elemencie nullujemy nextValue
        MyLinkedListItem previousElement = getElement(index - 1);
        MyLinkedListItem toRemove = getElement(index);

        previousElement.nextItem = toRemove.nextItem;

        toRemove.nextItem = null;
        size--;

    }



    public void add(int index, Integer value) {
        //TODO - add na indexie pluss tests
        //1. tworzymy nowy element
        //2. ustawiamy wskaźnik na nasteny elemnt
        //3. poprzednik wskaźnik na nowy element
        //na 31.08 ZD
        // TODO - brakujace testy do get, 
    }

    private MyLinkedListItem getLastItem() {
        MyLinkedListItem tmpItem = this.head;
        while (tmpItem.nextItem != null) {
            tmpItem = tmpItem.nextItem;
        }
        return tmpItem;
    }

    static class MyLinkedListItem {
        private Integer value;
        private MyLinkedListItem nextItem;

        private MyLinkedListItem(Integer value) {
            this.value = value;
        }
    }
}
