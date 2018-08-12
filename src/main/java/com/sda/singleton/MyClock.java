package com.sda.singleton;

import java.time.Instant;

public class MyClock {

    private static MyClock instance = new MyClock();

    public static MyClock instanceOf() {
        return instance;
    }

    private MyClock (){
        //empty
    }

    public String getCurrentTimeAsString() {
        Instant date = Instant.now();
        return date.toString();
    }
}
