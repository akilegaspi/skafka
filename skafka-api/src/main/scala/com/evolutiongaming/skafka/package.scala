package com.evolutiongaming

package object skafka {

  type Partition = Int

  type Offset = Long
  
  type Topic = String

  type Metadata = String


  type Bytes = Array[Byte]

  object Bytes {
    val Empty: Bytes = Array.empty
  }
}