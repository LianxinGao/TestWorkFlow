package org.glx.workflow

import org.apache.commons.io.FileUtils
import org.rocksdb.RocksDB

import java.io.File

object MyTest {
  def main(args: Array[String]): Unit = {
    val file = new File("./testOutput")
    if (file.exists()) FileUtils.deleteDirectory(file)
    FileUtils.forceMkdir(file)
    val db = RocksDB.open("./testOutput/test.db")
    db.put(Array(1.toByte), Array(233.toByte))
    require(Array(233.toByte) sameElements db.get(Array(1.toByte)))
    println("run my Code !!!!!!!!!!!!!!!!!!!")
  }
}
