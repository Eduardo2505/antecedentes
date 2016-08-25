<%@page import="mapping.Usuario"%>
<div class="sidebar">
    <div class="sidebar-dropdown"><a href="#">Navegador</a></div>
    <ul id="nav">
        <li><a href="Avaluos.jsp?i=0&f=30" class="open"><i class="icon-home"></i>Inicio</a>
        </li>

        <%  
           HttpSession sesionx = request.getSession();
           Usuario emx=new Usuario();
           int accx=0;
           emx=(Usuario)sesionx.getAttribute("Empleado");
           accx=emx.getPermiso();
           if (accx==1) {%>
        <li><a href="idAvaluo.jsp"><i class="icon-tasks"></i>Capturar</a></li>
        <% }%>

    </ul>
</div>