package com.tal.gupao.patterns.adapter;

import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void should_get_data_from_android_when_i_give_my_phone_num() {
        User user = new User(new IOS());
        Assert.assertEquals("13711324133", user.getData("13711324133").toString());
    }

}
