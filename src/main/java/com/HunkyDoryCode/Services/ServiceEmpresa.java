package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Repositories.RepositoryEmpresa;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
@Service
public class ServiceEmpresa {
    /*

    Empresa ep1;
    ServiceEmpleado se1 = new ServiceEmpleado();
    public ServiceEmpresa(){
      Empleado emple1 = this.se1.getEmpleado();

        this.ep1 = new Empresa("Mecanicas Garcia", "calle 1 # 1-10",
                3113502, "900789879-8",emple1);
    }
    public Empresa GetEmpresa(){
        return this.ep1;
    }
    */
    private RepositoryEmpresa repositorioEm;
    public ServiceEmpresa(RepositoryEmpresa repositorioEm){
        this.repositorioEm = repositorioEm;

    }
    public List<Empresa> getInformation(){

        return this.repositorioEm.findAll();
    }

    //CRUD:

    //Create: Crear
    public Empresa crearEmpresa(Empresa empresa1){

        return this.repositorioEm.save(empresa1);
    }

    //Update: Actualizar:
    public Empresa actualizarEmpresa(@PathVariable Long id, @RequestBody Empresa Emp){
        Empresa empresaActuali = this.repositorioEm.findById(id).orElseThrow();
        empresaActuali.setNombre(Emp.getNombre());
        empresaActuali.setDireccion(Emp.getDireccion());
        empresaActuali.setTelefono(Emp.getTelefono());
        empresaActuali.setNit(Emp.getNit());
        return this.repositorioEm.save(empresaActuali);
    }
    //Delete: Eliminar
    public Empresa eliminEmpresa(Long id){
        Empresa empresaActuali = this.repositorioEm.findById(id).orElseThrow();
        this.repositorioEm.deleteById(id);
        return empresaActuali;
    }

}
