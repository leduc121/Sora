package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <script src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("         <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <style>\r\n");
      out.write("            .gallery-wrap .img-big-wrap img {\r\n");
      out.write("                height: 450px;\r\n");
      out.write("                width: auto;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                cursor: zoom-in;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            .gallery-wrap .img-small-wrap .item-gallery {\r\n");
      out.write("                width: 60px;\r\n");
      out.write("                height: 60px;\r\n");
      out.write("                border: 1px solid #ddd;\r\n");
      out.write("                margin: 7px 2px;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            .gallery-wrap .img-small-wrap {\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .gallery-wrap .img-small-wrap img {\r\n");
      out.write("                max-width: 100%;\r\n");
      out.write("                max-height: 100%;\r\n");
      out.write("                object-fit: cover;\r\n");
      out.write("                border-radius: 4px;\r\n");
      out.write("                cursor: zoom-in;\r\n");
      out.write("            }\r\n");
      out.write("            .img-big-wrap img{\r\n");
      out.write("                width: 100% !important;\r\n");
      out.write("                height: auto !important;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Menu.jsp", out, false);
      out.write("\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-3\">\r\n");
      out.write("                        <div class=\"card bg-light mb-3\">\r\n");
      out.write("                            <div class=\"card-header bg-primary text-white text-uppercase\"><i class=\"fa fa-list\"></i> Categories</div>\r\n");
      out.write("                            <ul class=\"list-group category_block\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"card bg-light mb-3\">\r\n");
      out.write("                        <div class=\"card-header bg-success text-white text-uppercase\">Last product</div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <img class=\"img-fluid\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("                            <h5 class=\"card-title\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                            <p class=\"card-text\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                            <p class=\"bloc_left_price\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${last.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" $</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-9\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"card\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <aside class=\"col-sm-5 border-right\">\r\n");
      out.write("                                    <article class=\"gallery-wrap\"> \r\n");
      out.write("                                        <div class=\"img-big-wrap\">\r\n");
      out.write("                                            <div> <a href=\"#\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.image_url}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"></a></div>\r\n");
      out.write("                                        </div> <!-- slider-product.// -->\r\n");
      out.write("                                        <div class=\"img-small-wrap\">\r\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\r\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\r\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\r\n");
      out.write("                                            <div class=\"item-gallery\"> <img src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQCepDDx2BVt6xaS4HE-_i43nybyVabVS6B3d8M33F9BF_YY_jC1xaIZsNuR_o&usqp=CAc\"> </div>\r\n");
      out.write("                                        </div> <!-- slider-nav.// -->\r\n");
      out.write("                                    </article> <!-- gallery-wrap .end// -->\r\n");
      out.write("                                </aside>\r\n");
      out.write("                                <aside class=\"col-sm-7\">\r\n");
      out.write("                                    <article class=\"card-body p-5\">\r\n");
      out.write("                                        <h3 class=\"title mb-3\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\r\n");
      out.write("                                        <p class=\"price-detail-wrap\"> \r\n");
      out.write("                                            <span class=\"price h3 text-warning\"> \r\n");
      out.write("                                                <span class=\"currency\">US $</span><span class=\"num\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("                                            </span> \r\n");
      out.write("                                            <!--<span>/per kg</span>--> \r\n");
      out.write("                                        </p> <!-- price-detail-wrap .// -->\r\n");
      out.write("                                        <dl class=\"item-property\">\r\n");
      out.write("                                            <dt>Description</dt>\r\n");
      out.write("                                            <dd><p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </p></dd>\r\n");
      out.write("                                        </dl>\r\n");
      out.write("<!--                                        <dl class=\"param param-feature\">\r\n");
      out.write("                                            <dt>Model#</dt>\r\n");
      out.write("                                            <dd>12345611</dd>\r\n");
      out.write("                                        </dl>   item-property-hor .// \r\n");
      out.write("                                        <dl class=\"param param-feature\">\r\n");
      out.write("                                            <dt>Color</dt>\r\n");
      out.write("                                            <dd>Black and white</dd>\r\n");
      out.write("                                        </dl>   item-property-hor .// \r\n");
      out.write("                                        <dl class=\"param param-feature\">\r\n");
      out.write("                                            <dt>Delivery</dt>\r\n");
      out.write("                                            <dd>Russia, USA, and Europe</dd>\r\n");
      out.write("                                        </dl>   item-property-hor .// -->\r\n");
      out.write("\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-sm-5\">\r\n");
      out.write("                                                <dl class=\"param param-inline\">\r\n");
      out.write("                                                    <dt>Quantity: </dt>\r\n");
      out.write("                                                    <dd>\r\n");
      out.write("                                                        <select class=\"form-control form-control-sm\" style=\"width:70px;\">\r\n");
      out.write("                                                            <option> 1 </option>\r\n");
      out.write("                                                            <option> 2 </option>\r\n");
      out.write("                                                            <option> 3 </option>\r\n");
      out.write("                                                        </select>\r\n");
      out.write("                                                    </dd>\r\n");
      out.write("                                                </dl>  <!-- item-property .// -->\r\n");
      out.write("                                            </div> <!-- col.// -->\r\n");
      out.write("                                            \r\n");
      out.write("                                        </div> <!-- row.// -->\r\n");
      out.write("                                        <hr>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-primary text-uppercase\"> Buy now </a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-lg btn-outline-primary text-uppercase\"> <i class=\"fas fa-shopping-cart\"></i> Add to cart </a>\r\n");
      out.write("                                    </article> <!-- card-body.// -->\r\n");
      out.write("                                </aside> <!-- col.// -->\r\n");
      out.write("                            </div> <!-- row.// -->\r\n");
      out.write("                        </div> <!-- card.// -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("        <footer class=\"text-light\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3 col-lg-4 col-xl-3\">\r\n");
      out.write("                        <h5>About</h5>\r\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\r\n");
      out.write("                        <p class=\"mb-0\">\r\n");
      out.write("                            Le Lorem Ipsum est simplement du faux texte employé dans la composition et la mise en page avant impression.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-2 col-lg-2 col-xl-2 mx-auto\">\r\n");
      out.write("                        <h5>Informations</h5>\r\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto\">\r\n");
      out.write("                        <h5>Others links</h5>\r\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><a href=\"\">Link 1</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 2</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 3</a></li>\r\n");
      out.write("                            <li><a href=\"\">Link 4</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4 col-lg-3 col-xl-3\">\r\n");
      out.write("                        <h5>Contact</h5>\r\n");
      out.write("                        <hr class=\"bg-white mb-2 mt-0 d-inline-block mx-auto w-25\">\r\n");
      out.write("                        <ul class=\"list-unstyled\">\r\n");
      out.write("                            <li><i class=\"fa fa-home mr-2\"></i> My company</li>\r\n");
      out.write("                            <li><i class=\"fa fa-envelope mr-2\"></i> email@example.com</li>\r\n");
      out.write("                            <li><i class=\"fa fa-phone mr-2\"></i> + 33 12 14 15 16</li>\r\n");
      out.write("                            <li><i class=\"fa fa-print mr-2\"></i> + 33 12 14 15 16</li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-12 copyright mt-3\">\r\n");
      out.write("                        <p class=\"float-left\">\r\n");
      out.write("                            <a href=\"#\">Back to top</a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                        <p class=\"text-right text-muted\">created with <i class=\"fa fa-heart\"></i> by <a href=\"https://t-php.fr/43-theme-ecommerce-bootstrap-4.html\"><i>t-php</i></a> | <span>v. 1.0</span></p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${ALLCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <li class=\"list-group-item text-white\"><a href=\"#\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
