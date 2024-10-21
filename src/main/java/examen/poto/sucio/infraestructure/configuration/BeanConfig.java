package examen.poto.sucio.infraestructure.configuration;

import examen.poto.sucio.app.repository.Reservacion_vueloRepository;
import examen.poto.sucio.app.service.Reservacion_vueloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //  declarar configuraciones y gestionar la creación de objetos (@Bean) de manera centralizada.
public class BeanConfig {
    @Bean
    public Reservacion_vueloService reservarService (Reservacion_vueloRepository reservaRepository){
        return new Reservacion_vueloService(reservaRepository);
    }
}
