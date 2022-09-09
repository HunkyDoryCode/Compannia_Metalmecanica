package com.HunkyDoryCode.Repositories;

import com.HunkyDoryCode.Entities.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryEmpleado extends JpaRepository<Empleado,Long>{
}
