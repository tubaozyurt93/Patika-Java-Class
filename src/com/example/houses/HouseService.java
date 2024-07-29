package com.example.houses;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseService {

    private List<House> houses;

    // Constructor
    public HouseService(List<Villa> villas, List<HolidayHome> holidayHomes, List<Apartment> apartments) {
        this.houses = Stream.concat(
                Stream.concat(villas.stream(), holidayHomes.stream()),
                apartments.stream()
        ).collect(Collectors.toList());
    }


    // Methods
    public double getTotalPriceOfHouses() {
        return houses.stream()
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getTotalPriceOfVillas() {
        return houses.stream()
                .filter(house -> house instanceof Villa)
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getTotalPriceOfHolidayHomes() {
        return houses.stream()
                .filter(house -> house instanceof HolidayHome)
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getTotalPriceOfApartments() {
        return houses.stream()
                .filter(house -> house instanceof Apartment)
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getAverageAreaOfHouses() {
        return houses.stream()
                .mapToDouble(House::getArea)
                .average()
                .orElse(0);
    }

    public double getAverageAreaOfVillas() {
        return houses.stream()
                .filter(house -> house instanceof Villa)
                .mapToDouble(House::getArea)
                .average()
                .orElse(0);
    }

    public double getAverageAreaOfHolidayHomes() {
        return houses.stream()
                .filter(house -> house instanceof HolidayHome)
                .mapToDouble(House::getArea)
                .average()
                .orElse(0);
    }

    public double getAverageAreaOfApartments() {
        return houses.stream()
                .filter(house -> house instanceof Apartment)
                .mapToDouble(House::getArea)
                .average()
                .orElse(0);
    }

    public List<House> filterHousesByRoomsAndLivingRooms(int minRooms, int minLivingRooms) {
        return houses.stream()
                .filter(house -> house.getRooms() >= minRooms && house.getLivingRooms() >= minLivingRooms)
                .collect(Collectors.toList());
    }

    public double getTotalPriceOfAllHouses() {
        return houses.stream()
                .mapToDouble(House::getPrice)
                .sum();
    }

    public double getAverageAreaOfAllHouses() {
        return houses.stream()
                .mapToDouble(House::getArea)
                .average()
                .orElse(0);
    }
}
