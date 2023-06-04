package start.spring.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import java.util.List;


import start.spring.dao.ProductDao;
import start.spring.model.Product;

@Controller
public class MainContriller {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/")
	public String home(Model m)
	{
		List<Product> products = productDao.getProducts();
		m.addAttribute("products", products);
		return "index";
	}
	
	//show add Product form
	@RequestMapping("/add-Product")
	public String addPProduct(Model m)
	{
		m.addAttribute("title","Add Product");
		return "add_Product_form";
	}
	
	//handle add Product form
	@RequestMapping(value="/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct (@ModelAttribute Product product , HttpServletRequest request)
	{
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//delete handler
	public RedirectView deleteProduct(@PathVariable("$productId") int productId , HttpServletRequest request)
	{
		this.productDao.deleteProducts(productId);
	 
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//Update handler
	@RequestMapping("/update/{productId}")
public String updateForm(@PathVariable("productId") int pid,Model model)
{
	Product product = this.productDao.getSingleProducts(pid);
	model.addAttribute("product", product);
	return "updateform";
}


}
