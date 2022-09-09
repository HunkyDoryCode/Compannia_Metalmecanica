package com.HunkyDoryCode.Services;

import com.HunkyDoryCode.Entities.MovimientoDinero;
import com.HunkyDoryCode.Repositories.RepositoryMovimientoDinero;

public class ServiceMovimientoDinero {
    private RepositoryMovimientoDinero md1;
    public MovimientoDinero getMovimientoDinero(MovimientoDinero mdd1){
        return this.md1.save(mdd1);

    }
}
