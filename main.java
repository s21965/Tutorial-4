package tutorial4;

public class main {
	
	public main(String[] args) {
		
        user u1 = new user("KHAI","THANT","s21965@pjwstk.edu.pl","KHAIHANT");
        
        user u2 = new user("s21784@pjwskt.edu.pl");
        
        u2.createUserFromGuest("SAOIRSE", "RONAN", "SAOIRSERONAN");

        product p1 = new product("Rice",5.99,"3M345",50);
        
        product p2 = new product("Cola", 3.49, "2Z345",70);
        
        product p3 = new product("toiletPaper",11.99,"2S456",90);
        
        p2.setPrice(99999.99);
        
        p3.setAmount(999);
    }

}
