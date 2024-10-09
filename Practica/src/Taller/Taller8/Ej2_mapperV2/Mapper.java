package Taller.Taller8.Ej2_mapperV2;

@FunctionalInterface
public interface Mapper<ValueIn, ValueOut> {

    ValueOut map(ValueIn valueIn);

}

