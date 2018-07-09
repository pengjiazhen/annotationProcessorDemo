package com.bj.annotationprocessordemo;

import com.bj.annotation.Factory;

@Factory(
    id = "Calzone",
    type = Meal.class
)
public class CalzonePizza implements Meal {

  @Override public float getPrice() {
    return 8.5f;
  }
}