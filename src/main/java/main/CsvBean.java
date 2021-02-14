package main;

import com.opencsv.bean.CsvBindByName;

public class CsvBean {
    @CsvBindByName(column = "name")
    String name;
}
