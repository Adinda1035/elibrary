<?php
require_once('koneksi.php');
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    //input 
    $nama = $_POST['nama_peminjam'];
    $jb = $_POST['judul_buku'];
    $tglPinjam = $_POST['tanggal_pinjam'];
    $tglKembali = $_POST['tanggal_kembali'];
    $status = $_POST['status_peminjaman'];
    //proses
    $proses = "INSERT INTO data_peminjaman (nama_peminjam,judul_buku,tanggal_pinjam,tanggal_kembali,status_peminjaman) VALUES ('$nama','$jb','$tglPinjam','$tglKembali','$status')";
    //output
    if (mysqli_query($conn, $proses)) {
        //true
        $response["success"] = 1;
        $response["pesan"] = "berhasil";
        echo json_encode($response);
    } else {
        //false
        $response["success"] = 0;
        $response["pesan"] = "gagal";
        echo json_encode($response);
    }
} else {
    $response["success"] = 0;
    $response["pesan"] = "tidak ada request";
    echo json_encode($response);
}
?>
