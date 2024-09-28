package cibertec.edu.pe.daw_Examen_T1_Kafka.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;
    private static final String TOPIC = "topic_cibertec-app-examen-daw";

    public void enviarMensajeNotificacion(String mensaje){
        kafkaTemplate.send(TOPIC,mensaje);
        log.info("Mensaje construido");
    }
}
