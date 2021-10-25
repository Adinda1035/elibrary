<?php
require_once('koneksi.php');
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    //input 
    $id_pinjam = $_POST['id_pinjam'];
    $nama = $_POST['nama_peminjam'];
    $jb = $_POST['judul_buku'];
    $tglPinjam = $_POST['tanggal_pinjam'];
    $tglKembali = $_POST['tanggal_kembali'];
    $status = $_POST['status_peminjaman'];
    
    //proses
    $proses = "UPDATE data_peminjaman SET nama_peminjam = '$nama', judul_buku = '$jb', tanggal_pinjam ='$tglPinjam', tanggal_kembali='$tglKembali', status_peminjaman='$status' where id_pinjam = '$id_pinjam' ";
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