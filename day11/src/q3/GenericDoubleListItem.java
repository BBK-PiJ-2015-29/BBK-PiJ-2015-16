package q3;

public class GenericDoubleListItem<T> {
    private GenericDoubleListItem<T> previousItem = null;
    private T value;
    private GenericDoubleListItem<T> nextItem = null;

    public GenericDoubleListItem(T value) {
        this.value = value;
    }

    public void addItem(GenericDoubleListItem<T> item) {
        if (nextItem == null) {
            item.setPreviousItem(this);
            nextItem = item;
        } else nextItem.addItem(item);
    }

    public GenericDoubleListItem<T> getPreviousItem() {
        return previousItem;
    }

    public void setPreviousItem(GenericDoubleListItem<T> item) {
        previousItem = item;
    }

    public void printList() {
        System.out.println(value.toString());
        if (nextItem != null) nextItem.printList();
    }

    public T getValue() {
        return value;
    }

    public GenericDoubleListItem<T> getNextItem() {
        return nextItem;
    }

    public void setNextItem(GenericDoubleListItem<T> item) {
        nextItem = item;
    }

    public void delete(T item) {
        if (nextItem != null && nextItem.getValue().equals(item)) {
            nextItem = nextItem.getNextItem();
            nextItem.setPreviousItem(this);
        }

        if (nextItem != null) nextItem.delete(item);
    }

}
