<%@page import="dao.CategoriaDAO"%>
<%@page import="modelo.Categoria"%>
<%@include file="../cabecalho.jsp" %>
<%
    Categoria obj = new Categoria();
    if (request.getMethod().equals("POST")) {
        CategoriaDAO dao = new CategoriaDAO();
        obj.setCodigo(Integer.parseInt(request.getParameter("txtCodigo")));
        obj.setNome(request.getParameter("txtNome"));
        dao.alterar(obj);
        response.sendRedirect("index.jsp");
    } else {
        if (request.getParameter("codigo") == null) {
            response.sendRedirect("index.jsp");
            return;
        }
        CategoriaDAO dao = new CategoriaDAO();
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
            Categoria
        </div>
        <div class="panel-body">
            <form action="#" method="post">

                <div class="col-lg-6">
                    <div class="form-group">
                        <label>C�digo</label>
                        <input class="form-control" type="text" name="txtCodigo" readonly value="<%=obj.getCodigo()%>"/>
                    </div>

                    <div class="form-group">
                        <label>Nome</label>
                        <input class="form-control" type="text" name="txtNome" required value="<%=obj.getNome()%>"/>
                    </div>

                    <button class="btn btn-primary btn-sm" type="submit">Salvar</button>
            </form>
        </div>
    </div>
</div>
<!-- /.row -->
<%@include file="../rodape.jsp" %>