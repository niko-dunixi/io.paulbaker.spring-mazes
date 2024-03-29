package io.paulbaker.springmazes.controller;

import io.paulbaker.springmazes.structures.BasicCartesianGrid;

/**
 * Created by paulbaker on 8/24/16.
 */
@FunctionalInterface
public interface BasicCartesianGridSupplier {

    BasicCartesianGrid Supply(int rows, int columns);
}
