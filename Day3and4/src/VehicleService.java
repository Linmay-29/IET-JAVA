import java.util.Date;

public class VehicleService {
	private int id;
	private String name;
	private String type;
	private Date datePurchase;
	
	public VehicleService() {
		id = 0;
		name = null;
		type = null;
		datePurchase = null;
		
	}

	public VehicleService(int id, String name, String type, Date datePurchase) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.datePurchase = datePurchase;
	}

	@Override
	public String toString() {
		return "VehicleService [id=" + id + ", name=" + name + ", type=" + type + ", datePurchase=" + datePurchase
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDatePurchase() {
		return datePurchase;
	}

	public void setDatePurchase(Date datePurchase) {
		this.datePurchase = datePurchase;
	}
	
}
