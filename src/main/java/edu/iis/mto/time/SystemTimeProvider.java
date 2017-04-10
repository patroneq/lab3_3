package edu.iis.mto.time;

public class SystemTimeProvider implements ITime {
    @Override
    public long currentTimeInMillis() {
        return System.currentTimeMillis();
    }
}