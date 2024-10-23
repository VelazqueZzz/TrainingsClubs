package org.javaproject;

public interface Calculator <T extends Number>{
    double calculateFees(T clubId);
}
