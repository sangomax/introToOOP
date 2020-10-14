package labs.lab1;
import static labs.lab1.ValidationVariables.*;

/**
 * @author Adriano Gaiotto de Oliveira
 */
public class Model {
    public static final int INCHES_PER_FOOT = 12;
    public static final double POUNDS_PER_KG = 2.2046;
    public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
    public static final int TALL_INCHES = 67;
    public static final double THIN_POUNDS = 140.0;
    public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
    public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
    public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

    private String firstName;
    private String lastName;
    private int height;
    private double weight;
    private boolean canTravel;
    private boolean smokes;

    /**
     * Default constructor
     */
    public Model() {

    }

    /**
     * Constructor with six parameters to be passed
     * @param firstName String with the first name with size between 3 to 20
     * @param lastName String with the last name with size between 3 to 20
     * @param height int with height in inches with size between 24 to 84
     * @param weight double with weight in pounds with size between 80 to 280
     * @param canTravel boolean with the option to can travel
     * @param smokes boolean with the option to smoke
     * @throws IllegalArgumentException argument out of range permitted
     */
    public Model(String firstName, String lastName, int height, double weight, boolean canTravel, boolean smokes) throws IllegalArgumentException{
        validationSize(firstName, 3, 20, "First Name");
        validationSize(lastName, 3, 20, "Last Name");
        validationRange(height, 24, 84, "Height");
        validationRange(weight, 80, 280, "Weight");

        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.canTravel = canTravel;
        this.smokes = smokes;
    }

    /**
     * Constructor with four parameters to be passed and two default
     * @param firstName String with the first name with size between 3 to 20
     * @param lastName String with the last name with size between 3 to 20
     * @param height int with height in inches with size between 24 to 84
     * @param weight double with weight in pounds with size between 80 to 280
     */
    public Model(String firstName, String lastName, int height, double weight) {
        this(firstName,lastName,height,weight,true,false);
    }

    /**
     * Returns the first name
     * @return String with the first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the first name
     * @param firstName String with the first name with size between 3 to 20
     */
    public void setFirstName(String firstName) {
        validationSize(firstName, 3, 20, "First Name");
        this.firstName = firstName;
    }

    /**
     * Returns the last name
     * @return String with the last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the last name
     * @param lastName String with the last name with size between 3 to 20
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the height in inches
     * @return int with the height in inches with size between 24 to 84
     */
    public int getHeight() {
        return height;
    }

    /**
     * Set the height in inches
     * @param height int with the height in inches with size between 24 to 84
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Returns the weight in pounds
     * @return double with the weight in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Set the weight in pounds
     * @param weight double with the weight in pounds with size between 80 to 280
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Returns the option to can travel
     * @return boolean with the option to can travel
     */
    public boolean isCanTravel() {
        return canTravel;
    }

    /**
     * Set the option to can travel
     * @param canTravel boolean with the option to can travel
     */
    public void setCanTravel(boolean canTravel) {
        this.canTravel = canTravel;
    }

    /**
     * Return the option to smoke
     * @return boolean with the option to smoke
     */
    public boolean isSmokes() {
        return smokes;
    }

    /**
     * Set the option to smoke
     * @param smokes boolean with the option to smoke
     */
    public void setSmokes(boolean smokes) {
        this.smokes = smokes;
    }

    /**
     * Returns the full name
     * @return String with the first name concatenated with the last name
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Return the height formated
     * @return String with the height formated
     */
    public String getHeightFormated() {
        return getHeight() + " inches";
    }

    /**
     * Return the weight formated
     * @return String with the weight formated
     */
    public String getWeightFormated() {
        return Math.round(getWeight()) + " pounds";
    }

    /**
     * Return message with option to travel
     * @return String with message with option to travel
     */
    public String getAnswerTravel() {
        return isCanTravel() ? "Does travel" : "Does not travel";
    }

    /**
     * Return message with option to smoke
     * @return String with message with option to smoke
     */
    public String getAnswerSmoke() {
        return isSmokes() ? "Does smoke" : "Does not smoke";
    }


    /**
     * Returns the height in feet and inches
     * @return the height in feet and inches
     */
    public String getHeightInFeetAndInches() {
        int feet = (int) getHeight() / INCHES_PER_FOOT;
        int inchies = (int) getHeight() % INCHES_PER_FOOT;
        String feetAndInchies = feet + " feet ";

        return inchies > 0 ? feetAndInchies + inchies + " inch" : feetAndInchies;
    }

    /**
     * Returns the height in Kg
     * @return long with the height in Kg
     */
    public long getWeightKg() {
        return Math.round(getWeight() / POUNDS_PER_KG);
    }

    /**
     * Set the weight in Kg
     * @param kilograms long with the weight in Kg with size between 37 to 126
     */
    public void setWeight(long kilograms) {
        validationRange(kilograms * POUNDS_PER_KG, 80, 280, "Weight");
        this.weight = kilograms * POUNDS_PER_KG;
    }

    /**
     * Set the height in feet and inches
     * @param feet int with the height part in feet
     * @param inches int with the height part in inches
     */
    public void setHeight(int feet, int inches) {
        double tempHeight = Double.parseDouble(feet + "." + inches);
        validationRange(tempHeight * INCHES_PER_FOOT, 24, 84, " Height");
        this.height = (int) tempHeight * INCHES_PER_FOOT;
    }

    /**
     * Prints detail information about this Model
     */
    public void printDetails() {
        System.out.println("Name: " + getFullName());
        System.out.println("Height: " + getHeightFormated());
        System.out.println("Weight: " + getWeightFormated());
        System.out.println(getAnswerTravel());
        System.out.println(getAnswerSmoke());
        System.out.println();
    }

    /**
     * Returns the salary per hour
     * @return int with salary per hour
     */
    public int calculatePayDollarsPerHour() {
        int salaryHour = BASE_RATE_DOLLARS_PER_HOUR;

        if(this.getHeight() >= TALL_INCHES && this.getWeight() <= THIN_POUNDS) {
            salaryHour += TALL_THIN_BONUS_DOLLARS_PER_HOUR;
        }
        if(this.isCanTravel()) {
            salaryHour += TRAVEL_BONUS_DOLLARS_PER_HOUR;
        }
        if(this.isSmokes()) {
            salaryHour -= SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
        }

        return salaryHour;
    }

    /**
     * Displays all the model's information
     */
    public void displayModelDetails() {
        System.out.println("Name: " + getFullName());
        System.out.println("Height: " + getHeightFormated());
        System.out.println("Weight: " + getWeightFormated());
        System.out.println("Travels: " + (isCanTravel()?"yep":"nope"));
        System.out.println("Smokes: " + (isSmokes()?"yep":"nope"));
        System.out.println("Hourly rate: $" + calculatePayDollarsPerHour());
        System.out.println();
    }

}
