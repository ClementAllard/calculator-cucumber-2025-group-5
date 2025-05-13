package calculator.expression.operator.function.random;

import calculator.IllegalConstruction;
import calculator.expression.Expression;
import calculator.expression.number.*;

import java.util.List;
import java.util.Random;

public class RandomIntegerSeed extends FunctionRandomBinary {
    public RandomIntegerSeed(List<Expression> elist) throws IllegalConstruction {
        super(elist, "rIntSeed");
    }

    private MyNumber randomInt(int max, long seed) {
        Random random = new Random(seed);
        // Generates between a and b (inclusive)
        return new MyInteger(random.nextInt(max + 1));
    }

    @Override
    protected MyNumber randomNumber(int max, long seed) {
        return null;
    }

    @Override
    protected MyNumber op(MyInteger l, MyInteger r) {
        return randomInt(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyRational r) {
        return randomInt(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyReal r) {
        return randomInt(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyInteger l, MyComplex r) {
        return randomInt(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyInteger r) {
        return randomInt(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyRational r) {
        return randomInt(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyReal r) {
        return randomInt(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyRational l, MyComplex r) {
        return randomInt(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyInteger r) {
        return randomInt(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyRational r) {
        return randomInt(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyReal r) {
        return randomInt(l.getValue().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyReal l, MyComplex r) {
        return randomInt(l.getValue().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyInteger r) {
        return randomInt(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyRational r) {
        return randomInt(l.getReal().intValue(), r.getReal().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyReal r) {
        return randomInt(l.getReal().intValue(), r.getValue().longValue());
    }

    @Override
    protected MyNumber op(MyComplex l, MyComplex r) {
        return randomInt(l.getReal().intValue(), r.getReal().longValue());
    }
}
