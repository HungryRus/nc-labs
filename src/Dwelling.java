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
        Flat[] getFlatsSorted = new Flat[getFlatsCount()];
        boolean swapped = true;
        for (int i = 0; i <floors.length-1 ; i++){
            swapped = false;
            for (int j = 0; j < floors.length - i - 1; j++)
            {//не хватает скобок, а еще floors.length это инт, а ты у него пытаешься достать элемент как у массива
                if (floors.length[j] > floors.length[j + 1])
                {
                    int temp = floors.length[j];
                    floors.length[j] = floors.length[j + 1];
                    floors.length[j + 1] = temp;
                    swapped = true;
                }

            if (swapped == false)
                break;
        }
            return getFlatsSorted;

        }
}
