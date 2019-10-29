public class Main
{
    public static void main(String[] args)
    {
        int[] flatsInEachFloor = {1, 2, 3, 4};
        Dwelling dwelling = new Dwelling(4, flatsInEachFloor);
        DwellingFloor[] floors = dwelling.getFloors();

        for (int i = 0; i < floors.length; i++)
        {
            DwellingFloor floor = dwelling.getFloor(i);
            Flat[] flats = floor.getFlats();

            System.out.println("Этаж №" + i + ":");
            System.out.println("  Самая большая квартира: " + floor.getBestSpace());

            for (int j = 0; j < flats.length; j++)
            {
                Flat flat = floor.getFlat(j);

                System.out.println(
                        "  Квартира №" + j + ": площадь " + flat.getArea() + ", комнат " + flat.getRoomCount());
            }
        }
    }

}
