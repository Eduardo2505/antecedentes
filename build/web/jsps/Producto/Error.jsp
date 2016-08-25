
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="es">
    <%@include file="../plantilla/header.jsp" %>
    <body>
        <%@include file="../plantilla/headerbody.jsp" %>
        <div class="content">
            <%@include file="../plantilla/menu.jsp" %>

            <%
                String op=request.getParameter("op");
                %>
            <div class="mainbar">
                <div class="page-head">
                    <h2 class="pull-left"><i class="icon-home"></i> Usuario: <%=datos%></h2>
                    <div class="bread-crumb pull-right">
                        <a href="updateEmpleado.php"><i class="icon-home"></i>Actualizar datos</a> 
                        <span class="divider">/</span> 
                        <a href="updatePassword" class="bread-current">Cambiar contraseña</a>
                    </div>
                    <div class="clearfix"></div>
                </div>

                <div class="matter">
                    <div class="container">


                        <div class="row" >

                            <div class="col-md-7" id="venPrincipal">

                                <div class="widget">
                                    <div class="widget-head">
                                        <div class="pull-left">Nuevo Avalúo</div>
                                        <div class="widget-icons pull-right">
                                            <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                                            <a href="#" class="wclose"><i class="icon-remove"></i></a>
                                        </div>  
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="widget-content">
                                        <div class="padd">

                                            <div class="form quick-post">

                                                <!-- Edit profile form (not working)-->
                                                <div id="FromProducto">
                                                    <% if(op.equals("1")){                                                       
                                                       %>
                                                    <h1>Formato Incorrecto</h1>
                                                    Sólo se aceptan formato pdf<br>
                                                   <%
                                                     }else{%>
                                                     <h1>Ya se encuentra el avalúo capturado</h1>                                                     
                                                     <%}
                                                     %>
                                                    <div style="text-align: center">
                                                    <a href="idAvaluo.jsp" class="btn btn-danger">ACEPTAR</a>
                                                    </div>
                                               
                                                </div>



                                            </div>

                                        </div>
                                    </div>


                                </div>
                                <div class="widget-foot">
                                    <!-- Footer goes here -->
                                </div>
                            </div>
                        </div> 
                    </div>            
                </div>  


            </div>
        </div>

        <!-- Matter ends -->

    </div>

    <!-- Mainbar ends -->
    <div class="clearfix"></div>

</div>

<%@include file="../plantilla/footer.jsp" %>



</body>
</html>