package edu.iis.mto.time;

public class CustomTimeProvider implements ITime {

    private final static long ONE_DAY_AND_ONE_HOUR = 25*60*60*1000;

    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis() + ONE_DAY_AND_ONE_HOUR;
    }
}