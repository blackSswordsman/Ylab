package com.astra;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public  class WorkingSpace {

    private String name;
    private Map<String, WorkingSpace> workingSpaces= new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkingSpace(String name) {
        this.name = name;
    }

    public void createWorkingSpace(String name){
        WorkingSpace workingSpace = new WorkingSpace(name);
        workingSpaces.put(name, workingSpace);
    }

    public void updateWorkingSpace(String name){
        workingSpaces.replace(name, workingSpaces.get(name));
    }

    public void deleteWorkingSpace(String name){
        workingSpaces.remove(name);
    }
    /*public int getFreeSpace(){
        return 1;
    }*/




}
