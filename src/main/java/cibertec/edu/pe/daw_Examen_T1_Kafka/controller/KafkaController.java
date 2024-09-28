package cibertec.edu.pe.daw_Examen_T1_Kafka.controller;

import cibertec.edu.pe.daw_Examen_T1_Kafka.kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;


    @GetMapping("/enviar")
    public String enviarNotificacion(@RequestParam String mensaje){
        kafkaProducer.enviarMensajeNotificacion(mensaje);
        return "Mensaje enviado a Kafka";
    }

}
