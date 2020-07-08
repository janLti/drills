package org.jlue.drills;

import java.util.Optional;

public class SimpleStack<T> {

    private Optional<Item<T>> first = Optional.empty();
    private Optional<Item<T>> last = Optional.empty();

    public void push(T element) {
        if (!first.isPresent()) {
            first = Optional.of(new Item<>(element));
            last = first;
        } else {
            Optional<Item<T>> newFirst = Optional.of(new Item<>(element));
            newFirst.get().next = this.first;
            this.first = newFirst;
        }
    }

    public Optional<T> pop() {
        if (first.isPresent()) {
            Optional<Item<T>> retVal = first;
            if (first.get().next.isPresent()) {
                first = first.get().next;
            }else{
                first=Optional.empty();
            }
            return Optional.of(retVal.get().element);
        }

        return Optional.empty();
    }

    private static class Item<T> {
        private Optional<Item<T>> next = Optional.empty();
        private final T element;

        private Item(T element) {
            this.element = element;
        }
    }
}
