package com.knoldus

class Store {

  def productStatus(f: String => Unit, productName: String): Unit = {
    f(productName)
  }

}
