public class DwellingFloor
{
    private Flat[] flats;

    public DwellingFloor(int flatCount)
    {
        flats = new Flat[flatCount];
        for (int i = 0; i < flatCount; i++)
        {
            flats[i] = new Flat();
        }
    }

    public DwellingFloor(Flat[] flats)
    {
        this.flats = flats;
    }

    public int getFlatsCount()
    {
        return flats.length;
    }

    public int getCommonArea()
    {
        int commonArea = 0;
        for (int i = 0; i < getFlatsCount(); i++)
        {
            commonArea = commonArea + flats[i].getArea();
        }
        return commonArea;
    }

    public int getCommonRoomCount()
    {
        int commonRoomCount = 0;
        for (int i = 0; i < getFlatsCount(); i++)
        {
            commonRoomCount = commonRoomCount + flats[i].getRoomCount();
        }
        return commonRoomCount;
    }

    public Flat[] getFlats()
    {
        return flats;
    }

    public Flat getFlat(int flatNum)
    {
        return flats[flatNum];
    }

    public void setFlat(int flatNum, Flat newFlat)
    {
        flats[flatNum] = newFlat;
    }

    public void addFlat(int flatNum, Flat newFlat)
    {
        Flat[] newFlats = new Flat[flats.length + 1];
        for (int i = 0; i < newFlats.length; i++)
        {
            if (i < flatNum)
            {
                newFlats[i] = flats[i];
            }
            else if (i == flatNum)
            {
                newFlats[i] = newFlat;
            }
            else
            {
                newFlats[i] = flats[i - 1];
            }
        }
        flats = newFlats;
    }

    public void deleteFlat(int flatNum)
    {
        Flat[] newFlats = new Flat[flats.length - 1];
        for (int i = 0; i < newFlats.length; i++)
        {
            if (i < flatNum)
            {
                newFlats[i] = flats[i];
            }
            else
            {
                newFlats[i] = flats[i + i];
            }
        }
        flats = newFlats;
    }

    public Flat getBestSpace()
    {
        if (flats.length > 1)
        {
            Flat bestSpaceFlat = flats[0];
            for (int i = 1; i < flats.length; i++)
            {
                if (flats[i].getArea() > bestSpaceFlat.getArea())
                {
                    bestSpaceFlat = flats[i];
                }
            }
            return bestSpaceFlat;
        }
        else if (flats.length == 1)
        {
            return flats[0];
        }
        else
        {
            System.out.println("ERROR");
            return null;
        }
    }
}


