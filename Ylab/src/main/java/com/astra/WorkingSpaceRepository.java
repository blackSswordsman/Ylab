package com.astra;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class WorkingSpaceRepository {
    public static final WorkingSpaceRepository INSTANCE = new WorkingSpaceRepository();
    private final Map<String,WorkingSpace> workingSpaceMap = new ConcurrentHashMap<>();

    public void save(WorkingSpace workingSpace){

    }
}

