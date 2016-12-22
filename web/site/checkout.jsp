<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@page import="modelo.ItemCarrinho"%>
<%@page import="modelo.Carrinho"%>
<%
    
    Carrinho carrinho;
    if(session.getAttribute("carrinho")!=null)
    {
         carrinho = (Carrinho)session.getAttribute("carrinho");
    }
    else
    {
        carrinho = new Carrinho();
    }
    //se o envio for por post adiciona o produto ao carrinho
    if(request.getMethod().equals("POST"))
    {
        Integer codigo = Integer.parseInt(request.getParameter("txtCodigo"));
        Integer qtd = Integer.parseInt(request.getParameter("txtQuantidade"));
        //verificar se já existe o carrinho
        
            //criei meu item 
            ItemCarrinho item = new ItemCarrinho();
            item.setQuantidade(qtd);
            ProdutoDAO pdao = new ProdutoDAO();
            Produto produto = pdao.buscarPorChavePrimaria(codigo);
            item.setProduto(produto);
            //adiciono ao carrinho
            
            //VERIFICAR SE A LISTA JÁ EXISTE
            if(carrinho.getItens()==null)
            {
                List<ItemCarrinho> itens = new ArrayList<ItemCarrinho>();
                itens.add(item);
                carrinho.setItens(itens);
                
                carrinho.setTotal(qtd*produto.getPreco().doubleValue());
                
            }
            else
            {
                carrinho.getItens().add(item);
                
                Double total = carrinho.getTotal() + (qtd*produto.getPreco().doubleValue());
                carrinho.setTotal(total);
            }
            //SALVA O MEU CARRINHO
            session.setAttribute("carrinho", carrinho);
            
        
    }

%>
<%@include file="cabecalho.jsp"%>


<!-- checkout -->
<div class="content">
<div class="cart-items">
	<div class="container">
			 <h2>My Shopping Bag (3)</h2>
			<%
                        if(carrinho.getItens()!=null){
                            for (ItemCarrinho item : carrinho.getItens()) {
                                    
                            
                           
                        %>	
			 <div class="cart-header">
				 <div class="close1"> </div>
				 <div class="cart-sec simpleCart_shelfItem">
						<div class="cart-item cyc">
							 <img src="images/c1.jpeg" class="img-responsive" alt="">
						</div>
					   <div class="cart-item-info">
						<h3><a href="#"> Lorem Ipsum is not simply </a><span>Pickup time:</span></h3>
						<ul class="qty">
							<li><p>Min. order value:</p></li>
							<li><p>FREE delivery</p></li>
						</ul>
							 <div class="delivery">
							 <p>Service Charges : $10.00</p>
							 <span>Delivered in 1-1:30 hours</span>
							 <div class="clearfix"></div>
				        </div>	
					   </div>
					   <div class="clearfix"></div>
											
				  </div>
			 </div>
                         <%
                          }
                        }
                         %>
			 		
		 </div>
		 </div>
<!-- checkout -->	
<div class="subscribe">
	 <div class="container">
	 <div class="subscribe1">
		 <h4>the latest from swim wear</h4>
		 </div>
		 <div class="subscribe2">
		 <form>
			 <input type="text" class="text" value="Email" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Email';}">
			 <input type="submit" value="JOIN">
		 </form>
	 </div>
	 <div class="clearfix"></div>
	 </div>
</div>
</div>



<%@include file="rodape.jsp"%>
