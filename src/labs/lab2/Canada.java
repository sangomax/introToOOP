package labs.lab2;

public class Canada extends ConstantsVariables {

    private Province[] provinces;

    public Canada() {
        provinces = new Province[CANADIAN_PROVINCES.length];
        for(int i = 0; i < CANADIAN_PROVINCES.length; i++) {
           provinces[i] = new Province(CANADIAN_PROVINCES[i],CANADIAN_CAPITAL_CITY[i],CANADIAN_POPULATION[i]);
        }
    }

    public void displayAllProvinces(){
        for(Province prov : provinces)
            System.out.println(prov.getDetails());
    }

    /**
     * Which takes the population in millions (e.g. 4, 6)
     * @param min int with the minimum population in millions
     * @param max int with the maximum population in millions
     * @return int wiht the number of Provinces with the populations in that range
     */
    public int getNumOfProvincesBetween(int min, int max){
        int count = 0;
        for(Province prov : provinces) {
            if(prov.getPopulation() >= (min * 1000000) &&
                    prov.getPopulation() <= (max * 1000000)) {

                count++;
            }
        }
        return count;
    }

}
