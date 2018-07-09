package com.bj.annotationprocessordemo;

import com.bj.annotation.Factory;

@Factory(
    id = "Margherita",
    type = Meal.class
)
public class MargheritaPizza implements Meal {

  @Override public float getPrice() {
    return 6f;
  }
}