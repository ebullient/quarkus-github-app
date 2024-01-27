package io.quarkiverse.githubapp.event;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.inject.Qualifier;

@Target({ PARAMETER, TYPE })
@Retention(RUNTIME)
@Qualifier
public @interface RawEvent {

    String event() default Events.ALL;

    String action() default Actions.ALL;
}
