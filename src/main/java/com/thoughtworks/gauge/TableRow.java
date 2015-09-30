package com.thoughtworks.gauge;

import java.util.HashMap;

public class TableRow{
    private HashMap<String, String> cells = new HashMap<String, String>();

    public String getCell(String columnName){
        if (!cells.containsKey(columnName)){
            return "";
        }
        return cells.get(columnName);
    }

    public void addCell(String columnName, String value) {
        cells.put(columnName, value);
    }

    public int size() {
        return cells.size();
    }

    @Override
    public String toString() {
        return "TableRow{" +
                "cells=" + cells +
                '}';
    }
}
