package com.tal.gupao.patterns.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void should_get_same_message_when_clone() {
        try {
            FineSoundingMessage msgPrototype = new FineSoundingMessage();
            FineSoundingMessage msgClone = msgPrototype.clone();
            Assert.assertEquals(msgPrototype.getMessage(), msgClone.getMessage());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
