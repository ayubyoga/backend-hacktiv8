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
Membuat database
	use DATABASE_NAME
Untuk melihat database
	show dbs

Membuat Collection
	db.createCollection("NAME_COLLECTON")

Menambahkan data
	db.collection.insertOne()	->	untuk menambahkan document tunggal/single
	db.collection.insertMany()	->	untuk menambahkan banyak document

Read
	db.collection.find()

Update
	db.collection.updateOne(filter, update)	->	ubah satu document
	db.collection.updateMany(filter, update)	->	ubah banyak document sekaligus sesuai filter
	db.collection.replaceOne(filter, update)	->	ganti satu document dengan document yang baru

Delete
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
