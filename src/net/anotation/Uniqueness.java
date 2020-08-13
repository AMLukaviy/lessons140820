package net.anotation;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
