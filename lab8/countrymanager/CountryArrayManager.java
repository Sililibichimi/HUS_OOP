package oop_hus.lab8.countrymanager;
import java.util.ArrayList;
import java.util.List;

public class CountryArrayManager {
    private Country[] countries;
    private int length;

    public CountryArrayManager() {
        countries = new Country[1];
        this.length = 0;
    }

    public CountryArrayManager(int maxLength) {
        countries = new Country[maxLength];
        this.length = 0;
    }

    public int getLength() {
        return this.length;
    }

    public Country[] getCountries() {
        return this.countries;
    }

    private void correct() {
        int nullFirstIndex = 0;
        for (int i = 0; i < this.countries.length; i++) {
            if (this.countries[i] == null) {
                nullFirstIndex = i;
                break;
            }
        }

        if (nullFirstIndex > 0) {
            this.length = nullFirstIndex;
            for (int i = nullFirstIndex; i < this.countries.length; i++) {
                this.countries[i] = null;
            }
        }
    }

    private void allocateMore() {
        Country[] newArray = new Country[2 * this.countries.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.countries.length);
        this.countries = newArray;
    }

    public void append(Country country) {
        if (this.length >= this.countries.length) {
            allocateMore();
        }

        this.countries[this.length] = country;
        this.length++;
    }

    public boolean add(Country country, int index) {
        if ((index < 0) || (index > this.countries.length)) {
            return false;
        }

        if (this.length >= this.countries.length) {
            allocateMore();
        }

        for (int i = this.length; i > index; i--) {
            this.countries[i] = this.countries[i - 1];
        }

        this.countries[index] = country;
        this.length++;
        return true;
    }

    public boolean remove(int index) {
        if ((index < 0) || (index >= countries.length)) {
            return false;
        }

        for (int i = index; i < length - 1; i++) {
            this.countries[i] = this.countries[i + 1];
        }

        this.countries[this.length - 1] = null;
        this.length--;
        return true;
    }

    public Country countryAt(int index) {
        if ((index < 0) || (index >= this.length)) {
            return null;
        }

        return this.countries[index];
    }

