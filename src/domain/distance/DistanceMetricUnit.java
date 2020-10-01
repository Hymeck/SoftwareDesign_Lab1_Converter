package domain.distance;

import core.MagnitudeMetricUnit;

public abstract class DistanceMetricUnit extends MagnitudeMetricUnit
{
    protected DistanceMetricUnit(DistanceUnits unit) { super(unit); }
}
