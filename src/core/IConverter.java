package core;

public interface IConverter<M extends Magnitude, MU extends MagnitudeMetricUnit>
{
    M Convert(M from, MU to);
}
