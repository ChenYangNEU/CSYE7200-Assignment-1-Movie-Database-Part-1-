package edu.neu.coe.csye7200.assthw

import org.apache.spark.SparkContext

object HelloWorldSpark extends App{

  val sparkContext = new SparkContext("local","Hello World")
  val sourceRDD = sparkContext.textFile("C:\\data\\sample_input.txt")
  sourceRDD.take(1).foreach(println)
}
