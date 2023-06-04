package start.spring.dao;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import java.util.List;
import start.spring.model.Product;

@Component
public class ProductDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create
	@Transactional
	public void createProduct(Product product)
	{
		this.hibernateTemplate.saveOrUpdate(product);
	}
	
	//get all products
	public List<Product> getProducts()
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		
		return products;
	}
	
	//delete a single product
	@Transactional
    public void deleteProducts(int pid)
    {
    	Product p = this.hibernateTemplate.load(Product.class,pid);
    	this.hibernateTemplate.delete(p);
    }
    
    //get a single Product
    public Product getSingleProducts(int pid)
    {
    	return this.hibernateTemplate.get(Product.class,pid);
    } 
}
