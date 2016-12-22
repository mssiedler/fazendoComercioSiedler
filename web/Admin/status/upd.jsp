<%@page import="dao.StatusDAO"%>
<%@page import="modelo.Status"%>
<%@include file="../cabecalho.jsp" %>
<%
    Status obj = new Status();
    if (request.getMethod().equals("POST")) {
        StatusDAO dao = new StatusDAO();
        obj.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));
        obj.setDescricao(request.getParameter("txtDescricao"));
        dao.alterar(obj);
    } else {
        if (request.getParameter("codigo") == null) {
            response.sendRedirect("index.jsp");
            return;
        }
        StatusDAO dao = new StatusDAO();
        obj = dao.buscarPorChavePrimaria(Integer.parseInt(request.getParameter("codigo")));

        if (obj == null) {
            response.sendRedirect("index.jsp");
            return;
        }
    }
%>
<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Sistema de Com�rcio Eletr�nico
            <small>Admin</small>
        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">�rea Administrativa</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i> Aqui vai o conte�do de apresenta��o
            </li>
        </ol>
    </div>
</div>
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">
        <div class="panel-heading">
            Status
        </div>
        <div class="panel-body">
            <form action="#" method="post">

                <div class="col-lg-6">
                    <div class="form-group">
                        <label>C�digo</label>
                        <input class="form-control" type="text" name="txtCodigo" readonly value="<%=obj.getCodigo()%>" />
                    </div>

                    <div class="form-group">
                        <label>Descri��o</label>
                        <input class="form-control" type="text" name="txtDescricao" required value="<%=obj.getDescricao()%>"/>
                    </div>

                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>
            </form>
        </div>
    </div>
</div>
<!-- /.row -->
<%@include file="../rodape.jsp" %>