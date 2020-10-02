package qa.emp;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    //private int retirementAge = 65; //should this be public static ??
    public static int retirementAge = 65; //should this be public static ??


    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void setName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setRetirementAge(int retirementAge) {
        this.retirementAge = retirementAge;
    }

    public void incAge(){
        if(age < retirementAge){
            age++;
        }
    }
    public String getDetails(){
        return firstName + " " + lastName + " the age is .. " + age;
    }


    public static Employee createRandomEmployee(){
        StringBuilder str = new StringBuilder();
        StringBuilder str1 = new StringBuilder();


            int age = (int)((Math.random() * 40) + 18);

            // ***** Generating a number within a human age range --> errors with r ****
            // double age01 = r.nextGaussian() * 30 + 40;

            // BE CAREFUL WHEN USING THE SAME LETTER IN THE NESTED LOOP !!!!!
            for(int j = 0; j <= 4; j++) {
                char c = (char) ((Math.random() * 26) + 65);
                char d = (char) ((Math.random() * 26) + 65);

                str.append(c);
                str1.append(d);
            }
            // String emp02 = str.toString(); - DOESN'T WORK???
            // instansiate object, add to array
          return new Employee(str.toString().toLowerCase(), str1.toString().toUpperCase(), age);

    }
}

