package domain.time;

import core.IConverter;

public class TimeConverter implements IConverter<Time, TimeMetricUnit>
{
    @Override
    public Time Convert(Time from, TimeMetricUnit to)
    {
        double value = from.value;
        double fromValue = from.unit.getDefaultValue();
        double toValue = to.getDefaultValue();
        double factor = fromValue / toValue;
        return new Time(to, value * factor);
    }
}
