package ch7;
//Jayden Williams
//12/18
public class FoodMenu {

	public static void main(String[] args) {
		FoodItems CheeseBurger = new FoodItems();
		FoodItems LargeFrys = new FoodItems();
		FoodItems CocaCola = new FoodItems();
		FoodItems HotFudgeSundae = new FoodItems();
		FoodItems SideSalad = new FoodItems();
		FoodItems TripleBreakfastStacksMcgriddles = new FoodItems();
		
		
		CheeseBurger.Type ="Burger";
		CheeseBurger.Weight = 0;
		CheeseBurger.Cost = 1.00;
		CheeseBurger.Calories = 300;
		CheeseBurger.Servings = 1;
		CheeseBurger.CalPerServ = 0;
		
		LargeFrys.Type ="Side";
		LargeFrys.Weight = 0;
		LargeFrys.Cost = 1.89;
		LargeFrys.Calories = 510;
		LargeFrys.Servings = 1;
		LargeFrys.CalPerServ = 510;
		
		CocaCola.Type ="Drink lrg";//large coke
		CocaCola.Weight = 0;
		CocaCola.Cost = 1.00;
		CocaCola.Calories = 290;
		CocaCola.Servings = 1;
		CocaCola.CalPerServ = 290;
		
		
		HotFudgeSundae.Type ="dessert";
		HotFudgeSundae.Weight = 0;
		HotFudgeSundae.Cost = 1.29;
		HotFudgeSundae.Calories = 380;
		HotFudgeSundae.Servings = 1;
		HotFudgeSundae.CalPerServ = 380;
		
		SideSalad.Type ="Salad";
		SideSalad.Weight = 0;
		SideSalad.Cost = 1.00;
		SideSalad.Calories = 15;
		SideSalad.Servings = 1;
		SideSalad.CalPerServ = 15;
		
		TripleBreakfastStacksMcgriddles.Type ="Breakfast";
		TripleBreakfastStacksMcgriddles.Weight = 0;
		TripleBreakfastStacksMcgriddles.Cost = 2.79;
		TripleBreakfastStacksMcgriddles.Calories = 850;
		TripleBreakfastStacksMcgriddles.Servings = 1;
		TripleBreakfastStacksMcgriddles.CalPerServ = 850;
		
		CheeseBurger.display();
		LargeFrys.display();
		CocaCola.display();
		HotFudgeSundae.display();
		SideSalad.display();
		TripleBreakfastStacksMcgriddles.display();
		

	}

}
