package Homework_1;

public class City {
    String name;
    int number_Of_Population;
    int area;

    City(String name, int number_Of_Population,int area){
        this.name = name;
        this.number_Of_Population = number_Of_Population;
        this.area = area;
    }

}

class Country extends City {
    String name_country;
    String capital_City;
    String[] list_Of_Cities;

    Country(String name, int number_Of_Population, int area, String name_country, String capital_City, String[] list_Of_Cities) {
        super(name, number_Of_Population, area);
        {
            this.name_country = name_country;
            this.capital_City = capital_City;
            this.list_Of_Cities = list_Of_Cities;
        }
    }
}
