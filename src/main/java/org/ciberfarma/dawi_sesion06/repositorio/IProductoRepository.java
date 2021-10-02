package org.ciberfarma.dawi_sesion06.repositorio;

import org.ciberfarma.dawi_sesion06.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository <Producto,String> {

}
