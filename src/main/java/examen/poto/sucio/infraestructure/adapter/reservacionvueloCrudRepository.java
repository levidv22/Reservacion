package examen.poto.sucio.infraestructure.adapter;

import examen.poto.sucio.infraestructure.entity.reservacion_vueloEntity;
import org.springframework.data.repository.CrudRepository;

public interface reservacionvueloCrudRepository extends CrudRepository<reservacion_vueloEntity, Integer>{
    
}
