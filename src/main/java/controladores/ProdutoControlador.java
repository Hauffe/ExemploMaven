/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.List;
import modelos.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author alexandre.hauffe
 */
@Controller
public class ProdutoControlador {
    
    @RequestMapping("/produtos")
    public ModelAndView obterProduto(){
        ModelAndView mav;
        mav = new ModelAndView("listar-produtos");
        
        List<Produto> produtos = new ArrayList<Produto>();
        
        Produto p1 = new Produto();
        p1.setId(1L);
        p1.setNome("Produto1");
        p1.setPrecoUnitario(999.99f);
        p1.setQuantidade(1);
        
        Produto p2 = new Produto();
        p2.setId(2L);
        p2.setNome("Produto2");
        p2.setPrecoUnitario(888.99f);
        p2.setQuantidade(3);
        
        Produto p3 = new Produto();
        p3.setId(3L);
        p3.setNome("Produto3");
        p3.setPrecoUnitario(777.99f);
        p3.setQuantidade(2);
        mav.addObject("produtos", produtos);
        
        return mav;
    }
    
}
