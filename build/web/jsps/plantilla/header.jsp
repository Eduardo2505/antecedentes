

<%@page import="mapping.Usuario"%>
<head>
    <%
            HttpSession sesion = request.getSession();
            Usuario em=new Usuario();
            String datos="";int acc=0;
            em=(Usuario)sesion.getAttribute("Empleado");
             if (em == null) {
                 response.sendRedirect("../../index.jsp");
              }else{
                  datos=em.getNombre();
                  
             } 
 %>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="utf-8">
  <title>Administrador</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <meta name="description" content="">
  <meta name="keywords" content="">
  <meta name="author" content="">
  <link href="../../resource/style/bootstrap.css" rel="stylesheet">
  <!-- Font awesome icon -->
  <link rel="stylesheet" href="../../resource/style/font-awesome.css"> 
  <!-- jQuery UI -->
  <link rel="stylesheet" href="../../resource/style/jquery-ui.css"> 
  <!-- Calendar -->
  <link rel="stylesheet" href="../../resource/style/fullcalendar.css">
  <!-- prettyPhoto -->
  <link rel="stylesheet" href="../../resource/style/prettyPhoto.css">  
  <!-- Star rating -->
  <link rel="stylesheet" href="../../resource/style/rateit.css">
  <!-- Date picker -->
  <link rel="stylesheet" href="../../resource/style/bootstrap-datetimepicker.min.css">
  <!-- CLEditor -->
  <link rel="stylesheet" href="../../resource/style/jquery.cleditor.css"> 
  <!-- Uniform -->
  <link rel="stylesheet" href="../../resource/style/uniform.default.css"> 
  <!-- Bootstrap toggle -->
  <link rel="stylesheet" href="../../resource/style/bootstrap-switch.css">
  <!-- Main stylesheet -->
  <link href="../../resource/style/style.css" rel="stylesheet">
  <!-- Widgets stylesheet -->
  <link href="../../resource/style/widgets.css" rel="stylesheet">   
  <link rel="shortcut icon" href="../../resource/img/favicon/favicon.png">
  <link rel="stylesheet" type="text/css" href="../../resource/style/jquery-ui-1.8.21.custom.css">
  <script src="../../resource/js/jquery-1.7.2.min.js"></script>
  
</head>