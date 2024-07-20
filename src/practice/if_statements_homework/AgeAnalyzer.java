package practice.if_statements_homework;

public class AgeAnalyzer {

    public static void main(String[] args) {
        // TODO: Declare hardcoded age variables for testing purposes.
        // Example: int age1 = 12, age2 = 24, age3 = 45, age4 = 5, age5 = 65;

        int ageOne = 12;
        int ageTwo = 24;
        int ageThree= 45;
        int ageFour = 5;
        int ageFive = 65;


        // TODO: For each hardcoded age variable, use if statements to determine the age category.
        // TODO: For each age variable:
        // 1. Check if the age is between 0 and 12 (inclusive). If true, print that the age is a "Child".
        // 2. Check if the age is between 13 and 19 (inclusive). If true, print that the age is a "Teenager".
        // 3. Check if the age is between 20 and 64 (inclusive). If true, print that the age is an "Adult".
        // 4. Check if the age is 65 or older. If true, print that the age is a "Senior".

        //ageOne
        if(ageOne > 0 && ageOne < 13){
          System.out.println("Child");
        } else if(ageOne >= 13 && ageOne <20){
            System.out.println("Teenager");
        } else if(ageOne >= 19 && ageOne <65){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        //ageTwo
        if(ageTwo > 0 && ageTwo < 13){
            System.out.println("Child");
        } else if(ageTwo >= 13 && ageTwo <20){
            System.out.println("Teenager");
        } else if(ageTwo >= 19 && ageTwo <65){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        //ageThree
        if(ageThree > 0 && ageThree < 13){
            System.out.println("Child");
        } else if(ageThree >= 13 && ageThree <20){
            System.out.println("Teenager");
        } else if(ageThree >= 19 && ageThree <65){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        //ageFour
        if(ageFour > 0 && ageFour < 13){
            System.out.println("Child");
        } else if(ageFour >= 13 && ageFour <20){
            System.out.println("Teenager");
        } else if(ageFour >= 19 && ageFour <65){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }

        //ageFive
        if(ageFive > 0 && ageFive < 13){
            System.out.println("Child");
        } else if(ageFive >= 13 && ageFive <20){
            System.out.println("Teenager");
        } else if(ageFive >= 19 && ageFive <65){
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }


        // TODO: Ensure to print a message for each age, indicating the age value and its corresponding category.
        // Example message: "Age 12 is a Child"

        //ageOne
        if(ageOne > 0 && ageOne < 13){
            System.out.println("Age " + ageOne + " is a Child");
        } else if(ageOne >= 13 && ageOne <20){
            System.out.println("Age " + ageOne + " is a Teenager");
        } else if(ageOne >= 19 && ageOne <65){
            System.out.println("Age " + ageOne + " is a Adult");
        } else {
            System.out.println("Age " + ageOne + " is a Senior");
        }

        //ageTwo
        if(ageTwo > 0 && ageTwo < 13){
            System.out.println("Age " + ageTwo + " is a Child");
        } else if(ageTwo >= 13 && ageTwo <20){
            System.out.println("Age " + ageTwo + " is a Teenager");
        } else if(ageTwo >= 19 && ageTwo <65){
            System.out.println("Age " + ageTwo + " is a Adult");
        } else {
            System.out.println("Age " + ageTwo + " is a Senior");
        }

        //ageThree
        if(ageThree > 0 && ageThree < 13){
            System.out.println("Age " + ageThree + " is a Child");
        } else if(ageThree >= 13 && ageThree <20){
            System.out.println("Age " + ageThree + " is a Teenager");
        } else if(ageThree >= 19 && ageThree <65){
            System.out.println("Age " + ageThree + " is a Adult");
        } else {
            System.out.println("Age " + ageThree + " is a Senior");
        }

        //ageFour
        if(ageFour > 0 && ageFour < 13){
            System.out.println("Age " + ageFour + " is a Child");
        } else if(ageFour >= 13 && ageFour <20){
            System.out.println("Age " + ageFour + " is a Teenager");
        } else if(ageFour >= 19 && ageFour <65){
            System.out.println("Age " + ageFour + " is a Adult");
        } else {
            System.out.println("Age " + ageFour + " is a Senior");
        }

        //ageFive
        if(ageFive > 0 && ageFive < 13){
            System.out.println("Age " + ageFive + " is a Child");
        } else if(ageFive >= 13 && ageFive <20){
            System.out.println("Age " + ageFive + " is a Teenager");
        } else if(ageFive >= 19 && ageFive <65){
            System.out.println("Age " + ageFive + " is a Adult");
        } else {
            System.out.println("Age " + ageFive + " is a Senior");
        }



        // TODO: Repeat the above steps for all the hardcoded age variables to categorize and print the results.
    }
}
