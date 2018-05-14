package com.tal.gupao.patterns.facotry;

import com.tal.gupao.patterns.factory.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Factory {

    private GirlFriendFactory girlFriendFactory;

    @Before
    public void girlFriendFactory() {
        girlFriendFactory = GirlFriendFactory.girlFriendFactory(builder -> {
            builder.add(GirlFriendType.AMERICAN_GIRL_FRIEND, AmericanGirlFriend::new);
            builder.add(GirlFriendType.CHINESE_GIRL_FRIEND, ChineseGirlFriend::new);
            builder.add(GirlFriendType.JAPANESE_GIRL_FRIEND, JapaneseGirlFriend::new);
            builder.add(GirlFriendType.THAILAND_GIRL_FRIEND, ThailandGirlFriend::new);
        });
    }

    @Test
    public void should_give_me_a_Chinese_girlfriend_when_I_am_in_China() {
        GirlFriend girlFriend = girlFriendFactory.create(GirlFriendType.CHINESE_GIRL_FRIEND);
        Assert.assertEquals("I am your Chinese girl friend!", girlFriend.toString());
    }

    @Test
    public void should_give_me_a_American_girlfriend_when_I_am_in_USA() {
        GirlFriend girlFriend = girlFriendFactory.create(GirlFriendType.AMERICAN_GIRL_FRIEND);
        Assert.assertEquals("I am your American girl friend!", girlFriend.toString());
    }

    @Test
    public void should_give_me_a_Japanese_girlfriend_when_I_am_in_Japan() {
        GirlFriend girlFriend = girlFriendFactory.create(GirlFriendType.JAPANESE_GIRL_FRIEND);
        Assert.assertEquals("I am your Japanese girl friend!", girlFriend.toString());
    }

    @Test
    public void should_give_me_a_Thailand_girlfriend_when_I_am_in_Thailand() {
        GirlFriend girlFriend = girlFriendFactory.create(GirlFriendType.THAILAND_GIRL_FRIEND);
        Assert.assertEquals("I am your Thailand girl friend!", girlFriend.toString());
    }
}
