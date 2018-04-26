package domain;

public class Test {
    private String tid;
    private String departure_add;
    private String destination_add;
    private String departure_time;
    private String arrival_time;
    private String price;
    private String uname_code;
	public Test(String tid, String departure_add, String destination_add, String departure_time, String arrival_time,
			String price, String uname_code) {
		super();
		this.tid = tid;
		this.departure_add = departure_add;
		this.destination_add = destination_add;
		this.departure_time = departure_time;
		this.arrival_time = arrival_time;
		this.price = price;
		this.uname_code = uname_code;
	}
    public Test(){
    	super();
    }
	public String getTid() {
		return tid;
	}
	public void setTid(String tid) {
		this.tid = tid;
	}
	public String getDeparture_add() {
		return departure_add;
	}
	public void setDeparture_add(String departure_add) {
		this.departure_add = departure_add;
	}
	public String getDestination_add() {
		return destination_add;
	}
	public void setDestination_add(String destination_add) {
		this.destination_add = destination_add;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getUname_code() {
		return uname_code;
	}
	public void setUname_code(String uname_code) {
		this.uname_code = uname_code;
	};
    
    
}
