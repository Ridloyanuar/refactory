fun main(args: Array<String>) {
    val produk1 = "Air Putih..............Rp.5000"
    val produk2 = "Lauk..................Rp.10000"
    val produk3 = "Nasi...................Rp.5000"

    var totalan = 0
    var produk = ""
    val harga1 = 5000
    val harga2 = 10000
    val harga3 = 5000

    print("Masukkan Nama Warung: ")
    val namaWarungInput = readLine()!!
    print("Masukkan Tanggal: ")
    val tanggalInput = readLine()!!
    print("Masukkan Nama Kasir: ")
    val namaKasirInput = readLine()!!

    do {
        println("============================")
        println("\t$namaWarungInput")
        println("============================")
        println("1. Air Putih (Rp.5000)")
        println("2. Lauk  (Rp.10000)")
        println("3. Nasi  (Rp.5000)")
        println("9. Selesai dan Hitung Pembayaran")
        println("0. Keluar Program")
        println("============================")
        print("Masukkan Pilihan: ")
        val pilihanInput = readLine()!!.toInt()
        if (pilihanInput == 1){
            print("Masukkan Jumlah Beli: ")
            val jumlahInput = readLine()!!.toInt()
            produk = "$produk\n$produk1(x$jumlahInput)"
            totalan = totalan + (jumlahInput * harga1)
        }else if (pilihanInput == 2){
            print("Masukkan Jumlah Beli: ")
            val jumlahInput = readLine()!!.toInt()
            produk = "$produk\n$produk2(x$jumlahInput)"
            totalan = totalan + (jumlahInput * harga2)
        }else if (pilihanInput == 3){
            print("Masukkan Jumlah Beli: ")
            val jumlahInput = readLine()!!.toInt()
            produk = "$produk\n$produk3(x$jumlahInput)"
            totalan = totalan + (jumlahInput * harga3)
        }else if(pilihanInput == 9){
            println("Program Selesai\n" +
                    "============================")
        }else{
            println("Salah Memasukkan Input/Data Tidak Tersedia")
        }
    }while (pilihanInput!=9)

    println(namaWarungInput)
    println("Tanggal : $tanggalInput")
    println("Nama Kasir : $namaKasirInput")
    println("============================")
    println(produk)
    println("Total.................Rp.$totalan")

}