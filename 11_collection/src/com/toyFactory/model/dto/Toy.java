package com.toyFactory.model.dto;

import java.util.Objects;
import java.util.Set;

public class Toy implements Comparable<Toy>{
	private String name;
	private int ageLimit;
	private int price;
	private String color;
	private String dateManufactured;
	private Set<String> ingredients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAgeLimit() {
		return ageLimit;
	}
	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getDateManufactured() {
		return dateManufactured;
	}
	public void setDateManufactured(String dateManufactured) {
		this.dateManufactured = dateManufactured;
	}
	public Set<String> getIngredients() {
		return ingredients;
	}
	public void setIngredients(Set<String> ingredients) {
		this.ingredients = ingredients;
	}
	public Toy() {
		super();
	}
	public Toy(String name, int ageLimit, int price, String color, String dateManufactured,
			Set<String> ingredients) {
		super();
		this.name = name;
		this.ageLimit = ageLimit;
		this.price = price;
		this.color = color;
		this.dateManufactured = dateManufactured;
		this.ingredients = ingredients;
	}
	@Override
	public String toString() {
		return "이름 : " + name +
				" / 가격 : " + price +
				" / 색상 : " + color + 
				" / 사용가능연령 : " + ageLimit +  
				" / 제조년월일 : " + dateManufactured +
				" / 재료 : " + ingredients ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ageLimit, color, dateManufactured, ingredients, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Toy other = (Toy) obj;
		return ageLimit == other.ageLimit && Objects.equals(color, other.color)
				&& Objects.equals(dateManufactured, other.dateManufactured)
				&& Objects.equals(ingredients, other.ingredients) && Objects.equals(name, other.name)
				&& price == other.price;
	}
	@Override
	public int compareTo(Toy o) {
		// TODO Auto-generated method stub
		
		String dateO = o.getDateManufactured();
		int intDateO = 0;
		try { intDateO = Integer.parseInt(dateO);}
		catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		
		String dateThis = this.getDateManufactured();
		int intDateThis = 0;
		try { intDateThis = Integer.parseInt(dateThis);}
		catch (NumberFormatException ex){
            ex.printStackTrace();
        }
		
		return intDateThis - intDateO;
		
		
	}
	
	
}
