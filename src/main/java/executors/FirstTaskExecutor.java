package executors;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FirstTaskExecutor {

    Supplier<Function<String, String>> functionSupplier = () -> new Function<>() {
        private int counter = 0;

        @Override
        public String apply(String s) {
            counter += 1;
            if(counter % 2 != 0){
                return null;
            }
            return (counter - 1) + ". " + s;
        }
    };

    public String execute(List<String> stringList){

        return stringList.stream()
                .map(functionSupplier.get())
                .filter(Objects::nonNull)
                .collect(Collectors.joining(", "));
    }
}
