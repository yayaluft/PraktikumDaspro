1. Mengapa pengecekan pada struktur IF tersebut tidak melibatkan kondisi dengan operator relasional?
Karena dalam struktur IF tersebut menggunakan tipe data boolean yang telah memiliki nilai yaitu true atau false, sehingga tidak memerlukan operator relasional.
2. Saat program dijalankan, kemudian Anda mengisikan nilai false, bagaimana hasilnya?
Nilai false tersebut tidak mengeluarkan output.
3. Sistem perlu memberikan informasi apabila pengguna memasukkan nilai false, maka terdapat keluaran “Registrasi ditolak. Silakan lunasi UKT terlebih dahulu”. Modifikasi program tersebut dengan menambahkan struktur ELSE!
Berada di commit file modifikasi percobaan 1.

Percobaan 2
1. Apa fungsi dari sintaks break? 
Sintaks break memiliki peranan untuk menghentikan secara paksa program agar tidak menyelesaikan case selanjutnya, dan progam hanya akan menyelesaikan case yang diminta user.
2. Apa peran dari sintaks default pada struktur pemilihan SWITCH-CASE? 
Sintaks default memiliki peranan sebagai opsi terakhir yang dieksekusi apabila nilai case sebelumnya tidak ada yang sesuai.

Percobaan 3
1. Apa yang terjadi jika mahasiswa menjawab "No" pada pertanyaan bebas kompen? Mengapa demikian? 
Output yang dihasilkan adalah "Gagal! Mahasiswa masih memiliki jumlah tanggungan kompen". Karena program menyimpan jawaban user dari atas terlebih dahulu, jawaban "No" bernilai false sehingga program langsung mengeksekusi else terluar dan mengabaikan operasi jumlah bimbingan.
2. Jelaskan maksud dari potongan kode berikut! if (bimbinganP1 >= 8 && bimbinganP2 >= 4 ) {
Potongan kode diatas menggunakan oeprator logika AND(&&) yang berperan untuk membaca dua kondisi sekaligus yaitu bimbinganP1 dan bimbinganP2.
3. Bagaimana alur pemeriksaan syarat mahasiswa dari awal sampai akhir? Jelaskan secara runtut untuk semua kondisi! 
- Program akan membaca jawaban mengenai "Apakah mahasiswa sudah bebas dari kompen" dari user. Jika jawaban true, program akan melanjutkan ke pengecekan jumlah bimbingan. Jika jawaban false, program akan langsung mengeluarkan pesan berupa "Gagal! Mahasiswa masih memiliki tanggungan kompen".
- Pada sintaks if pertama, program akan menjalankan pengecekan. Jika bimbingan P1 mencapai 8 kali dan bimbingan P2 mencapai 4 kali, program akan mengeluarkan pesan "Semua syarat terpenuhi. Mahasiswa bleh mendaftar ujian skripsi". Jika tidak mencapai salah satu atau kedua syarat tersebut, porgram akan melanjutkan ke else if berikutnya.
- Selanjutnya program akan memeriksa jumlah bimbingan P1 jika belum mencapai 8 kali dan bimbingan P2 telah mencukupi, maka program akan mengeluarkan pesan "Gagal! log bimbingan P1 belum mencapai 8 kali". 
- Program akan memeriksa jumlah bimbingan P1 telah mencukupi, namun bimbingan P2 kurang dari jumlah capaian akan mengeluarkan pesan  "Gagal! log bimbingan P2 belum mencapai 4 kali". 