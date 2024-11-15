package truePackage2;

import java.util.function.Function;

public class FunctionalProgram {
    public static Function<Integer, Function<Integer, Integer>> add = a -> b -> (a * b);

    public static void main(String[] args) {
	int result = add.apply(10).apply(15);
	System.out.println(result);
    }
}
