package q3;

public class GenericDoubleLinkedList<T> {

    private GenericDoubleListItem<T> firstItem = null;

    public void deleteItem(T value) {
        if (firstItem != null) firstItem.delete(value);
        if (firstItem != null && firstItem.getValue().equals(value)) {
            firstItem = firstItem.getNextItem();
            firstItem.setPreviousItem(null);
        }
    }

    public void addItem(T value) {
        GenericDoubleListItem<T> item = new GenericDoubleListItem<T>(value);
        if (firstItem == null) firstItem = item;
        else firstItem.addItem(item);
    }

    public void printList() {
        if (firstItem != null) firstItem.printList();
    }

    public GenericDoubleListItem<T> getFirstItem() {
        return firstItem;
    }

    public void setFirstItem(GenericDoubleListItem<T> item) {
        firstItem = item;
    }

}
