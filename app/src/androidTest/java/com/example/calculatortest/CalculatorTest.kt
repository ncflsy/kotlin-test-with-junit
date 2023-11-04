package com.example.calculatortest

import org.jetbrains.annotations.TestOnly
import org.junit.Test

class CalculatorTest {
    // ini merupakan file yang akan digunakan untuk melakukan testing function penjumlahan tadi. pertama akan mendeklarasikan class calculator
    // yang diakan ditampung ke dalam variabel calculator
    var calculator = Calculator();
    //selanjutnya membuat function test. yaitu memanggil fcuntion calculator dengan memberikan parameter 10 dan 10 dan menampung hasilnya
    // kedalam variabel result. apalbila test benar maka akan menampilkan indikator centang atau berhasil namun apoabila salah maka akan
    // menampilkan pesan eror atau gagal
    @Test
    fun testAddSuccess(){
        var result = calculator.add(10,10);
    }
}