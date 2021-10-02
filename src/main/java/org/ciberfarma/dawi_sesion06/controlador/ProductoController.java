package org.ciberfarma.dawi_sesion06.controlador;


import org.ciberfarma.dawi_sesion06.modelo.Producto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class ProductoController {
    
    @GetMapping("/cargar")
    public String cargarPagina(Model model){
        model.addAttribute("producto",new Producto());
        return "crudproductos";
    }

    @GetMapping("/grabar")
    public String grabarPagina(@ModelAttribute Producto producto){
       System.out.println(producto.toString());
        return "crudproductos";
    }
}
