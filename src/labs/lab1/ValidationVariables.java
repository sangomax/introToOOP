package labs.lab1;

/**
 * @author Adriano Gaiotto de Oliveira
 */
public class ValidationVariables {

    /**
     * Validate if the String "mainVar" length is between "minSize" and "maxSize"
     * @param mainVar String with valor that is being validated
     * @param minSize int with minimum length
     * @param maxSize int with maximum length
     * @param nameVariable String with name of variable that is being validated
     */
    public static void validationSize (String mainVar, int minSize, int maxSize, String nameVariable) {

        if (mainVar.length() < minSize || mainVar.length() > maxSize) {
            throw new IllegalArgumentException(nameVariable + " size must be " + minSize + " to " + maxSize);
        }
    }

    /**
     * Validate if the int "mainVar" is between "minSize" and "maxSize"
     * @param mainVar int with valor that is being validated
     * @param minSize int with minimum number
     * @param maxSize int with maximum number
     * @param nameVariable String with name of variable that is being validated
     */
    public static void validationRange (int mainVar, int minSize, int maxSize, String nameVariable) {

        if (mainVar < minSize || mainVar > maxSize) {
            throw new IllegalArgumentException(nameVariable + " size must be " + minSize + " to " + maxSize);
        }
    }

    /**
     * Validate if the double "mainVar" is between "minSize" and "maxSize"
     * @param mainVar double with valor that is being validated
     * @param minSize int with minimum number
     * @param maxSize int with maximum number
     * @param nameVariable String with name of variable that is being validated
     */
    public static void validationRange (double mainVar, int minSize, int maxSize, String nameVariable) {

        if (mainVar < minSize || mainVar > maxSize) {
            throw new IllegalArgumentException(nameVariable + " size must be " + minSize + " to " + maxSize);
        }
    }
}
