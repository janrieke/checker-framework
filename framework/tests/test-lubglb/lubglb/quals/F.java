package lubglb.quals;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.DefaultFor;
import org.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import org.checkerframework.framework.qual.TypeUseLocation;
import org.checkerframework.framework.qual.SubtypeOf;

@SubtypeOf({D.class, E.class})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@DefaultFor({ TypeUseLocation.LOWER_BOUNDS})
@DefaultInUncheckedCodeFor({ TypeUseLocation.RETURNS})
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
public @interface F { }
