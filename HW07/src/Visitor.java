
public interface Visitor {
	
	public void cost(Glass glass);
	public void cost(Electronic electronic);
	public void cost(Furniture furniture);
	
	public void packing(Glass glass);
	public void packing(Electronic electronic);
	public void packing(Furniture furniture);
	

}
