package Taller.Taller8.Ej1_mapperV1;

@FunctionalInterface
public interface Mapper<ValueIn, ValueOut> {

    ValueOut map(ValueIn valueIn);

}
