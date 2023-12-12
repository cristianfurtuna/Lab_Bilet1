public class Cuisines implements Comparable<Cuisines>{

    String country;
    String dishname;
    String mainingredient;
    Integer cookingtime_min;
    Integer servings;
    String spicelevel;
    Integer calories;
    Integer year;
    String chefname;

    public Cuisines(String country, String dishname, String mainingredient, Integer cookingtime_min, Integer servings, String spicelevel, Integer calories, Integer year, String chefname) {
        this.country = country;
        this.dishname = dishname;
        this.mainingredient = mainingredient;
        this.cookingtime_min = cookingtime_min;
        this.servings = servings;
        this.spicelevel = spicelevel;
        this.calories = calories;
        this.year = year;
        this.chefname = chefname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDishname() {
        return dishname;
    }

    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    public String getMainingredient() {
        return mainingredient;
    }

    public void setMainingredient(String mainingredient) {
        this.mainingredient = mainingredient;
    }

    public Integer getCookingtime_min() {
        return cookingtime_min;
    }

    public void setCookingtime_min(Integer cookingtime_min) {
        this.cookingtime_min = cookingtime_min;
    }

    public Integer getServings() {
        return servings;
    }

    public void setServings(Integer servings) {
        this.servings = servings;
    }

    public String getSpicelevel() {
        return spicelevel;
    }

    public void setSpicelevel(String spicelevel) {
        this.spicelevel = spicelevel;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getChefname() {
        return chefname;
    }

    public void setChefname(String chefname) {
        this.chefname = chefname;
    }

    @Override
    public String toString() {
        return "Cuisines{" +
                "country='" + country + '\'' +
                ", dishname='" + dishname + '\'' +
                ", mainingredient='" + mainingredient + '\'' +
                ", cookingtime_min=" + cookingtime_min +
                ", servings=" + servings +
                ", spicelevel='" + spicelevel + '\'' +
                ", calories=" + calories +
                ", year=" + year +
                ", chefname='" + chefname + '\'' +
                '}' + "\n";
    }


    @Override
    public int compareTo(Cuisines other_cuisine) {
        return other_cuisine.year.compareTo(this.year);
    }
}
