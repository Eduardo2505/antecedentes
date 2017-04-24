
<%@page import="mapping.Grpave"%>
<%@page import="com.dao.impl.GrpaveDaoImpl"%>
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
                String id = request.getParameter("id");
                GrpaveDaoImpl dao = new GrpaveDaoImpl();
                Grpave ap = new Grpave();
                ap = dao.Buscar(id);

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
                                        <div class="pull-left">Editar Avalúo PASO 1</div>
                                        <div class="widget-icons pull-right">
                                            <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                                            <a href="#" class="wclose"><i class="icon-remove"></i></a>
                                        </div>  
                                        <div class="clearfix"></div>
                                    </div>
                                    <div class="widget-content">
                                        <div class="padd">

                                            <div class="form quick-post">
                                                <script type="text/javascript">
                                                    function isNumberKey(evt)
                                                    {
                                                        var charCode = (evt.which) ? evt.which : event.keyCode
                                                        if (charCode > 31 && (charCode < 48 || charCode > 57))
                                                            return false;

                                                        return true;
                                                    }


                                                </script>
                                                <!-- Edit profile form (not working)-->
                                                <div id="FromProducto">
                                                    <form class="form-horizontal" action="../../Agregar" >
                                                        <input type="hidden" name="id" value="<%=id%>">
                                                        <input type="hidden" name="pdf" value="<%=ap.getArchivo().replaceAll("../User/AvaluosCapturados/", "")%>">
                                                        <!-- Title -->
                                                        <div id="datos" >

                                                            <div class="form-group">
                                                                <label class="control-label col-lg-1" for="title">Calle</label>
                                                                <div class="col-lg-6"> 
                                                                    <textarea name="calle"  class="form-control" required=""><%=ap.getCalle()%></textarea>

                                                                </div>

                                                            </div>   
                                                            <!-- Content -->
                                                            <div class="form-group">
                                                                <label class="control-label col-lg-3" for="content">Colonia</label>
                                                                <div class="col-lg-6">
                                                                    <input type="text" name="colonia" value="<%=ap.getColonia()%>" class="form-control" placeholder="Colonia" required>

                                                                </div>
                                                                <div class="col-lg-3">
                                                                    <input type="text" maxlength="5" value="<%=ap.getCp()%>" onkeypress="return isNumberKey(event)" name="CP" class="form-control" placeholder="CP" required>
                                                                </div>
                                                            </div> 
                                                            <div class="form-group">
                                                                <label class="control-label col-lg-3" for="content">Delegación</label>
                                                                <div class="col-lg-6">
                                                                    <input type="text" name="delegacion" value="<%=ap.getDelegacion()%>" class="form-control" placeholder="Delegación" required>
                                                                </div>
                                                            </div> 
                                                            <div class="form-group">
                                                                <label class="control-label col-lg-3" for="content">Entidad</label>
                                                                <div class="col-lg-6">
                                                                    <input type="text" name="entidad" value="<%=ap.getEntidad()%>" class="form-control" placeholder="Entidad" required>
                                                                </div>
                                                                <div class="col-lg-3">

                                                                    <input type="text" maxlength="4" name="ano" value="<%=ap.getFecha()%>"  onkeypress="return isNumberKey(event)" class="form-control" placeholder="AÑO" required>
                                                                   
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label class="control-label col-lg-3" for="content">TIPO</label>
                                                                <div class="col-lg-6">
                                                                    <select  name="tipo" class="input-prepend" required="">
                                                                        <%
                                                                            String v1="",v2="";
                                                                            if(ap.getTipo().equals("GRUPO-AVE")){
                                                                            v1="selected";
                                                                            }else{
                                                                            v2="selected";
                                                                            }
                                                                            %>
                                                                            <option value="GRUPO-AVE" <%=v1%>>GRUPO-AVE</option>
                                                                        <option value="UNIDADA-AVE" <%=v2%>>UNIDADA-AVE</option>
                                                                        
                                                                    </select>
                                                                    
                                                                </div>
                                                            </div>  

                                                            <div class="form-group">
                                                                <!-- Buttons -->
                                                                <div class="col-lg-offset-2 col-lg-9">
                                                                    <input type="submit" value="Guardar" class="btn btn-danger" > 
                                                                    <a href="Avaluos.jsp?i=1&f=30"class="btn btn-success">Atras</a>

                                                                </div>
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