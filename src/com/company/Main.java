package com.company;

public class Main {

    public static void main(String[] args) throws InvalidIssueYear {

            Vehicle car1 = new Car("Toyota", 2005, Engine.FUEL);
            Vehicle car2 = new Car("Honda Insight", 2015, Engine.HYBRID);
            Vehicle car3 = new Car("Honda Accord Hybrid", 2020, Engine.HYBRID);
            Vehicle car4 = new Car("Hyundai Sonata", 2022, Engine.ELECTRMOBILE);
            Vehicle car5 = new Car("Nissan Leaf", 2009, Engine.FUEL);
            Vehicle car6 = new Car("Lexus", 2005, Engine.FUEL);
            Vehicle car7 = new Car("LADA", 2005, Engine.FUEL);
            Vehicle truck1 = new Truck("Kamaz", 1891, Engine.FUEL);
            Vehicle truck2 = new Truck("Bus", 2000, Engine.ELECTRMOBILE);
            Vehicle truck3 = new Truck("Mashrutka", 1999, Engine.HYBRID);
            Vehicle truck4 = new Truck("Van", 2016, Engine.FUEL);
            Vehicle truck5 = new Truck("PoliceCar", 2011, Engine.ELECTRMOBILE);
            Vehicle truck6 = new Truck("Ambulance", 1995, Engine.HYBRID);
            Vehicle truck7 = new Truck("Vaz", 2021, Engine.FUEL);
            Vehicle truck8 = new Truck("Teleshka", 2022, Engine.ELECTRMOBILE);

            Vehicle[] vehicles = {car1,car2,car3,car4,car5,car6,car7,truck1,truck2,truck3,truck4,truck5,truck6,truck7,truck8};
			Engine hyb = null;
			Engine[] hybryds = null;
			for (Vehicle v:vehicles) {
				if (v.getType().equals(Engine.HYBRID)){
					hyb = v.getType();
					System.out.println(hyb+" "+v.getModel());
				try{
					v.getYear();
				} catch (InvalidIssueYear a) {
					System.err.println(v.getModel()+ ": "+ a.getMessage());
				}


				}
			}

        }


    }



