package Homework_1;

public class MainCity {
    public static void main(String[] args) {
        String[] list_Of_Cities = {"tbilisi","gori","kutaisi"};
        City tbilisi = new City("tbilisi",1,5900);
        City gori = new City("gori",1,4500);
        City kutaisi = new City("kutaisi",1,2300);
        Country country = new Country("georgia",4,69500,"georgia","tbilisi",list_Of_Cities);

        int area_cityes;{
            area_cityes = tbilisi.area + gori.area + kutaisi.area;
        }

        System.out.println(country.area);
        System.out.println(country.name_country);
        System.out.println(country.capital_City);
        System.out.println(country.number_Of_Population);
        System.out.println(country.list_Of_Cities);

        System.out.println(area_cityes);



    }
}
