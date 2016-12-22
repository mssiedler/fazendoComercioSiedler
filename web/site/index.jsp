<%@page import="modelo.Produto"%>
<%@page import="dao.ProdutoDAO"%>
<%@include file="cabecalho.jsp"%>
<%
ProdutoDAO pDAO = new ProdutoDAO();
List<Produto> pdestaqueLista, pgaleriaLista;

pdestaqueLista = pDAO.destaquesHome(); 
pgaleriaLista = pDAO.galeriaHome();

%>
<div class="banner-section">
			<div class="container">
				<div class="banner-grids">
					<div class="col-md-6 banner-grid">
						<h2>IFSUL CIVIL WAR - EM BREVE </h2>
						<p>Enquanto não chega o jogo mais esperado do ano, sucesso na Gincana 2016, confira nossas ofertas.</p>
						<a href="produtos.jsp" class="button"> confira </a>
					</div>
				<div class="col-md-6 banner-grid1">
                                    <img src="images/gamedoano.jpg" class="img-responsive" alt=""/>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		</div>
		<div class="banner-bottom">
		<div class="gallery-cursual">
		<!--requried-jsfiles-for owl-->
		<script src="js/owl.carousel.js"></script>
			<script>
				$(document).ready(function() {
					$("#owl-demo").owlCarousel({
						items : 3,
						lazyLoad : true,
						autoPlay : true,
						pagination : false,
					});
				});
			</script>
		<!--requried-jsfiles-for owl -->
		<!--start content-slider-->
		<div id="owl-demo" class="owl-carousel text-center">
			<%
                        for(Produto prod:pgaleriaLista)
                        {
                        %>
                        <div class="item">
				<img class="lazyOwl" data-src="../fotos/<%=prod.getImagem1()%>" alt="">
				<div class="item-info">
					<h5><%=prod.getTitulo()%></h5>
				</div>
			</div>
                        <%
                        }
                        %>
			
		</div>
		<!--sreen-gallery-cursual-->
		</div>
		</div>
		<div class="gallery">
			<div class="container">
			<h3>Produtos em Destaque</h3>
			<div class="gallery-grids">
                                
                                <%
                                for(Produto prod:pdestaqueLista)
                                {
                                %>
                                <!--Detalhe do produto -->
                                
				<div class="col-md-3 gallery-grid ">
					<a href="detalhe.jsp?codigo=<%=prod.getCodigo()%>"><img src="../fotos/<%=prod.getImagem1()%>" class="img-responsive" alt=""/>
					<div class="gallery-info">
					<div class="quick">
					<p><span class="glyphicon glyphicon-eye-open" aria-hidden="true"></span> view</p>
					</div>
					</div></a>
					<div class="galy-info">
						<p><%=prod.getTitulo()%></p>
						<div class="galry">
						<div class="prices">
						<h5 class="item_price">R$ <%=prod.getPreco()%></h5>
						</div>
					<div class="rating">
									<span>?</span>
									<span>?</span>
									<span>?</span>
									<span>?</span>
									<span>?</span>
								</div>
						
					<div class="clearfix"></div>
					</div>
					</div>
				</div>
				<!-- Fim detalhe do produto-->
                                <%
                                }
                                %>
				
				
				<div class="clearfix"></div>
			</div>
		</div>
		</div>
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


<%@include file="rodape.jsp"%>

