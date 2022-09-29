package executors;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ThirdTaskExecutor {

    public String execute(String[] stringArray){

        return Arrays.stream(stringArray)
                .flatMap(string -> Arrays.stream(string.split(", ")))
                .sorted(String::compareTo)
                .collect(Collectors.joining(", "));
    }
}
