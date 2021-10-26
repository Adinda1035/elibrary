<?php
require_once('koneksi.php');
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    //input 
    $id_pinjam = $_POST['id_pinjam'];
    //proses
    $proses = "DELETE FROM data_peminjaman where id_pinjam = '$id_pinjam'";
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
}?>