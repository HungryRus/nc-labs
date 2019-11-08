package buildings;

public class Dwelling
{

    private DwellingFloor[] floors;


    public Dwelling(int[] flatsInEachFloor)
    {
        int floorsCount = flatsInEachFloor.length;

        //   floors = {null, null, null, null}
        floors = new DwellingFloor[floorsCount];

        for (int i = 0; i < floorsCount; i++)
        {
            floors[i] = new DwellingFloor(flatsInEachFloor[i]);
        }
    }

    public Dwelling(DwellingFloor[] floors)
    {
        this.floors = floors;
    }

    public int getFloorsCount()
    {
        return this.floors.length;
    }

    public int getFlatsCount()
    {
        int flatsCount = 0;
        for (int i = 0; i < floors.length; i++)
        {
            flatsCount += floors[i].getFlatsCount();
        }

        return flatsCount;
    }

    public int getCommonArea()
    {
        int commonArea = 0;
        for (int i = 0; i < floors.length; i++)
        {
            commonArea += floors[i].getCommonArea();
        }

        return commonArea;
    }

    public int getCommonRoomCount()
    {
        int commonRoomCount = 0;
        for (int i = 0; i < floors.length; i++)
        {
            commonRoomCount += floors[i].getCommonRoomCount();
        }

        return commonRoomCount;
    }

    public DwellingFloor[] getFloors()
    {
        return floors;
    }

    public DwellingFloor getFloor(int floorNum)
    {
        return floors[floorNum];
    }

    public void setFloor(int floorNum, DwellingFloor newFloor)
    {
        floors[floorNum] = newFloor;
    }

    public Flat getFlat(int flatNum)
    {
        for (int i = 0; i < floors.length; i++)
        {
            if (flatNum < floors[i].getFlatsCount())
            {
                return floors[i].getFlat(flatNum);
            }
            else
            {
                flatNum = flatNum - floors[i].getFlatsCount();
            }
        }
        System.out.println("Error");
        return null;
    }


    public void setFlat(int flatNum, Flat newFlat)
    {
        for (int i = 0; i < floors.length; i++)
        {
            if (flatNum < floors[i].getFlatsCount())
            {
                floors[i].setFlat(flatNum, newFlat);
                break;
            }
            else
            {
                flatNum = flatNum - floors[i].getFlatsCount();
            }
        }
    }

    public void addFlat(int flatNum, Flat newFlat)
    {
        for (int i = 0; i < floors.length; i++)
        {
            if (flatNum < floors[i].getFlatsCount())
            {
                floors[i].addFlat(flatNum, newFlat);
                break;
            }
            else
            {
                flatNum = flatNum - floors[i].getFlatsCount();
            }

        }
    }

    public void deleteFlat(int flatNum)
    {
        for (int i = 0; i < floors.length; i++)
        {
            if (flatNum < floors[i].getFlatsCount())
            {
                floors[i].deleteFlat(flatNum);
                break;
            }
            else
            {
                flatNum = flatNum - floors[i].getFlatsCount();
            }
        }
    }

    public Flat getBestSpace()
    {
        Flat bestSpace = floors[0].getBestSpace();

        if (floors.length > 1)
        {
            for (int i = 1; i < floors.length; i++)
            {
                if (floors[i].getBestSpace().getArea() > bestSpace.getArea())
                {
                    bestSpace = floors[i].getBestSpace();
                }
            }
            return bestSpace;
        }
        else if (floors.length == 1)
        {
            return floors[0].getBestSpace();
        }
        else
        {
            System.out.println("ERROR");
            return null;
        }
    }

    public Flat[] getFlatsSorted()
    {
        Flat[] flatsSorted = new Flat[getFlatsCount()];
        int pointer = 0;
        for (int i = 0; i < floors.length; i++)
        {
            for (int j = 0; j < floors[i].getFlatsCount(); j++)
            {
                flatsSorted[pointer++] = floors[i].getFlat(j);
            }
        }
        boolean swapped = true;
        Flat temp;
        while (swapped)
        {
            swapped = false;
            for (int i = 0; i < flatsSorted.length - 1; i++)
            {
                if (flatsSorted[i].getArea() > flatsSorted[i + 1].getArea())
                {
                    temp = flatsSorted[i];
                    flatsSorted[i] = flatsSorted[i + 1];
                    flatsSorted[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        return flatsSorted;
    }
}

