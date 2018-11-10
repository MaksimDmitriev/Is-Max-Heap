package com.app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void empty() {
        Solution solution = new Solution();
        assertTrue(solution.isMaxHeap(new int[]{}, 0));
    }

    @Test
    void single() {
        Solution solution = new Solution();
        assertTrue(solution.isMaxHeap(new int[]{1}, 0));
    }

    @Test
    void hasOnlyLeft() {
        Solution solution = new Solution();
        assertTrue(solution.isMaxHeap(new int[]{10, 2}, 0));
    }

    @Test
    void hasLeftAndRight() {
        Solution solution = new Solution();
        assertTrue(solution.isMaxHeap(new int[]{10, 3, 4}, 0));
    }

}