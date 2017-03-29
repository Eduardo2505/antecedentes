<%-- 
    Document   : Avaluos
    Created on : 6/07/2014, 12:46:46 PM
    Author     : Eduardo
--%>


<%@page import="mapping.GrpaveBean"%>
<%@page import="mapping.Grpave"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.impl.GrpaveDaoImpl"%>
<!DOCTYPE html>
<html>
    <%


        int inicio = Integer.parseInt(request.getParameter("i"));
        int fin = Integer.parseInt(request.getParameter("f"));
        int auxinicio = inicio - 30;
        int auxinicio2 = 0;
        if (auxinicio < 0) {
            auxinicio = auxinicio2;

        }
        int auxfin = fin + 30;
        GrpaveDaoImpl dao = new GrpaveDaoImpl();


    %>
    <%@include file="../plantilla/header.jsp" %>


    <body>

        <%@include file="../plantilla/headerbody.jsp" %>
        <div class="content">
            <%@include file="../plantilla/menu.jsp" %>


            <div class="mainbar">
                <div class="page-head">
                    <h2 class="pull-left"><i class="icon-table"></i> Avaluos Totales: <%=dao.gecontar()%></h2>
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

                            <div class="col-md-12" id="venPrincipal">


                                <div class="widget">

                                    <div class="widget-head">
                                        <div class="pull-left">Categoría </div>
                                        <div class="widget-icons pull-right">
                                            <a href="#" class="wminimize"><i class="icon-chevron-up"></i></a> 
                                            <a href="#" class="wclose"><i class="icon-remove"></i></a>
                                        </div>  
                                        <div class="clearfix"></div>
                                    </div>

                                    <div class="widget-content">

                                        <table class="table table-striped table-bordered table-hover" >
                                            <thead>
                                                <tr>
                                                    <th>id
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="id">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Direcccion
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="calle">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Delegación
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="delegacion">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Entidad
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="entidad">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Año
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="fecha">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Tipo
                                            <form action="Buscar.jsp">
                                                <input type="hidden" name="i" value="0">
                                                <input type="hidden" name="f" value="30">
                                                <input type="hidden" name="columna" value="tipo">
                                                <input type="text" name="valor" class="input-prepend">
                                                <input type="submit"  value="Buscar">
                                            </form>
                                            </th>
                                            <th>Registro</th>
                                            <th>PDF</th>
                                            <th>Opciones</th>



                                            </tr>
                                            </thead>
                                            <tbody style='text-align:center'>
                                                <%
                                                    // GrpaveDaoImpl dao = new GrpaveDaoImpl();
                                                    List res = dao.getMostrar(inicio, fin);
                                                    Iterator itr = res.iterator();
                                                    while (itr.hasNext()) {
                                                        GrpaveBean c = (GrpaveBean) itr.next();
                                                %>
                                                <tr>
                                                    <th><%=c.getIdGrpAve()%></th>
                                                    <th><%=c.getCalle() + " , Col. " + c.getColonia() + ", C.P " + c.getCp()%></th>
                                                    <th><%=c.getDelegacion()%></th>
                                                    <th><%=c.getEntidad()%></th>
                                                    <th><%=c.getFecha()%></th>
                                                    <th><%=c.getTipo()%></th>
                                                    <th><%=c.getRegistro()%></th>
                                                    
                                                    <th><a href="<%=c.getUrlDropbox()%>" target="_blank">PDF </a>
                                                   
                                                    <th>
                                                        <a href="../../Eliminar?id=<%=c.getIdGrpAve()%>">Eliminar </a>
                                                        <a href="Editar.jsp?id=<%=c.getIdGrpAve()%>">Editar</a>
                                                    </th>

                                                    
                                                </tr>
                                                <%


                                                    }


                                                %>

                                            </tbody>
                                        </table>

                                        <div class="widget-foot">


                                            <ul class="pagination pull-right">
                                                <li><a href="Avaluos.jsp?i=<%=auxinicio%>&f=<%=inicio%>">Atras</a></li>

                                                <li><a href="Avaluos.jsp?i=<%=fin%>&f=<%=auxfin%>">Siguiente</a></li>
                                            </ul>

                                            <div class="clearfix"></div> 

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
