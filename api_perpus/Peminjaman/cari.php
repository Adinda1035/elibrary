<?php
require_once('koneksi.php');
if ($_SERVER['REQUEST_METHOD'] == 'GET') {
    //proses
    $id_pinjam = $_GET['id_pinjam'];
    $proses = mysqli_query($conn, "SELECT * FROM data_peminjaman where id_pinjam = '$id_pinjam'");
    if (mysqli_num_rows($proses) > 0) {
        //jika ada data
        $response["success"] = 1;
        $row = mysqli_fetch_array($proses);
        $hasil = array();
        $hasil['id_pinjam'] = $row['id_pinjam'];
        $hasil['nama_peminjam'] = $row['nama_peminjam'];
        $hasil['tanggal_pinjam'] = $row['tanggal_pinjam'];
        $hasil['tanggal_kembali'] = $row['tanggal_pinjam'];
        $hasil['status_peminjaman'] = $row['status_peminjaman'];
        $response['data'] = $hasil;
        echo json_encode($response);
    } else {
        //tidak ada data
        $response["success"] = 0;
        $response["pesan"] = "tidak ada data";
        echo json_encode($response);
    }
} else {
    $response["success"] = 0;
    $response["pesan"] = "tidak ada request";
    echo json_encode($response);
}