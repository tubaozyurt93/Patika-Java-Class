import com.example.houses.Apartment;
import com.example.houses.HolidayHome;
import com.example.houses.HouseService;
import com.example.houses.Villa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create house objects
        Villa villa1 = new Villa("Luxury Villa", 500000, 300, 5, 2);
        Villa villa2 = new Villa("Modern Villa", 350000, 250, 4, 1);
        Villa villa3 = new Villa("Cozy Villa", 250000, 200, 3, 2);

        HolidayHome holidayHome1 = new HolidayHome("Beachside Holiday Home", 150000, 100, 2, 1);
        HolidayHome holidayHome2 = new HolidayHome("Mountain Holiday Home", 200000, 150, 3, 1);
        HolidayHome holidayHome3 = new HolidayHome("Countryside Holiday Home", 120000, 120, 2, 2);

        Apartment apartment1 = new Apartment("City Apartment", 120000, 80, 2, 1);
        Apartment apartment2 = new Apartment("Suburban Apartment", 100000, 70, 2, 1);
        Apartment apartment3 = new Apartment("Penthouse Apartment", 250000, 120, 3, 2);

        // Create Service
        HouseService houseService = new HouseService(
                Arrays.asList(villa1, villa2, villa3),
                Arrays.asList(holidayHome1, holidayHome2, holidayHome3),
                Arrays.asList(apartment1, apartment2, apartment3)
        );

        // Print Results
        System.out.println("Total price of villas: " + houseService.getTotalPriceOfVillas());
        System.out.println("Total price of holiday homes: " + houseService.getTotalPriceOfHolidayHomes());
        System.out.println("Total price of apartments: " + houseService.getTotalPriceOfApartments());
        System.out.println("Total price of all houses: " + houseService.getTotalPriceOfAllHouses());

        System.out.println("Average area of villas: " + houseService.getAverageAreaOfVillas());
        System.out.println("Average area of holiday homes: " + houseService.getAverageAreaOfHolidayHomes());
        System.out.println("Average area of apartments: " + houseService.getAverageAreaOfApartments());
        System.out.println("Average area of all houses: " + houseService.getAverageAreaOfAllHouses());

        System.out.println("Filtered houses by rooms and living rooms (2 rooms, 1 living room): " +
                houseService.filterHousesByRoomsAndLivingRooms(2, 1));
    }
}
