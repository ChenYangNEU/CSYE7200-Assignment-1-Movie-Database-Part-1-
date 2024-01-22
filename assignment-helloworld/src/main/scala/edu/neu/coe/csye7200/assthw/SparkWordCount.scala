package edu.neu.coe.csye7200.assthw

import org.apache.spark.{SparkConf, SparkContext}

object SparkWordCount {
  def main(args: Array[String]): Unit = {
    // Set up Spark configuration
    val conf = new SparkConf().setAppName("Greetings").setMaster("local[*]")
    val sc = new SparkContext(conf)

    // Print the greeting message
    println("Hi, nice to meet you")

    // Stop SparkContext
    sc.stop()
  }
}
