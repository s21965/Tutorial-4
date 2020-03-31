package tutorial4;

public class product {

	    private String name;
	    public double price;
	    private String code;
	    public int amount;

	    public product (String name, double price, String code){
	    	
	        this.name = name;
	        this.price = price;
	        this.code = code;
	        amount = 0;
	        
	    }

	    public product (String name, double price, String code, int amount){
	    	
	        this.name = name;
	        this.price = price;
	        this.code = code;
	        
	        if (amount<0){
	        	
	            System.out.println("Number of items cannot be less than 0");
	            
	        } else{
	        	
	        this.amount = amount;
	        
	        }
	    }

	    public void setPrice(double price) {
	    	
	        this.price = price;
	        
	    }

	    public void setAmount(int amount) {
	    	
	        if(amount<0){
	        	
	            System.out.println("Number of items cannot be less than 0");
	            
	        } else{
	        	
	            this.amount = amount;
	            
	        }
	    }

	    public String getName() {
	        return name;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getCode() {
	        return code;
	    }

	    public int getAmount() {
	        return amount;
	    }
	}
	

