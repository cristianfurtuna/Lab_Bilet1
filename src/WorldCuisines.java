import java.util.*;

public class WorldCuisines {

    public void  populateLists (List <Cuisines> _dishesList, List <Cuisines> _spicyDishesList, List <Cuisines> _notSpicyDishesList){
        for (var element : _dishesList){
            if (element.spicelevel.equalsIgnoreCase("Hot")){
                _spicyDishesList.add (element);
            }
            else {
                _notSpicyDishesList.add (element);
            }
        }
    }

    public void sortByTime (List <Cuisines> _dishesList, List <Cuisines> _dishesUnder50){
        for (var element : _dishesList){
            if (element.cookingtime_min < 50){
                _dishesUnder50.add(element);
                System.out.println(element.getDishname() + " " + element.getMainingredient() + " " + element.getCalories());
            }
        }

    }


}
