package grossu.testannotation;


import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
/**
 * Указывает на то, что метод необходимо выполнить перед другими
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface BeforeAllMethod {
}
