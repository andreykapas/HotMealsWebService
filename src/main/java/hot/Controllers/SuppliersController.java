package hot.Controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import hot.Model.Dish;
import hot.Model.Supplier;
import hot.Model.SuppliersRepository;

@RestController
@RequestMapping("/hotmeals/suppliers")
public class SuppliersController {

    //private List<Supplier> suppliers = null;
    //private final AtomicLong counter = new AtomicLong();
	
	@Autowired
	private SuppliersRepository sr;
	

    @RequestMapping(method = RequestMethod.GET)
    List<Supplier> fetchSuppliers() {
        return sr.findAll();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody Supplier addSup(@RequestBody Supplier s) {
    	return sr.save(s);
    }
/*
    @RequestMapping(value = "/{supplierId}/dishes", method = RequestMethod.GET)
    public List<Dish> fetchDishes(@PathVariable Long supplierId) {
    	Supplier supplier = sr.findOne(supplierId);
        if (supplier != null) {
                return supplier.getDishes();
        }
        return new ArrayList<Dish>();
    }

    @RequestMapping(value = "/{supplierId}/dishes/{date}", method = RequestMethod.GET)
    public List<Dish> fetchDishes(@PathVariable Long supplierId, @PathVariable String date) {
    	Supplier supplier = sr.findOne(supplierId);
        if (supplier != null) {
                return supplier.selectDishes(date);
        }
        return new ArrayList<Dish>();
    }
*/
    private void syncWithDatabase() {
        /*
        suppliers.add(new Supplier("Bronte"));
        suppliers.add(new Supplier("KFC"));
        suppliers.add(new Supplier("doorknob"));
        suppliers.add(new Supplier("switch"));
        suppliers.add(new Supplier("delicious"));
        suppliers.add(new Supplier("Gourmet"));
         */
    }
}