package com.toyFactory.run;

import java.util.HashMap;
import java.util.Map;

import com.toyFactory.model.service.ToyFactory;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> ing = new HashMap<>();
		ing.put(1, "면직물");
		ing.put(2, "플라스틱");
		ing.put(3, "유리");
		ing.put(4, "고무");
		
		ToyFactory factory = new ToyFactory();
		factory.addMaterials( factory.init() );
		factory.setIngredientMap(ing);
		factory.selectMenu();
		//factory.selectAll();
		//System.out.println(factory.setNewToy());
		//System.out.println( factory.removeToy() ); 
		//factory.selectAllByDateManufactured();
		//factory.selectAllByAgeLimit();
		
		//factory.addNewIngredient();
		//factory.removeIngredient() ;
		}

}
