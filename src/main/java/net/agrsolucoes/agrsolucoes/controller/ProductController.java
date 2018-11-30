package net.agrsolucoes.agrsolucoes.controller;


import net.agrsolucoes.agrsolucoes.database.dao.ProductDAO;
import net.agrsolucoes.agrsolucoes.database.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.PathVariable;
import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.util.List;

@Controller
public class ProductController {

    @ResponseBody
    @RequestMapping(value = "/produtos", method = GET, produces = "application/json")
    public List<Product> getAll() {
        ProductDAO dao = new ProductDAO();

        return dao.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/produtos/{id}", method = GET, produces = "application/json")
    public Product getById(@PathVariable Long id) {
        ProductDAO dao = new ProductDAO();

        return dao.getById(id);
    }

    @ResponseBody
    @RequestMapping(value = "/produtos", method = POST, produces = "application/json")
    public ResponseEntity<?> add(@RequestBody Product product) {
        ProductDAO dao = new ProductDAO();
        dao.insert(product);
        return ResponseEntity.ok().build();
    }

    @ResponseBody
    @RequestMapping(value = "/produtos/{id}", method = PUT, produces = "application/json")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Product product) {
        ProductDAO dao = new ProductDAO();
        product.setId(id);
        dao.update(product);
        return ResponseEntity.ok().build();
    }

    @ResponseBody
    @RequestMapping(value = "/produtos/{id}", method = DELETE, produces = "application/json")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        ProductDAO dao = new ProductDAO();
        dao.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
