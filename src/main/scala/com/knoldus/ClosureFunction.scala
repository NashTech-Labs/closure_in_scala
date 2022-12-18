package com.knoldus

object ClosureFunction extends App {

  // defining closure function
  private def displayProductStatus(productName: String): Unit = {
    println(s"The product: $productName is $status in the store.")
  }

  val store = new Store

  // free variable (status is a impure variable because it's value is changing on the basis of products availability)
  private var status = "available"

  // calling the main function with closure function as an argument
  store.productStatus(displayProductStatus, "I phone 14 pro")

  // changing value of the free variable
  status = "out of Stock"

  // calling the main function with closure function as an argument
  store.productStatus(displayProductStatus, "Apple air pods")

}
