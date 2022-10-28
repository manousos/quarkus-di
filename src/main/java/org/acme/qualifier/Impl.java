package org.acme.qualifier;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.*;

@Qualifier
@Retention(RUNTIME)
@Target({ FIELD, TYPE, METHOD, PARAMETER })
public @interface Impl {

	Class<?> value();

}
