package DesignPatterns.Proxy;

import java.util.List;

public class DataLoaderImpl implements DataLoader {


    @Override
    public List<String> fetchData() {

        return new FileContentProvider().readLines();
    }


}
