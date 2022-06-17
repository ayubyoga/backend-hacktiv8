Sesi 4
-----------------------------------------------------------------------------------------------------

Array

Array adalah sebuah variabel yang bisa menyimpan banyak data dalam 1 variabel dan menggunakan indeks
untuk mengakses data.
Deklarasi array	-> int[] contoh;
			   contoh = new int[4];
			   String[][] makanan; (array multidimensi)


Struktur Data Binary Tree

    - Terdapat aturan bahwa setiap child node sebelah kiri selalu lebih kecil nilainya dari pada root node
    - Dengan bahasa sederhana, yang kiri akan lebih kecil dan yang kanan akan lebih besar

Penelusuran Data (Transversal) pada BST
    1. PreOrder  -> Dimulai dari root, lalu ke ke node kiri terlebih dahulu, baru di print
        hasil output : 7, 1, 0, 3, 2, 5, 4, 6, 9, 8, 10
    2. InOrder   -> Dimulai dari simpul paling kiri berakhir di simpul paling kanan
        hasil output : 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    3. PostOrder -> Dimulai dari simpul paling kiri, berakhir di root
        hasil output : 0, 2, 4, 6, 5, 3, 1, 8, 10, 9, 7