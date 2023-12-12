import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {



    public List<Cuisines> sortByCountry2 (List <Cuisines> c){
        List <Cuisines> cu =new ArrayList<>(c);
        List <Cuisines> deletedCuizines = new ArrayList<>();
        Collections.sort(cu, Comparator.comparing(Cuisines :: getCountry));
        for(Cuisines cui : cu){
            if (cui.getCountry().equals("Japan") || cui.getCountry().equals("India") || cui.getCountry().equals("Thailand") || cui.getCountry().equals("China") || cui.getCountry().equals("South Korea")){
                deletedCuizines.add (cui);
            }
        }
        for(Cuisines cuiz : deletedCuizines){
            cu.remove(cuiz);
        }
        return cu;
    }

    public static void main(String[] args) {
        List <Cuisines> _dishesList = new ArrayList<>();
        List <Cuisines> _spicyDishesList = new ArrayList<>();
        List <Cuisines> _notSpicyDishesList = new ArrayList<>();
        List <Cuisines> _dishesUnder50 = new ArrayList<>();
        List <Cuisines> _spicyDishesbyCountrynoAsia = new ArrayList<>();

        Reader reader = new Reader();
        reader.Read(_dishesList);

        WorldCuisines worldCuisines = new WorldCuisines();
        worldCuisines.populateLists(_dishesList, _spicyDishesList, _notSpicyDishesList);

        System.out.println(_dishesList);
        System.out.println(_spicyDishesList);
        System.out.println(_notSpicyDishesList);

        worldCuisines.sortByTime(_dishesList, _dishesUnder50);

        Collections.sort (_notSpicyDishesList);
        System.out.println(_notSpicyDishesList);

        Main main = new Main();
        _spicyDishesbyCountrynoAsia = main.sortByCountry2(_spicyDishesList);
        System.out.println(_spicyDishesbyCountrynoAsia);



    }
}