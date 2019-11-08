package buildings;

public class Flat
{
    private int area;
    private int roomCount;

    public static final int DEFAULT_AREA = 50;
    public static final int DEFAULT_ROOM_COUNT = 2;

    public Flat()
    {
        this(DEFAULT_AREA, DEFAULT_ROOM_COUNT);
    }

    public Flat(int area)
    {
        this(area, DEFAULT_ROOM_COUNT);
    }

    public Flat(int area, int roomCount)
    {
        this.area = area;
        this.roomCount = roomCount;
    }

    public int getArea()
    {
        return area;
    }

    public void setArea(int area)
    {
        if (area > 0)
        {
            this.area = area;
        }
        else
        {
            System.out.println("Ошибка ввода площади квартиры");
        }
    }

    public int getRoomCount()
    {
        return roomCount;
    }

    public void setRoomCount(int roomCount)
    {
        if (roomCount > 0)
        {
            this.roomCount = roomCount;
        }
        else
        {
            System.out.println("Ошибка ввода количества комнат");
        }
    }
}



