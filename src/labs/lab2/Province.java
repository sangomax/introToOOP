package labs.lab2;

import java.text.DecimalFormat;
import static labs.lab2.ConstantsVariables.*;

public class Province {

    private String name;
    private String capital;
    private long population;

    public Province(String name, String capital, long population) {
        if (isValidPopulation(population) && isValidProvince(name) && isValidCapitalCity(capital)) {
            this.population = population;
            this.name = name;
            this.capital = capital;
        } else {
            this.population = DEFAULT_POPULATION;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }

    public Province() {
        this.population = DEFAULT_POPULATION;
        this.name = DEFAULT_PROVINCE;
        this.capital = DEFAULT_CAPITAL;
    }

    private boolean isValidProvince(String province) {
        for(String prov:CANADIAN_PROVINCES) {
            if(prov == province)
                return true;
        }
        return false;
    }

    private boolean isValidCapitalCity(String capital) {
        for(String cap : CANADIAN_CAPITAL_CITY) {
            if(capital == cap)
                return true;
        }
        return false;
    }

    private boolean isValidPopulation(Long population) {
        return population >= 30000 && population <= 15000000 ? true : false;
    }

    public String getDetails(){
        DecimalFormat def = new DecimalFormat("###,###,###");
        return "The capital of " + getName() + "(population. " + def.format(getPopulation()) + ") is " + getCapital() + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }
}
