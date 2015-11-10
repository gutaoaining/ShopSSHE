package com.gt.model;
// Generated 2015-10-11 20:55:41 by Hibernate Tools 4.0.0



/**
 * 
* @ClassName: Sorder 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author gutao 
* @date 2015年11月10日 下午5:08:08 
*
 */
public class Sorder implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7003708334893781345L;
	private Integer id;
	private String name;
	private Double price;
	private Integer number;
	private Product product;
	private Busorder busorder;

	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Busorder getBusorder() {
		return busorder;
	}

	public void setBusorder(Busorder busorder) {
		this.busorder = busorder;
	}

	@Override
	public String toString() {
		return "Sorder [id=" + id + ", name=" + name + ", price=" + price + ", number=" + number + ", product="
				+ product + ", busorder=" + busorder + "]";
	}

    
}
