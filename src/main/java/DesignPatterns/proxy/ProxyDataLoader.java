package DesignPatterns.proxy;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class ProxyDataLoader implements DataLoader {

    private List<String> fileContent;

    private LocalTime lastFetchTime = LocalTime.now();


    @Override
    public List<String> fetchData() {
        long duration = ChronoUnit.SECONDS.between(lastFetchTime, LocalTime.now());
        if (fileContent == null || duration > 10) {
            fileContent = FileContentProvider.readLines();
            lastFetchTime = LocalTime.now();
            return fileContent;
        }
        return fileContent;
    }


}
