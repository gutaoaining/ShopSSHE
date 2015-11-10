package com.gt.services.Impl;

import org.springframework.stereotype.Service;

import com.gt.model.Busorder;
import com.gt.model.Product;
import com.gt.model.Sorder;
import com.gt.services.base.SorderServiceI;

@Service("sorderService")
public class SorderServiceImpl extends BaseServiceImpl<Sorder> implements SorderServiceI{

	@Override
	public Busorder Sorderadd(Busorder border, Product product) {
		Sorder sorder = productToSorder(product);
		boolean isHave = false;
		for (Sorder oldsorder : border.getSorderSet()) {
			if(oldsorder.getProduct().getId().equals(sorder.getProduct().getId())){
				oldsorder.setNumber(oldsorder.getNumber()+sorder.getNumber());
				isHave = true;
				break;
			}			
		}
		if(isHave == false){
			//此时border的主键为空，入库时会自动生成
			sorder.setBusorder(border);
			border.getSorderSet().add(sorder);
		}
		System.out.println("-----SorderServiceImpl-----");
		return border;
	}
   public Sorder productToSorder(Product product){
	   Sorder sorder = new Sorder();
	   sorder.setName(product.getName());
	   sorder.setNumber(1);
	   sorder.setPrice(product.getPrice());
	   sorder.setProduct(product);
	   return sorder;
   }
	

}
