package labs.lab1;

/**
 * @author Adriano Gaiotto de Oliveira
 */
public class Driver {

    public static void main(String[] args) {
        try {
            Model model1 = new Model("Susan", "Smith", 70, 120.0, false, true);
            Model model2 = new Model("Tiger", "Woods", 72, 190.0, true, false);

            model1.printDetails();
            System.out.println(model1.getHeightInFeetAndInches());
            System.out.println(model1.getWeightKg());
            model1.setWeight(37);
            model1.setHeight(4, 5);
            model1.printDetails();
            model1.displayModelDetails();


            model2.printDetails();
            System.out.println(model2.getHeightInFeetAndInches());
            System.out.println(model2.getWeightKg());
            model2.setWeight(126);
            model2.setHeight(5, 0);
            model2.printDetails();
            model2.displayModelDetails();

        } catch (IllegalArgumentException e) {
            System.err.println(e.getLocalizedMessage());
        }

    }


}
