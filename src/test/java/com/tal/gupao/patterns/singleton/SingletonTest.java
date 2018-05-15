package com.tal.gupao.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class SingletonTest {

    @Test
    public void should_get_real_me_when_create_two_object_in_memory() {
        Tal tal1 = Tal.getInstance();
        Tal tal2 = Tal.getInstance();
        Assert.assertEquals(tal1, tal2);
    }

    @Test
    public void should_get_only_one_when_multi_thread_run() {
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    LazyTal tal1 = LazyTal.getInstance();
                    LazyTal tal2 = LazyTal.getInstance();
                    Assert.assertEquals(tal1, tal2);
                }
            });
        }

        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }

}
