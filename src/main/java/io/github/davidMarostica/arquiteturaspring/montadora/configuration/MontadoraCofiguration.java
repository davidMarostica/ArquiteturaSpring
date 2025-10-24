package io.github.davidMarostica.arquiteturaspring.montadora.configuration;

import io.github.davidMarostica.arquiteturaspring.montadora.Motor;
import io.github.davidMarostica.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraCofiguration {

    @Bean(name = "motorAspirado")

    public Motor motorAspirado(){
        var motor = new  Motor();
        motor.setCavalos(120);
        motor.setCilindros(4);
        motor.setModelo("XPO-0");
        motor.setLitragem(2.0);
        motor.setTipo(TipoMotor.ASPIRATOR);
        return motor;
    }

    @Bean(name = "motorEletrico")
    public Motor motorEletrico(){
        var motor = new  Motor();
        motor.setCavalos(110);
        motor.setCilindros(3);
        motor.setModelo("TH-10");
        motor.setLitragem(1.4);
        motor.setTipo(TipoMotor.ELETRICO);
        return motor;
    }
    @Bean(name = "motorTubo")
    public Motor motorTubo(){
        var motor = new  Motor();
        motor.setCavalos(180);
        motor.setCilindros(4);
        motor.setModelo("XPO-0");
        motor.setLitragem(1.5);
        motor.setTipo(TipoMotor.ASPIRATOR);
        return motor;
    }

}
