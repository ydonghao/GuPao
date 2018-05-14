package com.tal.gupao.patterns.factory;

import java.util.function.Supplier;

public interface Builder {
    void add(GirlFriendType girlFriendType, Supplier<GirlFriend> supplier);
}
