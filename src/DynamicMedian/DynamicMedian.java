package DynamicMedian;

import PriorityQueue.MaxPQ;
import PriorityQueue.MinPQ;

public class DynamicMedian {
    private final MaxPQ<Integer> lower;
    private final MinPQ<Integer> upper;

    DynamicMedian() {
        lower = new MaxPQ<>();
        upper = new MinPQ<>();
    }

    public void insert(int a) {
        if (lower.isEmpty() || a <= lower.max()) {
            lower.insert(a);
            if (lower.size() == upper.size() + 2) {
                upper.insert(lower.delMax());
            }
        } else {
            upper.insert(a);
            if (upper.size() == lower.size() + 2) {
                lower.insert(upper.delMin());
            }
        }
    }

    //If number of elements is even, return the lower median
    public int median() {
        if (lower.size() >= upper.size()) {
            return lower.max();
        } else {
            return upper.min();
        }
    }

    public int removeMedian() {
        if (lower.size() >= upper.size()) {
            return lower.delMax();
        } else {
            return upper.delMin();
        }
    }
}
