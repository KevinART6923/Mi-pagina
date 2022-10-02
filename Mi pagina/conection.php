<?php
    $servidor= "localhost";
    $usuario="root";
    $password="1234";
    $dbname="prueba";

    $conn = new mysql($servidor, $usuario, $password, $dbname);

    if($conn -> connect_error){
        die("Connection Failed: " $conn->connect_error);
    }
    echo "conectado";



?>