package org.example;

import java.util.Iterator;

public class RangeStepByStep implements Iterable{

    private int start;
    private int end;
    private int step = 1;

    public static void main(String[] args) {

        for (Object integer : new RangeStepByStep(1, 100)) {
            System.out.println(integer);
        }

        for (Object integer : new RangeStepByStep(1, 100, 20)) {
            System.out.println(integer);
        }

    }

    public RangeStepByStep(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public RangeStepByStep(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RangeIterator();
    }

    private class RangeIterator implements Iterator<Integer> {

        private int curInt;

        private RangeIterator() {
            curInt = start;
        }

        @Override
        public boolean hasNext() {
            return curInt <= end;
        }

        @Override
        public Integer next() {

            if (!hasNext()) {
                return null;
            }

            int tmp = curInt;
            curInt = curInt + step;
            return tmp;

        }
    }

}
