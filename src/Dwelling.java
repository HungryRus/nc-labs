package main;

public class Dwelling
{
    private DwellingFloor[] floors;

    public Dwelling(int floorsCount, int[] flatsInEachFloor)
    {
        this.floors = new DwellingFloor[floorsCount];
        for (int i = 0; i < floorsCount; i++)
        {
            this.floors[i] = new DwellingFloor(flatsInEachFloor[i]);
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
            if (flatNum >= floors[i].getFlatsCount())
            {
                flatNum -= floors[i].getFlatsCount();
            }
            else
            {
                return floors[i].getFlat(flatNum);
            }
        }
        System.out.println("Error");
        return null;
    }

}
