package tests.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import org.checkerframework.framework.qual.DefaultInUncheckedCodeFor;
import org.checkerframework.framework.qual.TypeUseLocation;
import org.checkerframework.framework.qual.DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.SubtypeOf;

/** A supertype of SubQual. */
@SubtypeOf({})
@DefaultQualifierInHierarchy
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@DefaultInUncheckedCodeFor({ TypeUseLocation.RETURNS, TypeUseLocation.UPPER_BOUNDS })
public @interface SuperQual {}
