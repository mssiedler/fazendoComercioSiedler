package org.apache.jsp.site;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Produto;
import dao.ProdutoDAO;
import modelo.Categoria;
import modelo.Marca;
import java.util.List;
import dao.CategoriaDAO;
import dao.MarcaDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/site/cabecalho.jsp");
    _jspx_dependants.add("/site/rodape.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");


CategoriaDAO cDAO = new CategoriaDAO();
List<Categoria> cLista = cDAO.listar();
MarcaDAO mDAO = new MarcaDAO();
List<Marca> mLista = mDAO.listar();


      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("Au<!--\n");
      out.write("Author: W3layouts\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Swim Wear a E-Commerce online Shopping Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/owl.carousel.css\" rel=\"stylesheet\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Swim Wear Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/bootstrap-3.1.1.min.js\"></script>\n");
      out.write("\t<!-- cart -->\n");
      out.write("\t\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("\t<!-- cart -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<!--header-->\n");
      out.write("\t\t<div class=\"header\">\n");
      out.write("\t\t\t<div class=\"header-top\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t <div class=\"lang_list\">\n");
      out.write("\t\t\t\t\t<select tabindex=\"4\" class=\"dropdown1\">\n");
      out.write("\t\t\t\t\t\t<option value=\"\" class=\"label\" value=\"\">Pt</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"1\">English</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"2\">French</option>\n");
      out.write("\t\t\t\t\t\t<option value=\"3\">German</option>\n");
      out.write("\t\t\t\t\t</select>\n");
      out.write("   \t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"top-right\">\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t<li class=\"text\"><a href=\"login.html\">login</a></li>\n");
      out.write("\t\t\t\t\t<li><div class=\"cart box_1\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"checkout.html\">\n");
      out.write("\t\t\t\t\t\t\t\t <span class=\"simpleCart_total\"> $0.00 </span> (<span id=\"simpleCart_quantity\" class=\"simpleCart_quantity\"> 0 </span>)\n");
      out.write("\t\t\t\t\t\t\t</a>\t\n");
      out.write("\t\t\t\t\t\t\t<p><a href=\"javascript:;\" class=\"simpleCart_empty\">Empty cart</a></p>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t\t\t\t</div></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"header-bottom\">\n");
      out.write("\t\t\t\t\t<div class=\"container\">\n");
      out.write("<!--/.content-->\n");
      out.write("<div class=\"content white\">\n");
      out.write("\t<nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\t    <div class=\"navbar-header\">\n");
      out.write("\t        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("\t\t        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t\t        <span class=\"icon-bar\"></span>\n");
      out.write("\t        </button>\n");
      out.write("\t        <h1 class=\"navbar-brand\"><a  href=\"index.html\">Joguinhos Divertidos</a></h1>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-header-->\n");
      out.write("\t\n");
      out.write("\t    <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("\t        <ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t<li><a href=\"index.jsp\">Home</a></li>\n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Console <b class=\"caret\"></b></a>\n");
      out.write("\t\t            <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t            <div class=\"row\">\n");
      out.write("\t\t\t\t            <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t            <ul class=\"multi-column-dropdown\">\n");
      out.write("\t\t\t\t\t\t     ");
 for(Marca obj:mLista)
                                                            {
                                                                
                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t            <li><a class=\"list\" href=\"produtos.jsp?marca=");
      out.print(obj.getCodigo());
      out.write('"');
      out.write('>');
      out.print(obj.getNome());
      out.write("</a></li>\n");
      out.write("                                                            ");

                                                            }
                                                            
      out.write("\n");
      out.write("                                                    </ul>\n");
      out.write("\t\t\t\t            </div>\n");
      out.write("\t\t\t\t            \n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("\t\t        <li class=\"dropdown\">\n");
      out.write("\t\t            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">Categoria <b class=\"caret\"></b></a>\n");
      out.write("\t\t            <ul class=\"dropdown-menu multi-column columns-3\">\n");
      out.write("\t\t\t            <div class=\"row\">\n");
      out.write("\t\t\t\t            <div class=\"col-sm-4\">\n");
      out.write("\t\t\t\t\t           <ul class=\"multi-column-dropdown\">\n");
      out.write("                                                            ");
 for(Categoria obj:cLista)
                                                            {
                                                                
                                                            
      out.write("\n");
      out.write("\t\t\t\t\t\t            <li><a class=\"list\" href=\"produtos.jsp?categoria=");
      out.print(obj.getCodigo());
      out.write('"');
      out.write('>');
      out.print(obj.getNome());
      out.write("</a></li>\n");
      out.write("                                                            ");

                                                            }
                                                            
      out.write("\n");
      out.write("                                                   </ul>\n");
      out.write("\t\t\t\t            </div>\n");
      out.write("\t\t\t\t           \n");
      out.write("\t\t\t            </div>\n");
      out.write("\t\t            </ul>\n");
      out.write("\t\t        </li>\n");
      out.write("\t\t       \n");
      out.write("\t        </ul>\n");
      out.write("\t    </div>\n");
      out.write("\t    <!--/.navbar-collapse-->\n");
      out.write("\t</nav>\n");
      out.write("\t<!--/.navbar-->\n");
      out.write("</div>\n");
      out.write("\t\t\t   <div class=\"search-box\">\n");
      out.write("\t\t\t\t\t<div id=\"sb-search\" class=\"sb-search\">\n");
      out.write("                                            <form action=\"produtos.jsp\" method=\"post\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sb-search-input\" placeholder=\"Digite sua pesquisa\" type=\"search\" name=\"pesquisar\" id=\"pesquisar\">\n");
      out.write("\t\t\t\t\t\t\t<input class=\"sb-search-submit\" type=\"submit\" value=\"\">\n");
      out.write("\t\t\t\t\t\t\t<span class=\"sb-icon-search\"> </span>\n");
      out.write("\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("<!-- search-scripts -->\n");
      out.write("\t\t\t\t\t<script src=\"js/classie.js\"></script>\n");
      out.write("\t\t\t\t\t<script src=\"js/uisearch.js\"></script>\n");
      out.write("\t\t\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\t\tnew UISearch( document.getElementById( 'sb-search' ) );\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("\t\t\t\t\t<!-- //search-scripts -->\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--header-->");
      out.write('\n');

ProdutoDAO pDAO = new ProdutoDAO();
List<Produto> pdestaqueLista, pgaleriaLista;

pdestaqueLista = pDAO.destaquesHome();
pgaleriaLista = pDAO.galeriaHome();


      out.write("\n");
      out.write("<div class=\"banner-section\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"banner-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 banner-grid\">\n");
      out.write("\t\t\t\t\t\t<h2>IFSUL CIVIL WAR - EM BREVE </h2>\n");
      out.write("\t\t\t\t\t\t<p>Enquanto não chega o jogo mais esperado do ano, sucesso na Gincana 2016, confira nossas ofertas.</p>\n");
      out.write("\t\t\t\t\t\t<a href=\"produtos.jsp\" class=\"button\"> confira </a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-6 banner-grid1\">\n");
      out.write("                                    <img src=\"images/gamedoano.jpg\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"banner-bottom\">\n");
      out.write("\t\t<div class=\"gallery-cursual\">\n");
      out.write("\t\t<!--requried-jsfiles-for owl-->\n");
      out.write("\t\t<script src=\"js/owl.carousel.js\"></script>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t$(document).ready(function() {\n");
      out.write("\t\t\t\t\t$(\"#owl-demo\").owlCarousel({\n");
      out.write("\t\t\t\t\t\titems : 3,\n");
      out.write("\t\t\t\t\t\tlazyLoad : true,\n");
      out.write("\t\t\t\t\t\tautoPlay : true,\n");
      out.write("\t\t\t\t\t\tpagination : false,\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\t<!--requried-jsfiles-for owl -->\n");
      out.write("\t\t<!--start content-slider-->\n");
      out.write("\t\t<div id=\"owl-demo\" class=\"owl-carousel text-center\">\n");
      out.write("\t\t\t");

                        for(Produto prod:pgaleriaLista)
                        {
                        
      out.write("\n");
      out.write("                        <div class=\"item\">\n");
      out.write("\t\t\t\t<img class=\"lazyOwl\" data-src=\"../fotos/");
      out.print(prod.getImagem1());
      out.write("\" alt=\"\">\n");
      out.write("\t\t\t\t<div class=\"item-info\">\n");
      out.write("\t\t\t\t\t<h5>");
      out.print(prod.getTitulo());
      out.write("</h5>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("                        ");

                        }
                        
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!--sreen-gallery-cursual-->\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"gallery\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<h3>Produtos em Destaque</h3>\n");
      out.write("\t\t\t<div class=\"gallery-grids\">\n");
      out.write("                                \n");
      out.write("                                ");

                                for(Produto prod:pdestaqueLista)
                                {
                                
      out.write("\n");
      out.write("                                <!--Detalhe do produto -->\n");
      out.write("                                \n");
      out.write("\t\t\t\t<div class=\"col-md-3 gallery-grid \">\n");
      out.write("\t\t\t\t\t<a href=\"detalhe.jsp?codigo=");
      out.print(prod.getCodigo());
      out.write("\"><img src=\"../fotos/");
      out.print(prod.getImagem1());
      out.write("\" class=\"img-responsive\" alt=\"\"/>\n");
      out.write("\t\t\t\t\t<div class=\"gallery-info\">\n");
      out.write("\t\t\t\t\t<div class=\"quick\">\n");
      out.write("\t\t\t\t\t<p><span class=\"glyphicon glyphicon-eye-open\" aria-hidden=\"true\"></span> view</p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t<div class=\"galy-info\">\n");
      out.write("\t\t\t\t\t\t<p>");
      out.print(prod.getTitulo());
      out.write("</p>\n");
      out.write("\t\t\t\t\t\t<div class=\"galry\">\n");
      out.write("\t\t\t\t\t\t<div class=\"prices\">\n");
      out.write("\t\t\t\t\t\t<h5 class=\"item_price\">R$ ");
      out.print(prod.getPreco());
      out.write("</h5>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"rating\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t\t<span>?</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!-- Fim detalhe do produto-->\n");
      out.write("                                ");

                                }
                                
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"subscribe\">\n");
      out.write("\t <div class=\"container\">\n");
      out.write("\t <div class=\"subscribe1\">\n");
      out.write("\t\t <h4>the latest from swim wear</h4>\n");
      out.write("\t\t </div>\n");
      out.write("\t\t <div class=\"subscribe2\">\n");
      out.write("\t\t <form>\n");
      out.write("\t\t\t <input type=\"text\" class=\"text\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\">\n");
      out.write("\t\t\t <input type=\"submit\" value=\"JOIN\">\n");
      out.write("\t\t </form>\n");
      out.write("\t </div>\n");
      out.write("\t <div class=\"clearfix\"></div>\n");
      out.write("\t </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--footer-->\n");
      out.write("\t\t<div class=\"footer-section\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t<div class=\"footer-grids\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>company</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"products.html\">products</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Work Here</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Team</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Happenings</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Dealer Locator</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>service</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Support</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Warranty</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>order & returns</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Order Status</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Shipping Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Return Policy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Digital Gift Card</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-2 footer-grid\">\n");
      out.write("\t\t\t\t\t<h4>legal</h4>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Privacy</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Terms and Conditions</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"#\">Social Responsibility</a></li>\n");
      out.write("\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-4 footer-grid1\">\n");
      out.write("\t\t\t\t\t<div class=\"social-icons\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon1\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon2\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon3\"></i></a>\n");
      out.write("\t\t\t\t\t\t<a href=\"#\"><i class=\"icon4\"></i></a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<p>Copyright &copy; 2015 Swim Wear. All rights reserved | Design by <a href=\"http://w3layouts.com\">W3layouts</a></p>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<!--footer-->\n");
      out.write("\t\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
