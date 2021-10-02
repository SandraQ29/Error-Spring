package org.ciberfarma.dawi_sesion06.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_productos")
@Getter
@Setter
@ToString
public class Producto{
    
    @Id
    @Column(name="id_prod")
    private String codigo;

    @Column(name="des_prod")
    private String descripcion;

    @Column(name="stk_prod")
    private int stock;

    @Column(name="pre_prod")
    private double precio;

    private int idcategoria;

    @Column(name="est_prod")
    private int estado;
   
    private int idproveedor;

    




}
