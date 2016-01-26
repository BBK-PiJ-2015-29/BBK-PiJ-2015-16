package q4;

import q3.GenericDoubleLinkedList;
import q3.GenericDoubleListItem;

public class GenericSortedList<T extends Number> extends GenericDoubleLinkedList<T> {

    @Override
    public void addItem(T value) {
        GenericDoubleListItem<T> item = new GenericSortedListItem<>(value);
        if (super.getFirstItem() == null) super.setFirstItem(item);
        else super.getFirstItem().addItem(item);
    }


}
