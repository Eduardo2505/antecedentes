<%-- 
    Document   : index
    Created on : 26/04/2014, 11:09:22 AM
    Author     : Eduardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="utf-8">
        <!-- Title and other stuffs -->
        <title>AVE</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="keywords" content="">
        <meta name="author" content="">

        <!-- Stylesheets -->
        <link href="resource/style/bootstrap.css" rel="stylesheet">
        <link rel="resource/stylesheet" href="style/font-awesome.css">
        <link href="resource/style/style.css" rel="stylesheet">
        <link href="resource/style/bootstrap-responsive.css" rel="stylesheet">


        <link rel="shortcut icon" href="resource/img/favicon/favicon.png">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
        <link rel="stylesheet" type="text/css" href="resource/style/jquery-ui-1.8.21.custom.css">
        <script type="text/javascript">
            $(function() {
                $('#fromlogin').submit(function() {
                    var data = $(this).serialize();
                   

                    $.post('Login', data, function(respuesta) {

                       
                        if (respuesta.length == 8) {

                            $(location).attr('href', "jsps/Producto/Avaluos.jsp?i=0&f=30");
                        }
                        else {

                            $('#resultado').html(respuesta);

                        }
                    });
                    return false;
                });
            });

        </script>
    </head>

    <body>

        <!-- Form area -->
        <div class="admin-form">
            <div class="container">

                <div class="row">
                    <div class="col-md-12">
                        <!-- Widget starts -->
                        <div class="widget worange">
                            <!-- Widget head -->
                            <div class="widget-head">
                                <i class="icon-lock"></i> Entrar
                            </div>

                            <div class="widget-content">
                                <div class="padd">
                                    <!-- Login form -->
                                    <form class="form-horizontal" id="fromlogin">
                                        <!-- Email -->
                                        <div class="form-group">
                                            <label class="control-label col-lg-3" for="inputEmail">User</label>
                                            <div class="col-lg-9">
                                                <input type="text" class="form-control" name="email" id="inputEmail" placeholder="Ejemplo@dominio.com" required>
                                            </div>
                                        </div>
                                        <!-- Password -->
                                        <div class="form-group">
                                            <label class="control-label col-lg-3" for="inputPassword">Password</label>
                                            <div class="col-lg-9">
                                                <input type="password" class="form-control" name="pass" id="inputPassword" placeholder="Password" required>
                                            </div>
                                        </div>
                                        
                                            
                                       
                                        <div class="col-lg-9 col-lg-offset-2">
                                            <input type="submit" class="btn btn-danger" value="Enviar" />
                                            
                                        </div>
                                        <br />
                                    </form>

                                </div>
                            </div>

                            <div class="widget-foot">
                                ¿No estas registrado? <a href="#">Registrate</a>
                            </div>
                             <div id="resultado"  style="text-align:center">
                                             </div>
                        </div>  
                    </div>
                </div>
            </div> 
        </div>



        <!-- JS -->
        <script src="resource/js/jquery.js"></script>
        <script src="resource/js/bootstrap.js"></script>
    </body>
</html>