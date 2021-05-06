package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{
	
	private ProductDao dao;

	public ProductManager(ProductDao dao) {
		this.dao = dao;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("bu kategoride ürün kabul edilmiyor.");
			return;
		}
		this.dao.add(product);
	}

	@Override
	public List<Product> getAll() {
		return this.dao.getAll();
	}
	
}
