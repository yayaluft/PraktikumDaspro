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