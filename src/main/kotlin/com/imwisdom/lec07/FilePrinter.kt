package com.imwisdom.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FilePrinter {

    //throws IOException이 필요가 없음
    //코틀린에서는 모두 Unchecked Exception
    fun readFile() {
        val currentFile = File(".")
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }

    //try with resources 대신 use 사용
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader ->
            println(reader.readLine())
        }
    }
}