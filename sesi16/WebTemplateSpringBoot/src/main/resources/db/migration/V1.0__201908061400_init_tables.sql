 CREATE TABLE IF NOT EXISTS mahasiswa(
    id VARCHAR(40) NOT NULL,
    nim VARCHAR(10) NOT NULL UNIQUE,
    nama VARCHAR(50) NOT NULL,
    ipk FLOAT(4,2) NOT NULL,
    jurusan VARCHAR(25) NOT NULL,
    PRIMARY KEY(id)
	)ENGINE=InnoDB;