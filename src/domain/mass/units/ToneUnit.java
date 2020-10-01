package domain.mass.units;

import domain.mass.MassMetricUnit;
import domain.mass.MassUnits;

public class ToneUnit extends MassMetricUnit
{
    public ToneUnit() { super(MassUnits.Tone); }

    @Override
    public double getDefaultValue() {return 1000; }

    @Override
    public String toString() { return "t";}
}
