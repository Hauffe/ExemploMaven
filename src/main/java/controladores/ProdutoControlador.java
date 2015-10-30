/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

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
        Produto p = new Produto();
        p.setId(1L);
        p.setNome("Produto");
        p.setPrecoUnitario(999.99f);
        p.setQuantidade(1);
        mav.addObject("produto", p);
        
        return mav;
    }
    
}
