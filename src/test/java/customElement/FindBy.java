package customElement;

/**
 * Created by michald on 24/02/2018.
 */
        import java.lang.annotation.ElementType;
        import java.lang.annotation.Retention;
        import java.lang.annotation.RetentionPolicy;
        import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface FindBy {
    String format() default "";
    String param() default "";
    String[] params() default {};
}
