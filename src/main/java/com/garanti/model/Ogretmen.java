package com.garanti.model;

public class Ogretmen
{
    private Integer ID;

    private String NAME;

    private boolean IS_GICIK;

    public String getNAME()
    {
        return NAME;
    }

    public Integer getID()
    {
        return ID;
    }

    public boolean isIS_GICIK()
    {
        return IS_GICIK;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", IS_GICIK=" + IS_GICIK +
                '}';
    }

    public Ogretmen(String NAME, boolean IS_GICIK)
    {
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
    }

    // insert yaparken bunu kullanmayın
    public Ogretmen(Integer ID, String NAME, boolean IS_GICIK)
    {
        this.ID = ID;
        this.NAME = NAME;
        this.IS_GICIK = IS_GICIK;
    }
}