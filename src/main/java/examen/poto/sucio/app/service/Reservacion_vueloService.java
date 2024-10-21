package examen.poto.sucio.app.service;

import examen.poto.sucio.app.repository.Reservacion_vueloRepository;
import examen.poto.sucio.infraestructure.entity.reservacion_vueloEntity;
import java.util.List;

public class Reservacion_vueloService {

    private final Reservacion_vueloRepository reservacion_vueloRepository;//llamo al repository, luego inserto un constructor

    public Reservacion_vueloService(Reservacion_vueloRepository reservacion_vueloRepository) {
        this.reservacion_vueloRepository = reservacion_vueloRepository;
    }//:) 
//puente que ayuda a pasar de un lado a otro
    
    public List<reservacion_vueloEntity> getReservation() {
        return reservacion_vueloRepository.getReservation();
    }

    public reservacion_vueloEntity getReservationById(Integer id) {
        return reservacion_vueloRepository.getReservationById(id);
    }

    public reservacion_vueloEntity saveReservation(reservacion_vueloEntity reservationEntity) {
//        if (reservationEntity.getId() == null) {
//        
//         reservationEntity.setFechaVuelo(LocalDateTime.now());
//         reservationEntity.setActualizarFvuelo(LocalDateTime.now());
//        return reservacion_vueloRepository.saveReservation(reservationEntity);
//        } else {
//        reservacion_vueloEntity reservar = reservacion_vueloRepository.getReservationById(reservationEntity.getId());
//        reservationEntity.setDestino(reservar.getDestino());
//        reservationEntity.setNombrePasajero(reservar.getNombrePasajero());
//        reservationEntity.setNumeroVuelo(reservar.getNumeroVuelo());
//        reservationEntity.setOrigen(reservar.getOrigen());
//        reservationEntity.setActualizarFvuelo(LocalDateTime.now());
        return reservacion_vueloRepository.saveReservation(reservationEntity);
//        }
    }

    public boolean deleteReservationById(Integer id) {
        return reservacion_vueloRepository.deleteReservationById(id);
    }
}
