package ua.roman.flats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {

    @Autowired
    private Collector collector;

    @Autowired
    private DataSaver dataSaver;

    public void run(){
        var advertisements = collector.collectData();
        dataSaver.saveData(advertisements);
    }
}
