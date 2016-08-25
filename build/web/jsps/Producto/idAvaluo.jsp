
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html lang="es">
    <%@include file="../plantilla/header.jsp" %>
    <body>
        <%@include file="../plantilla/headerbody.jsp" %>
        <div class="content">
            <%@include file="../plantilla/menu.jsp" %>


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
                                        <div class="pull-left">Nuevo Avalúo PASO 1</div>
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
                                                 
                                                    <form class="form-horizontal" action="../../Upload"  method=post enctype=multipart/form-data>


                                                        <div class="form-group">
                                                            <label class="control-label col-lg-1" for="title"></label>
                                                            <div class="col-lg-6"> 
                                                                <input type=file name="idAvaluos" accept="application/pdf">

                                                            </div>

                                                        </div> 
                                                        <div class="form-group">
                                                            <!-- Buttons -->
                                                            <div class="col-lg-offset-2 col-lg-9">
                                                                <input type="submit" value="Cargar"  class="btn btn-danger" >

                                                            </div>
                                                        </div>
                                                    </form>
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