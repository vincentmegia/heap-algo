package com.vincentmegia;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class HeapAlgoTest {
    @Test
    public void testPermutate() {
        String[] array = new String[] {"a", "b", "c"};
        var heapAlgo = new HeapAlgo();
        heapAlgo.permutate(array, array.length);
        List<String> list = heapAlgo.getList();
        Collections.sort(list);

    }
}
