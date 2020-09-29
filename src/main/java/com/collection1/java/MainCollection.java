package com.collection1.java;

import java.util.ArrayList;
import java.util.Set;

public class MainCollection {

	public static void main(String[] args) {

		GeneralizedSet<Car> cars=new GeneralizedSet<Car>();  //Cars set
		Car Maruti=new Car("Maruti","Ciaz",1980,400000);
		Car Maru=new Car("Maruti","Ciaz",2008,405000);
		Car Benz=new Car("Daimler","Benz",1980,400000);
		Car Porshe=new Car("Volkswagen","Porshe",1980,400000);
		cars.addItems(Maruti);
		cars.addItems(Maru);
		cars.addItems(Benz);
		cars.addItems(Porshe);
		
		GeneralizedSet<School> schools=new GeneralizedSet<School>();  //School set
		School KVPY=new School("KVPY","Indore","Indore",4);
		School Arnold=new School("Arnold","Indore","Dewas",3);
		School Pauls=new School("Pauls","Bhopal","Bhopal",2);
		schools.addItems(Pauls);
		schools.addItems(Arnold);
		schools.addItems(KVPY);
		
		GeneralizedSet<Laptop> laptops=new GeneralizedSet<Laptop>();  //Laptop set
		Laptop HP=new Laptop("HP","Inspiron","Windows","Core i5");
		Laptop Dell=new Laptop("Dell","G2 15","Linux","Core i5");
		Laptop Lenovo=new Laptop("Lenovo","k9","Windows","Core i5");
		laptops.addItems(Dell);
		laptops.addItems(Lenovo);
		laptops.addItems(HP);
		
		GeneralizedSet<Television> tv=new GeneralizedSet<Television>();  //Television set
		Television sony=new Television("Sony","LED",true,25000); 
		Television Tlc=new Television("Tlc","Plasma",false,20000);
		Television samsung=new Television("Samsung","LCD",true,30000);
		tv.addItems(samsung);
		tv.addItems(Tlc);
		tv.addItems(sony);
		
		
		Set<Car> carss=cars.getItems();  
		System.out.println("CARS");
		for(Car i:carss) {                                //Displaying cars
			System.out.println("Manufacturer: "+i.getMake()+", Model :"+i.getModel()+", Year "+i.getYear()+", Price: "+i.getPrice());
			
		}
		Set<School> scl=schools.getItems();   
		System.out.println("SCHOOLS");
		for(School i:scl) {                                //Displaying schools
			System.out.println("Name: "+i.getName()+", City: "+i.getCity()+", District: "+i.getSchooldistrict()+", Ranking: "+i.getGreatSchoolRanking());
			
		}
		Set<Laptop> lap=laptops.getItems();
		System.out.println("LAPTOPS");
		for(Laptop i:lap) {                                 //Displaying Laptop
			System.out.println("Company: "+i.getCompany()+", Mode: "+i.getModel()+", OS: "+i.getOperatingSystem()+", Processor: "+i.getProcessor());
			
		}	
		Set<Television> tvs=tv.getItems();
		System.out.println("TELEVISION");
		for(Television i:tvs) {                            //Displaying Television
			System.out.println("Company: "+i.getCompany()+", Type: "+i.getType()+", Price "+i.getPrice()+", 3D Enabled: "+i.isEnabled3D());
			
		}

	}
}
