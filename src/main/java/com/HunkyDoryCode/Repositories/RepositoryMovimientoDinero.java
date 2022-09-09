package com.HunkyDoryCode.Repositories;

import com.HunkyDoryCode.Entities.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryMovimientoDinero extends JpaRepository <MovimientoDinero, Long> {
}
