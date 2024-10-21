package examen.poto.sucio.infraestructure.adapter;

import examen.poto.sucio.app.repository.Reservacion_vueloRepository;
import examen.poto.sucio.infraestructure.entity.reservacion_vueloEntity;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class reservacionvueloRepositoryImpl implements Reservacion_vueloRepository{
    private final reservacionvueloCrudRepository reservacionCrudRepository;

    public reservacionvueloRepositoryImpl(reservacionvueloCrudRepository reservacionCrudRepository) {
        this.reservacionCrudRepository = reservacionCrudRepository;
    }
    
    @Override
    public List<reservacion_vueloEntity> getReservation(){
        return (List<reservacion_vueloEntity>) reservacionCrudRepository.findAll();//si no tiene el find all no se va a mostrar todos los productos
    }
    
    @Override
    public reservacion_vueloEntity getReservationById(Integer id){
        return reservacionCrudRepository.findById(id).get(); //sin el find all no muestra la reservacion por ID
    }
    
    @Override
    public reservacion_vueloEntity saveReservation(reservacion_vueloEntity reservationEntity){
        return reservacionCrudRepository.save(reservationEntity);
    }
    
    @Override
    @Transactional
    public boolean deleteReservationById(Integer id){
     reservacionCrudRepository.deleteById(id);
        return true;
    }
    
    
}
