package qa.emp;

public class Manager extends Employee {
    
    private Employee [] manages;
    private int lastFreePosition = 0;

    public Manager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        manages = new Employee[100];
    }

    public void addEmployee(Employee employee){
        manages[lastFreePosition] = employee;
        if(lastFreePosition < 99){
            lastFreePosition++;
        }else{
            System.out.println("Too many Employees");
        }
    }

    public String getEmployeeNames(){
        String allEmployees = "";
        for(int i = 0; i < lastFreePosition; i++){
            allEmployees = allEmployees + manages[i].getName();
            if( i != lastFreePosition - 1){
                allEmployees = allEmployees + ", ";
            }
        }
        return allEmployees;
    }

    //public String getDetails(){
     //   for( manager : manages){

       // }
    //}
}
