// Arquivo: Aspirado.java
package io.github.davidMarostica.arquiteturaspring.montadora.api;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
// ... imports

/**
 * Anotação personalizada para qualificar beans do tipo "motorAspirado".
 */
@Qualifier("motorTurbo") // CORRIGIDO: Agora corresponde a @Bean(name = "motorAspirado")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
public @interface Eletrico {
}