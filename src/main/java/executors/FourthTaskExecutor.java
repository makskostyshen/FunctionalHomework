package executors;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FourthTaskExecutor {

    public Stream<Long> execute(Number a, Number c, Number m) {
        return Stream
                .generate(supplierGetter.apply(makeLongArray(a, c, m)));
    }


    private Function<Long[], Supplier<Long>> supplierGetter = (arguments) -> new Supplier<>() {
        long x = new Random().nextLong();
        long a = arguments[0];
        long c = arguments[1];
        long m = arguments[2];

        @Override
        public Long get() {
            x = (a * x + c) % m;
            return x;
        }
    };

    private Long[] makeLongArray(Number aN, Number cN, Number mN){
        Long a = aN.longValue();
        Long c = cN.longValue();
        Long m = mN.longValue();
        return new Long[]{a, c, m};
    }
}