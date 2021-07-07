/*
Write the code to implement the concept of inheritance for Vehicles. You are
required to implement inheritance between classes. You have to write four 
classes in java i.e. one superclass, two sub
classes and one driver class.
Vehicle is the super class whereas Bus and Truck are sub classesof Vehicle class. Transport is a driver class which contains mainmethod.
Detailed description:Detailed description of Vehicle (Super class): The class Vehicle must have following attributes:
1.Vehicle model
2.Registration number
3.Vehicle speed (km/hour)
4.Fuel capacity (liters)
5.Fuel consumption (kilo meters/liter)
The Vehicle class must have following methods:
Parameterized constructor that will initialize all the datamembers with the given values.
Getters and Setters for each data member that will get and setthe values of data members of class.
A method fuelNeeded() that will takedistance (in kilo meter) as an argument.It will calculate the amount of fuel needed for the given distanceand will return the value of fuel needed for given distance. Youcan use the attributes ‘Fuel consumption’defined within above Vehicle
class to determine the fuel needed forthe given distance. You are required to implement thisfunctionality by yourself.
A method distanceCovered() that willtake time (in hours) as an argument. Itwill calculate the distance for the given time and speed andreturns the value of distance. The formula to calculate speed isgiven as speed = distance/time. You can use thisformula to calculate the distance.
A display() method that will displayall the information of a vehicle.
Detailed description of Truck (Sub class):
The class Truck must have following attribute:
1.Cargo weight limit (Kilo grams)
The above class must have following methods:
Parameterized constructor that will initialize all data memberswith the given values.
Getters and setters for each data member that will get and setthe values of data members of class.
It must also override the display()method of Vehicle class and must call display() method of 
superclass within overridden method.
Detailed description of Bus (Sub class):
The class Bus must have following attribute:
1.No of passengers
The above class must have following methods:
Parameterized constructor that will initialize all the datamembers with given values.
Getters and setters that will get and set the value of eachdata member of class.
It must also override the display()method of Vehicle class and must call display method of super classwithin overridden method.
Create a class Transport whichcontains the main method. Perform the following within mainmethod:
Create an instance of class Truck and initialize all the datamembers with proper values.
Create an instance of class Bus and initialize all the datamembers with proper values.

Now, call fuelNeeded(),distanceCovered() anddisplay() methods using objects of theseclasses.
*/
/* Author : Sundar Raj Sharma */

/* super class Vehiclle */

class Vehicle{

    public String vehicle_model;
    public int reg_no;
	public double speed;
	public double fuel_capacity;
	public double fuel_consumption;
    // parametetized constructor.
    public Vehicle(String vehicle_model , int reg_no , double speed , double fuel_capacity , double fuel_consumption)
	{
		this.vehicle_model = vehicle_model;
		this.reg_no = reg_no;
		this.speed = speed;
		this.fuel_capacity = fuel_capacity;
		this.fuel_consumption = fuel_consumption;
	}
    // setters
    public void SetModalName(String new_modal_name)
	{
        vehicle_model = new_modal_name;
    }
    public void SetRegestrationNumber(int new_regestration_number)
	{
        reg_no = new_regestration_number;
    }
    public void SetSpeed(double vehicle_speed)
	{
        speed = vehicle_speed;
    }
    public void SetFuelCapacity(double new_fuelCapacity)
	{
        fuel_capacity = new_fuelCapacity;
    }
    public void SetFuelConsumption(double new_fuel_consumption)
	{
        fuel_consumption = new_fuel_consumption;
    }
	// getters
	public String GetModalName()
	{
        return vehicle_model;
    }
    public int GetRegestrationNumber()
	{
        return reg_no;
    }
    public double GetSpeed()
	{
        return speed;
    }
    public double GetFuelCapacity()
	{
        return fuel_capacity;
    }
    public double GetFuelConsumption()
	{
        return fuel_consumption;
    }

   // fuel needed mehtod which takes kilometer as argument & return double value.
    public double getFuelNeeded(double dis_k)
	{
       
        double fuel_needed =  dis_k / fuel_consumption;
        
        return fuel_needed;

    }
    
