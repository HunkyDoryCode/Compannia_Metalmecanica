package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.MovimientoDinero;
import com.HunkyDoryCode.Repositories.RepositoryMovimientoDinero;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ServiceMovimientoDinero {

    private RepositoryMovimientoDinero repositoriomd1;

    public ServiceMovimientoDinero(RepositoryMovimientoDinero repositoriomd1){
        this.repositoriomd1 = repositoriomd1;
    }

    public List<MovimientoDinero> getInformacion(){
        return  this.repositoriomd1.findAll();
    }
    //CRUD
    //Create: Crear
    public MovimientoDinero crearMovimientoDinero(MovimientoDinero nuevoregistroMovimientoDinero){
        return this.repositoriomd1.save(nuevoregistroMovimientoDinero);
    }

    //Update: Actualizar
    public MovimientoDinero actualizarMovimientoDinero(@PathVariable Long id, @RequestBody MovimientoDinero MovDin){
        MovimientoDinero movimientoDineroActuali = this.repositoriomd1.findById(id).orElseThrow();
        movimientoDineroActuali.setConceptoMovimiento(MovDin.getConceptoMovimiento());
        movimientoDineroActuali.setMontoMovimento(MovDin.getMontoMovimento());
        return this.repositoriomd1.save(movimientoDineroActuali);
    }
    //Delete: Eliminar
    public MovimientoDinero eliminarMovimientoDinero(Long id){
        MovimientoDinero movimientoDineroActuali = this.repositoriomd1.findById(id).orElseThrow();
        this.repositoriomd1.deleteById(id);
        return movimientoDineroActuali;
    }
}