    /**
     * Sort the countries in order of increasing population
     * using selection sort algorithm.
     *
     * @return array of increasing population countries.
     */
    public Country[] sortByIncreasingPopulation() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Selection sort
        for (int i = 0; i < newArray.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() < newArray[minIndex].getPopulation()) {
                    minIndex = j;
                }
            }

            Country temp = newArray[minIndex];
            newArray[minIndex] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of decreasing population
     * using selection sort algorithm.
     *
     * @return array of decreasing population countries.
     */
    public Country[] sortByDecreasingPopulation() {

        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Selection sort
        for (int i = 0; i < newArray.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < newArray.length; j++) {
                if (newArray[j].getPopulation() > newArray[maxIndex].getPopulation()) {
                    maxIndex = j;
                }
            }

            Country temp = newArray[maxIndex];
            newArray[maxIndex] = newArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByIncreasingArea() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Bubble sort
        for (int idex = 0; idex < newArray.length; idex++) {
            boolean swapped = false;
            for (int j = 0; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() > newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of decreasing area
     * using bubble sort algorithm.
     *
     * @return array of increasing area countries.
     */
    public Country[] sortByDecreasingArea() {
        Country newArray[] = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Bubble sort
        for (int idex = 0; idex < newArray.length; idex++) {
            boolean swapped = false;
            for (int j = idex + 1; j < newArray.length - 1; j++) {
                if (newArray[j].getArea() < newArray[j + 1].getArea()) {
                    Country temp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }

        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * using insertion sort algorithm.
     *
     * @return array of increasing GDP countries.
     */
    public Country[] sortByIncreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Insertion sort
        for (int idex = 1; idex < newArray.length; idex++) {
            Country temp = newArray[idex];
            int j = idex - 1;
            while (j >= 0 && newArray[j].getGdp() > temp.getGdp()) {
                newArray[j + 1] = newArray[j];
                --j;
            }
            newArray[j + 1] = temp;
        }
        return newArray;
    }

    /**
     * Sort the countries in order of increasing GDP
     * sing insertion sort algorithm.
     *
     * @return array of increasing insertion countries.
     */
    public Country[] sortByDecreasingGdp() {
        Country[] newArray = new Country[this.length];
        System.arraycopy(this.countries, 0, newArray, 0, this.length);
        // Insertion sort
        for (int idex = 1; idex < newArray.length; idex++) {
            Country temp = newArray[idex];
            int j = idex - 1;
            while (j >= 0 && newArray[j].getGdp() < temp.getGdp()) {
                newArray[j + 1] = newArray[j];
                --j;
            }
            newArray[j + 1] = temp;
        }
        return newArray;
    }

    public AfricaCountry[] filterAfricaCountry() {
        List<AfricaCountry> africaCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof AfricaCountry) {
                africaCountries.add((AfricaCountry) this.countries[i]);
            }
        }
        return africaCountries.toArray(new AfricaCountry[0]);
    }

    public AsiaCountry[] filterAsiaCountry() {
        List<AsiaCountry> asiaCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof AsiaCountry) {
                asiaCountries.add((AsiaCountry) this.countries[i]);
            }
        }
        return asiaCountries.toArray(new AsiaCountry[0]);
    }

    public EuropeCountry[] filterEuropeCountry() {
        List<EuropeCountry> europeCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof EuropeCountry) {
                europeCountries.add((EuropeCountry) this.countries[i]);
            }
        }
        return europeCountries.toArray(new EuropeCountry[0]);
    }

    public NorthAmericaCountry[] filterNorthAmericaCountry() {
        List<NorthAmericaCountry> northAmericaCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof NorthAmericaCountry) {
                northAmericaCountries.add((NorthAmericaCountry) this.countries[i]);
            }
        }
        return northAmericaCountries.toArray(new NorthAmericaCountry[0]);
    }

    public OceaniaCountry[] filterOceaniaCountry() {
        List<OceaniaCountry> oceaniaCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof OceaniaCountry) {
                oceaniaCountries.add((OceaniaCountry) this.countries[i]);
            }
        }
        return oceaniaCountries.toArray(new OceaniaCountry[0]);
    }

    public SouthAmericaCountry[] filterSouthAmericaCountry() {
        List<SouthAmericaCountry> southAmericaCountries = new ArrayList<>();
        for (int i = 0; i < this.length; ++i) {
            if (this.countries[i] instanceof SouthAmericaCountry) {
                southAmericaCountries.add((SouthAmericaCountry) this.countries[i]);
            }
        }
        return southAmericaCountries.toArray(new SouthAmericaCountry[0]);
    }

    public Country[] filterMostPopulousCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingPopulation();
        Country[] mostPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            mostPopulousCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, mostPopulousCountries, 0, size);
        }
        return mostPopulousCountries;
    }

    public Country[] filterLeastPopulousCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingPopulation();
        Country[] leastPopulousCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            leastPopulousCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, leastPopulousCountries, 0, size);
        }
        return leastPopulousCountries;
    }

    public Country[] filterLargestAreaCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingArea();
        Country[] largestAreaCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            largestAreaCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, largestAreaCountries, 0, size);
        }
        return largestAreaCountries;
    }

    public Country[] filterSmallestAreaCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingArea();
        Country[] smallestAreaCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            smallestAreaCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, smallestAreaCountries, 0, size);
        }
        return smallestAreaCountries;
    }

    public Country[] filterHighestGdpCountries(int howMany) {
        Country[] countriesSorted = sortByDecreasingGdp();
        Country[] highestGdpCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            highestGdpCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, highestGdpCountries, 0, size);
        }
        return highestGdpCountries;
    }

    public Country[] filterLowestGdpCountries(int howMany) {
        Country[] countriesSorted = sortByIncreasingGdp();
        Country[] lowestGdpCountries = null;
        int size = Math.min(howMany, countriesSorted.length);
        if (size > 0) {
            lowestGdpCountries = new Country[size];
            System.arraycopy(countriesSorted, 0, lowestGdpCountries, 0, size);
        }
        return lowestGdpCountries;
    }

    public static String codeOfCountriesToString(Country[] countries) {
        StringBuilder codeOfCountries = new StringBuilder();
        codeOfCountries.append("[");
        for (Country country : countries) {
            if (country != null) {
                codeOfCountries.append(country.getCode())
                        .append(" ");
            }
        }

        return codeOfCountries.toString().trim() + "]";
    }

    public static void print(Country[] countries) {
        StringBuilder countriesString = new StringBuilder();
        countriesString.append("[");
        for (Country country : countries) {
            if (country != null) {
                countriesString.append(country.toString()).append("\n");
            }
        }
        System.out.print(countriesString.toString().trim() + "]");
    }
}
