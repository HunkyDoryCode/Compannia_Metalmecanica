package com.HunkyDoryCode.Services;


import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Repositories.RepositoryEmpleado;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class ServiceEmpleado {

    //Relacion Repositorio Empleado
    private RepositoryEmpleado repositorioE;

        //Constructor:
        public ServiceEmpleado(RepositoryEmpleado repositorioE){
            this.repositorioE = repositorioE;
    }

    public List<Empleado> getInformacion(){
            return this.repositorioE.findAll();
    }
    //CRUD: Create
    public Empleado crearEmpleado(Empleado nuevouser){
            return this.repositorioE.save(nuevouser);
    }

    //Update: Actualizar
    public Empleado actualizarEmpleado(@PathVariable Long id, @RequestBody Empleado emple){
            Empleado empleadoActuali = this.repositorioE.findById(id).orElseThrow();
            empleadoActuali.setCorreo(emple.getCorreo());
            empleadoActuali.setNombre(emple.getNombre());
            empleadoActuali.setRolEmpleado(emple.getRolEmpleado());
            return this.repositorioE.save(empleadoActuali);

    }
    //Delete: Eliminar
    public Empleado eleminEmpleado(Long id){
            Empleado empleadoActuali = this.repositorioE.findById(id).orElseThrow();
            this.repositorioE.deleteById(id);
            return empleadoActuali;
    }
}