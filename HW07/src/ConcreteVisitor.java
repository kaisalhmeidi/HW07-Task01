
public class ConcreteVisitor implements Visitor {
	
	@Override
	public void cost(Glass glass) {
		
		switch(glass.getTickness()) {
			case 1 :
				double cost1 = 2*glass.getLenght();
				System.out.println("Total Cost for " + glass.getName() + " is: " + cost1);
				break;
			case 2 :
				double cost2 = 1.20*glass.getLenght();
				System.out.println("Total Cost for " + glass.getName() + " is: " + cost2);
				break;
			case 3 :
				double cost3 = 0.70*glass.getLenght();
				System.out.println("Total Cost for " + glass.getName() + " is: " + cost3);
				break;
		}	
	}

	@Override
	public void cost(Electronic electronic) {
		double cost = 0;
		if (electronic.getFragile() == true) {
			cost = 5*((double)electronic.getWeight()/10);
			System.out.println("Total Cost for " + electronic.getName() + " is: " + cost);
		}else {
			cost = 5*((double)electronic.getWeight()/15);
			System.out.println("Total Cost for " + electronic.getName() + " is: " + cost);
		}
	}

	@Override
	public void cost(Furniture furniture) {
		double cost = 5*((double)furniture.getWeight()/20);
		System.out.println("Total Cost for " + furniture.getName() + " is: " + cost);	
		
	}

	@Override
	public void packing(Glass glass) {
		System.out.println(glass.getName()+ ":");
		System.out.println("    >should be filled with Bubble wraps and packed in a box with a dimension : " + (glass.getHeight()+1) + "x" + (glass.getLenght()+1) + "x" + (glass.getWidth()+1));
		
	}

	@Override
	public void packing(Electronic electronic) {
		System.out.println(electronic.getName() + ":");
		System.out.println("    >should be covered with Polyethylene foam film and packed in a box with a dimension : " + (electronic.getHeight()+1) + "x" + (electronic.getLenght()+1) + "x" + (electronic.getWidth()+1));	
	}

	@Override
	public void packing(Furniture furniture) {
		System.out.println(furniture.getName() + ":");
		System.out.println("    >should be covered with waterproof covers with area of : " + (furniture.getLenght())+ "x" + (furniture.getWidth()));
		
	}


}
