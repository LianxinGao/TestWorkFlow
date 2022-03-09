package org.glx.workflow

import org.rocksdb.RocksDB

object MyTest {
  def main(args: Array[String]): Unit = {
    val db = RocksDB.open("/data/test.db")
    db.put(Array(1), Array(233))
    require(Array(233) sameElements db.get(Array(1)))
  }
}
