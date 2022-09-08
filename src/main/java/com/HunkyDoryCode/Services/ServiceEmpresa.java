package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.Empleado;
import com.HunkyDoryCode.Entities.Empresa;
import com.HunkyDoryCode.Repositories.RepositoryEmpresa;
import org.springframework.stereotype.Service;

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
    private RepositoryEmpresa repositorio;
    public ServiceEmpresa(RepositoryEmpresa repositorio){
        this.repositorio = repositorio;

    }
    public List<Empresa> getrepositorio(){
        return this.repositorio.findAll();
    }
    public Empresa crearRegistro(Empresa empresa1){
        return this.repositorio.save(empresa1);
    }
}
