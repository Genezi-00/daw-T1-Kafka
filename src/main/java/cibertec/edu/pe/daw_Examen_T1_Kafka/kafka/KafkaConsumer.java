package cibertec.edu.pe.daw_Examen_T1_Kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic_cibertec-app-examen-daw",groupId = "group_cibertec-examen-daw")
    public void obtenerMensajeNotificacion(String mensaje){
        log.info("Mensaje de notificacion de orden recibido "+mensaje);
    }
}
