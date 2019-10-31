public class Main
{
    public static void main(String[] args)
    {
        //Создание здания Dwelling
        DwellingFloor floor0 = new DwellingFloor(1);
        DwellingFloor floor1 = new DwellingFloor(2);
        DwellingFloor floor2 = new DwellingFloor(3);
        DwellingFloor[] floors = {floor0, floor1, floor2};
        Dwelling dwelling1 = new Dwelling(floors);
        //Изменение площади 0-ой квартиры 0-ого этажа
        dwelling1.getFloor(1).getFlat(1).setArea(21321);
        dwelling1.setFlat(4, new asd.Flat(1000, 20));

        //Создание здания Dwelling другим путем
        int[] flatsInEachFloor = {1, 2, 3, 4};
        Dwelling dwelling2 = new Dwelling(flatsInEachFloor);

        //Вывод здания на экран
        printDwelling(dwelling1);
    }

    private static void printDwelling(final Dwelling dwelling)
    {
        //Проход циклом по всем этажам
        for (int i = 0; i < dwelling.getFloorsCount(); i++)
        {
            DwellingFloor floor = dwelling.getFloor(i);

            System.out.println("Этаж №" + i + ":");
            System.out.println("  Самая большая квартира: " + floor.getBestSpace().getArea());

            //Проход циклом по всем квартирам этажа
            for (int j = 0; j < floor.getFlats().length; j++)
            {
                asd.Flat flat = floor.getFlat(j);

                System.out.println(
                        "  Квартира №" + j + ": площадь " + flat.getArea() + ", комнат " + flat.getRoomCount());
            }
        }
    }
}