	// getdistance covered method.
    public double getDistanceCovered(double time_in_hours)
	{
        return time_in_hours * speed;
    }

      
    public void display()
	{
        System.out.println("Vehicle Model: " + vehicle_model);
        System.out.println("Vehicle Regestration Number: " + reg_no);
        System.out.println("Vehicle Speed: " + speed);
        System.out.println("Vehicle Fuel Capacity: " + fuel_capacity + " litre");
        System.out.println("Vehicle Fuel Consumption: " + fuel_consumption+ " KM/L");
    }

}

class Bus extends Vehicle
{
   
    public int number_of_passengers;
    
    public Bus(String vehicle_model ,int reg_no , double speed , double fuel_capacity , double fuel_consumption , int number_of_passengers )
	{
        super(vehicle_model,reg_no, speed, fuel_capacity, fuel_consumption);
        this.number_of_passengers = number_of_passengers;
    }
	// setter for number of passengers
	public void setNumberOfPassengers(int no_of_passengers_new)
	{
        this.number_of_passengers = no_of_passengers_new;
    }

	// getter for number of passengers
	public int GetNumberOfPassengers()
	{
        return number_of_passengers;
    }



    @Override
    public void display(){
        System.out.println("Bus Information: ");
        System.out.println("=============================");
        super.display();
        System.out.println("No of Passengers: "+ number_of_passengers);
    }
}

class Truck extends Vehicle{

    public double cargo_weight_limit;

    public Truck(String vehicle_model ,int reg_no , double speed , double fuel_capacity , double fuel_consumption ,double cargo_weight_limit){
        super(vehicle_model, reg_no, speed, fuel_capacity, fuel_consumption);
        this.cargo_weight_limit = cargo_weight_limit;
    }
    // setters for cargo weight Limit
	public void SetCargoWeightLimit(double new_cargoWeightLimit){
        this.cargo_weight_limit = new_cargoWeightLimit;
    }
    
	// getters for Truck Cargo weight Limit
	public double GetCargoWeightLimit(){
        return cargo_weight_limit;
    }


    @Override
    public void display(){
        System.out.println("Truck Information:");
        System.out.println("=============================");
        super.display();
        System.out.println("Cargo weight Limit : "+ cargo_weight_limit);
    }
}

class Transport{
    public static void main(String[] args) {
		// creating object of classes and assign value through consturctor.
        Bus bus = new Bus("suzuki",567398, 30, 200,4 , 45);
        Truck truck = new Truck("mereedes benz" ,451234,25, 400,12,1500);

		// display current information
        bus.display();
        truck.display();

	    System.out.println("After Setting New Values");
		
		// setter method calling
		bus.SetModalName("Tata rt56");
        bus.SetSpeed(45);
        bus.SetFuelCapacity(100);
        bus.SetFuelConsumption(53);
		bus.setNumberOfPassengers(23);

        // truck new vallue setting.
		truck.SetModalName("Leyland etv6");
        truck.SetSpeed(70);
        truck.SetFuelCapacity(200);
        truck.SetFuelConsumption(43);
		truck.SetFuelConsumption(23);
		truck.SetCargoWeightLimit(1456.45);

		// getter method calling for bus object
		System.out.println(bus.GetModalName());
		System.out.println(bus.GetSpeed());
		System.out.println(bus.GetFuelCapacity());
		System.out.println(bus.GetFuelConsumption());
		System.out.println(bus.GetNumberOfPassengers());

		// getter method calling truck object
		System.out.println(truck.GetModalName());
		System.out.println(truck.GetSpeed());
		System.out.println(truck.GetFuelCapacity());
		System.out.println(truck.GetFuelConsumption());
		System.out.println(truck.GetCargoWeightLimit());
	

        bus.display();
        truck.display();
		
		// fuel needed method calling using bus object of Bus class.
		double fuel_needed = bus.getFuelNeeded(240);
		System.out.println("FUEL NEEDED FOR" + bus.vehicle_model + " is " + fuel_needed + "L");
          
    }
}

