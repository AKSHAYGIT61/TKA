
public class Product {

    private int id;
	private int quantity;
    private String name,category;
    private double price;


    public Product(int id, String name, double price, int quantity, String category) {
      this.id = id;
      this.name = name;
      this.price = price;
        this.quantity = quantity;
        this.category = category;
    }

   

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
    @Override
    public String toString() {
        return "Product [Id=" + id + ", Name=" + name + ", Price=" + price + 
               ", Qty=" + quantity + ", Category=" + category + "]";
    }
    
}
