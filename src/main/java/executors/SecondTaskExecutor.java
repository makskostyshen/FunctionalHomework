package executors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTaskExecutor {

    public List<String> execute(List<String> unsortedStrings){

        return unsortedStrings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
