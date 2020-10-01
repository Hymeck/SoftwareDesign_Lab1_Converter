package domain.mass.units;

import domain.mass.MassMetricUnit;
import domain.mass.MassUnits;

public class GramUnit extends MassMetricUnit
{
    public GramUnit() {super(MassUnits.Gram);}

    @Override
    public double getDefaultValue() {return 0.001;}

    @Override
    public String toString() { return "g";}
}
