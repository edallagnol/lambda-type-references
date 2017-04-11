package com.benjiweber.typeref;

import java.util.function.Supplier;

public interface MethodAwareSupplier<T> extends Supplier<T>, MethodFinder { }
