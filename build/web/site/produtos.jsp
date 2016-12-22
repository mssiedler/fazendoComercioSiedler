<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@include file="cabecalho.jsp"%>
<%    ProdutoDAO pDAO = new ProdutoDAO();
    List<Produto> lista;
    if(request.getParameter("marca")!=null)
    {
        lista = pDAO.listar(Integer.parseInt(request.getParameter("marca")),"M");
    }
    else
    {
        if(request.getParameter("categoria")!=null)
        {
            lista = pDAO.listar(Integer.parseInt(request.getParameter("categoria")),"C");
        }
        else
        {
            lista = pDAO.listar();
            
            
        }
    }
    
%>


<div class="content">
    <div class="product-model">	 
        <div class="container">
            <h2>Nossos Podutos</h2>			
            <div class="col-md-9 product-model-sec">
                <%
                for(Produto prod:lista)
                {
                %>
                <!--inicio do produto -->
                <a href="detalhe.jsp?codigo=<%=prod.getCodigo()%>">
                <div class="product-grid">
                        <div class="more-product"><span> </span></div>						
                        <div class="product-img b-link-stripe b-animate-go  thickbox">
                            <img src="../fotos/<%=prod.getImagem1()%>" class="img-responsive" alt="" >
                            <div class="b-wrapper">
                                <h4 class="b-animate b-from-left  b-delay03">							
                                    <button> + </button>
                                </h4>
                            </div>
                        </div>
                </a>					
                <div class="product-info simpleCart_shelfItem">
                    <div class="product-info-cust prt_name">
                        <h4><%=prod.getTitulo()%></h4>								
                        <span class="item_price">R$ <%=prod.getPreco()%></span>
                        
                        <input type="text" class="item_quantity" value="1" />
                        <input type="button" class="item_add items" value="+">
                        <div class="clearfix"> </div>
                    </div>												
                </div>
            </div>
           
<!--fim do produto -->
<%
                }
%>
</div>	
				 
</div>
</div>
</div>




<%@include file="rodape.jsp"%>
