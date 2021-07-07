class Vehicle{
    // super class data members
    public String vehicle_model;
    public int reg_no;
	public double speed;
	public double fuel_capacity;
	public double fuel_consumption;
    /* super class Parameterized constructor that will initialize all the datamembers with the given values.*/
    public Vehicle(String vehicle_model , int reg_no , double speed , double fuel_capacity , double fuel_consumption){
		this.vehicle_model = vehicle_model;
		this.reg_no = reg_no;
		this.speed = speed;
		this.fuel_capacity = fuel_capacity;
		this.fuel_consumption = fuel_consumption;
	}

    /* Setters for each data member that will get and setthe values of data members of class.*/
    public void SetModalName(String new_modal_name){
        vehicle_model = new_modal_name;
    }
    public void SetRegestrationNumber(int new_regestration_number){
        reg_no = new_regestration_number;
    }
    public void SetSpeed(double vehicle_speed){
        speed = vehicle_speed;
    }
    public void SetFuelCapacity(double new_fuelCapacity){
        fuel_capacity = new_fuelCapacity;
    }
    public void SetFuelConsumption(double new_fuel_consumption){
        fuel_consumption = new_fuel_consumption;
    }

    /* A method fuelNeeded() that will takedistance (in kilo meter) as an argument.It will calculate the amount of fuel needed for the given distanceand 
    will return the value of fuel needed for given distance. Youcan use the attributes ‘Fuel consumption’defined within above Vehicle class to determine 
    the fuel needed forthe given distance.*/
    public double getFuelNeeded(double dis_k){
        // logic
        double fuel_needed =  dis_k * fuel_consumption;
        if(fuel_needed < fuel_capacity){
            return -1;
        }
        return fuel_needed;

    }
    /* A method distanceCovered() that willtake time (in hours) as an argument. Itwill calculate the distance for the 
    given time and speed andreturns the value of distance. The formula to calculate speed isgiven as 
    speed = distance/time. You can use thisformula to calculate the distance.*/
    public double getDistanceCovered(double time_in_hours){
        return time_in_hours * speed;
    }

      /* A display method that will displayall the information of a vehicle.*/
    public void display(){
        System.out.println(vehicle_model);
        System.out.println(reg_no);
        System.out.println(speed);
        System.out.println(fuel_capacity);
        System.out.println(fuel_consumption);
    }

}
/* Bus Subclass which extends the Vehicle Super Class */
class bus extends Vehicle{
    /* data member of the Bus Sub Class */
    public int number_of_passengers;
    /* Bus subclass parameterized constructor.*/
    public bus(String vehicle_model ,int reg_no , double speed , double fuel_capacity , double fuel_consumption , int number_of_passengers ){
        super(vehicle_model,reg_no, speed, fuel_capacity, fuel_consumption);
        this.number_of_passengers = number_of_passengers;
    }
    // display method which overrides the above class methods.
    @Override
    public void display(){
        super.display();
    }
}

class Truck extends Vehicle{

    public double cargo_weight_limit;

    public Truck(String vehicle_model ,int reg_no , double speed , double fuel_capacity , double fuel_consumption ,double cargo_weight_limit){
        super(vehicle_model, reg_no, speed, fuel_capacity, fuel_consumption);
        this.cargo_weight_limit = cargo_weight_limit;
    }
    public void SetCargoWeightLimit(int new_cargoWeightLimit){
        this.cargo_weight_limit = new_cargoWeightLimit;
    }
    // override the display()method of Vehicle class and must call display method of super classwithin overridden method.
    @Override
    public void display(){
        super.display();
    }
}

class Transport{
    public static void main(String[] args) {
        // object createon of three different classes.
        Vehicle a = new Vehicle("Plane" ,783475, 50, 2000, 60);
        bus b = new bus("suzuki",567398, 30, 200,4 , 45);
        Truck c = new Truck("mereedes benz" ,451234,25, 400,12,1500);
        // disoolay the information
        a.display(); // mefhod calling.
        b.display();
        c.display();

       // set new value to the vehicle
        System.out.println("Setting new Names");
        a.SetModalName("Toyota corolla");
        a.SetSpeed(45);
        a.SetFuelCapacity(100);
        a.SetFuelConsumption(53);

        b.SetModalName("Volvo 673");
        b.SetSpeed(46);
        b.SetFuelCapacity(240);
        b.SetFuelConsumption(23);

        c.SetModalName("Mahindra Superpwoer");
        c.SetSpeed(21);
        c.SetFuelCapacity(239);
        c.SetFuelConsumption(32);

        a.display();
        b.display();
        c.display();


        // fuel needed for Vehicle 
        /* has to fix this bug */
        double fuel_needed1 = a.getFuelNeeded(300);
        System.out.println("needed Amount of Fuel for: " + (a.vehicle_model)+ "is : " + fuel_needed1 + "L");
        // distance covered
        double distance_covered1 = a.getDistanceCovered(34);
        System.out.println("The total distance travelled for " + (a.vehicle_model)+ "is : " + distance_covered1 + " KM");

         // fuel needed for Bus
         double fuel_needed2 = a.getFuelNeeded(230);
         System.out.println("needed Amount of Fuel for: " + (b.vehicle_model)+ "is : " + fuel_needed2 + "L");
         // distance covered by bus
         double distance_covered2 = a.getDistanceCovered(57);
         System.out.println("The total distance travelled for " + (b.vehicle_model)+ "is : " + distance_covered2 + " KM");


          // fuel needed for Truck
        double fuel_needed3 = a.getFuelNeeded(1);
        System.out.println("needed Amount of Fuel for: " + (c.vehicle_model)+ "is : " + fuel_needed3 + "L");
        // distance covered
        double distance_covered3 = a.getDistanceCovered(34);
        System.out.println("The total distance travelled for " + (c.vehicle_model)+ "is : " + distance_covered3 + " KM");
    }
}

