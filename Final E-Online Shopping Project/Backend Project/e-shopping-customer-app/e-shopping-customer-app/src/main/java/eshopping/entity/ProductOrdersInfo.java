package eshopping.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductOrdersInfo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int poid;
private int oid;
private int pid;
private int qty;
public int getPoid() {
	return poid;
}
public void setPoid(int poid) {
	this.poid = poid;
}
public int getOid() {
	return oid;
}
public void setOid(int oid) {
	this.oid = oid;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public int getQty() {
	return qty;
}
public void setQty(int qty) {
	this.qty = qty;
}

}
