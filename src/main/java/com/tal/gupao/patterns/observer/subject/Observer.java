package com.tal.gupao.patterns.observer.subject;


import com.tal.gupao.patterns.observer.core.Event;

/**
 * Created by Tom on 2018/3/17.
 */
public class Observer {

    public void advice(Event e){
        System.out.println("=========触发事件，打印日志========\n" + e);

        /*
        *  input
        *  input.addLisenter("click",function(){
        *
        *
        *  });
        *
        *
        * */
    }

}
