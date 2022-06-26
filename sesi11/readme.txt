Sesi 11

MongoDB

benefits:
parsing lbh cepat, mendukung tipe data native: dates, binary data

use database_name -> membuat database
show dbs -> database list
show collections -> list of collections
db.createCollection("profile"); -> membuat collection

....insertOne(); 			-> tambah 1 dokumen

....insertMany(); 		-> tambah banyak dokumen

....find() 				-> menampilkan semua data

....find({condition}); 		-> mencari data dengan kondisi tertentu

....updateOne(filter, update) -> memperbaharui 1 data

....updateMany() 			-> memperbaharui beberapa data

....replaceOne(filter, update) -> mengganti 1 dokumen

....deleteOne(filter)		-> menghapus 1

....deleteMany(filter)		-> menghapus beberapa


- One to one

- One to Many

- Many to many

- Many to one

Pada SQL database seperti MySQL, sebuah database adalah gabungan dari satu atau banyak tabel.
Sedangkan pada MongoDB, sebuah database adalah gabungan dari satu atau banyak collection.

JSON adalah singkatan dari JavaScript Object Notation, JSON menjadi salah satu format data yang paling banyak digunakan untuk transfer data antara browser dan server.
Pada dasarnya JSON hanya sebuah text yang memiliki format/syntax sebagai berikut:
	{
	"key" : "value"
	}
BSON adalah singkatan dari Binary JSON, BSON memiliki beberapa keunggulan dibandingkan dengan
JSON diantaranya tingkat parsing yang lebih cepat dan mendukung lebih banyak tipe data native seperti :
dates dan binary data.

Syntax
Buka terminal dan eksekusi perintah berikut:
	mongo
- Membuat database		:
	use database_name
- Untuk melihat database	:
	show dbs

- Membuat Collection	:
	db.createCollection("NAME_COLLECTON")

- Menambahkan data		:
	db.collection.insertOne()	->	untuk menambahkan document tunggal/single
	db.collection.insertMany()	->	untuk menambahkan banyak document

- Read				:
	db.collection.find()

- Update	:
	db.collection.updateOne(filter, update)	->	ubah satu document
	db.collection.updateMany(filter, update)	->	ubah banyak document sekaligus sesuai 

- filter	:
	db.collection.replaceOne(filter, update)	->	ganti satu document dengan document yang baru

- Delete	:
	db.collection.deleteOne(filter)	->	hapus satu document
	db.collection.deleteMany(filter)	->	hapus banyak document sekaligus sesuai filter


*QUERY*
use items_name

db.createCollection("items",{
validator : {
$jsonSchema : {
|
}
}
}

$jsonSchema : {
bsonType : “object”,
Required : [“itemname”, “itemprice”, “itemunique”, “description”]
}

itemName : {
bsonType : “string”,
Description : “Nama Item harus berupa karakter dan tidak boleh kosong!”
},

itemPrice : {
bsonType : “number”,
Description : “Harga Item harus berupa number dan tidak boleh kosong!”
},

itemUnique : {
bsonType : “objectId”,
Description : “Jenis Item harus berupa objectID dan tidak boleh kosong!”
},

description : {
bsonType : “array”,
Description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”
},

description : {
bsonType : “array”,
Description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”,

Items : {
Merk : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
}

ukuran : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
}

stock : {
bsonType :”number”,
description : “Stock harus berupa angka dan tidak boleh kosong!”
},

description : {
bsonType : “array”,
description : “Deskripsi harus berupa karakter dan tidak boleh kosong!”,

items : {
bsonType : “object”,
required : [“merk”,”ukuran”,”stok”],

Properties : [
Merk : {
bsonType : “string”,
description : “Ukuran harus berupa karakter dan tidak boleh kosong!”
},
)


Contoh Pembuatan Database :


1. One to One
- use kantor_polisi
     membuat database kantor polisi 
	- db.createCollection("tersangka");
	- db.createCollection("jenis_kejahatan");
	  membuat collection tersangka dan jenis_kejahatan 

- db.tersangka.insertOne({ nama : "Asep", umur : 23 , jenis_kejahatan : "kejahatan_01"});
    memasukkan data ke collection tersangka dengan field tersebut

- db.jenis_kejahatan.insertOne({ _id : "kejahatan_01" , jenis_kejahatan : "pembunuhan"});
    memasukkan data ke collection jenis_kejahatan dengan field tersebut

- var jenis_kejahatan_id = db.tersangka.findOne().jenis_kejahatan
    menyimpan data yang ada di collection jenis_kejahatan ke dalam variabel jenis_kejahatan_id

- db.jenis_kejahatan.findOne({_id : jenis_kejahatan_id})
    memanggil data yang ada di collection jenis_kejahatan dengan variabel jenis_kejahatan_id
    
Hasil Akhir : 
    Dengan menyimpan data jenis_kejahatan tersangka, kita dapat mencari nama jenis_kejahatan di tabel jenis_kejahatan

2. One to Many
	Sebuah hubungan antara tabel dimana tabel A memiliki sebuah data yang bisa di pakai pada tabel B data 
	tersebut bisa banyak data atau beberapa data saja.

  Pengerjaan:
  - use transaksi_hacktiv8
    membuat database transaksi_hacktiv8
  - db.createCollection("pelanggan");
  - db.createCollection("transaksi");
    membuat collection pelanggan dan transaksi
  - db.pelanggan.insertOne({_id : "PL0001", nama_pelanggan : "Brudi"});
    melakukan insert data ke collection pelanggan dengan field tersebut
  - db.pelanggan.insertOne({_id : "TR0001", tanggal_transaksi : new Date(), total_harga : 100000, id_pelanggan : "PL0001"});
    memasukkan data ke collection transaksi dengan field tersebut
  -  db.transaksi.insertOne({_id: "TR0002", tanggal_transaksi: new Date(), total_harga: 120000, id_pelanggan: "PL0001" });
    memasukkan data ke 2 di collection transaksi
  -  db.transaksi.insertOne({_id: "TR0003", tanggal_transaksi: new Date(), total_harga: 150000, id_pelanggan: "PL0001" });
    memasukkan data ke 3 di collection transaksi
  - db.transaksi.find().pretty()
    menampilkan isi dari collection transaksi
    Hasil Akhir: 
    Terlihat bahwa 3 data yang muncul memiliki id_pelanggan yang sama yaitu PL0001.

3. Many to Many
	

  Pengerjaan:
  - db.createCollection("detail_pembelian");
    membuat collection baru bernama detail_pembelian

  - db.detail_pembelian.insertOne({no_pembelian: "PL0001", barang: "iPhone", jumlah: 3});
  - db.detail_pembelian.insertOne({no_pembelian: "PL0001", barang: "iPad", jumlah: 2});
  - db.detail_pembelian.insertOne({no_pembelian: "PL0001", barang: "MacBook", jumlah: 2});
  - db.detail_pembelian.insertOne({no_pembelian: "PL0001", barang: "Apple Watch", jumlah: 2});
    
   - db.detail_pembelian.find().pretty()
   Hasil Akhir:
   Tabel transaksi yang sudah berelasi dengan pelanggan dapat membuat hubungan kembali dengan tabel detail_pembelian sehinigga terjadilah hubungan many to many.

VALIDASI
- validasi adalah metode untuk melakukan pengecekan suatu data yang dimasukkan.