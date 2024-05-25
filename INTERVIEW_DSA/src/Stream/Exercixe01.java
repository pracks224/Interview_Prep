package Stream;

import Stream.model.City;
import Stream.model.Country;

import java.util.*;
import java.util.stream.Collectors;
import java.util.concurrent.ConcurrentHashMap;

public class Exercixe01 {
    private static Map<String, Country> countries = new ConcurrentHashMap<>();
    private static Map<Integer, City> cities = new ConcurrentHashMap<>();
    private static Set<String> continents = new HashSet<>();
    public static void main(String[] args) {
        createCities1();
        createCountries();
        for (City city : cities.values()) {
            Country country = countries.get(city.getCountryCode());
            if (country == null) {
                System.out.println("No such countryCode: "
                        + city.getCountryCode());
                continue;
            }
            country.getCities().add(city);
        }
        for (Country country : countries.values())
            continents.add(country.getContinent());
        // Find the most populated city of each continent
        var highPopulatedCityOfEachContinent =
                countries.values()
                        .stream()
                        .map( country -> country.getCities().stream().map(city -> new ContinentCityPair(country.getContinent(),city)).toList())
                        .flatMap(Collection::stream)
                        .collect(Collectors.groupingBy(ContinentCityPair::continent,Collectors.minBy( ContinentCityPair::compareTo )));
        highPopulatedCityOfEachContinent.forEach(ContinentCityPair::printEntry);

        // find the most populated capital city
           var highestPoulation = countries.values().stream().map(country->cities.get(country.getCapital()))
                   .max(Comparator.comparingInt(City::getPopulation));
        //highestPoulation.ifPresent(System.out::println);
      //  System.out.println(highestPoulation.get().getName());

        //Sort the countries by number of their cities in descending order
       var countriesWithCityCountInDescOrder =  countries.values().stream().map(c -> new CountryCityCountPair(c,c.getCities().size()))
               .sorted(Comparator.comparing(CountryCityCountPair::count).reversed()).toList();
        countriesWithCityCountInDescOrder.forEach(c->System.out.println(c.country().getName()));

        // Find the richest country of each continent with respect to their GNP (Gross National Product) values.
    }
    public static void createCities1() {
        cities.put(1, new City(1, "Kabul", "AFG", 1780000));
        cities.put(2, new City(2, "Qandahar", "AFG", 237500));
        cities.put(3, new City(3, "Herat", "AFG", 186800));
        cities.put(4, new City(4, "Mazar-e-Sharif", "AFG", 127800));
        cities.put(5, new City(5, "Amsterdam", "NLD", 591200));
        cities.put(6, new City(6, "Rotterdam", "NLD", 731200));
        cities.put(7, new City(7, "Haag", "NLD", 440900));
        cities.put(8, new City(8, "Utrecht", "NLD", 234323));

        cities.put(9, new City(9, "x", "TMP", 731200));
        cities.put(10, new City(10, "y", "TMP", 440900));
        cities.put(11, new City(11, "z", "TMP", 234323));
        cities.put(12, new City(12, "m", "TMP", 140900));
        cities.put(13, new City(13, "n", "TMP", 34323));
    }
    public static void createCountries() {
        countries.put("NLD", new Country("NLD", "Aruba", "North America",
                103000, 193.00, 1828.00, 5));
        countries.put("AFG", new Country("AFG", "Afghanistan", "Asia",
                22720000, 652090.00, 5976.00, 1));
        countries.put("TMP", new Country("TMP", "Temporary", "TNT",
                22720000, 52090.00, 976.00, 9));
    }




}
