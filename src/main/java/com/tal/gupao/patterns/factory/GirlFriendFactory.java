package com.tal.gupao.patterns.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

public interface GirlFriendFactory {

    GirlFriend create(GirlFriendType area);

    static GirlFriendFactory girlFriendFactory(Consumer<Builder> consumer) {
        Map<GirlFriendType, Supplier<GirlFriend>> map = new HashMap<>();
        consumer.accept(map::put);
        return girlFriendType -> map.get(girlFriendType).get();
    }

}
