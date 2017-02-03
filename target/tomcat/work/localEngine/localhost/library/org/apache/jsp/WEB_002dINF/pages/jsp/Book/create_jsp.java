package org.apache.jsp.WEB_002dINF.pages.jsp.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class create_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div data-ng-controller=\"bookAppController\">\n");
      out.write("\t<div class=\"panel panel-default\">\n");
      out.write("\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t<ol class=\"breadcrumb\">\n");
      out.write("\t\t\t\t<li><a href=\"");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\">Home</a></li>\n");
      out.write("\t\t\t\t<li class=\"active\">Book List</li>\n");
      out.write("\t\t\t</ol>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t<form class=\"form-horizontal\" role=\"form\" name=\"myForm\">\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"book_name\" class=\"col-lg-1 control-label\">Name</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" data-ng-model=book.name\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Name\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"book_author\" class=\"col-lg-1 control-label\">Author</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" data-ng-model=book.author\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Author\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"book_editor\" class=\"col-lg-1 control-label\">Editorial</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" data-ng-model=book.editorial\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Editorial\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"book_lng\" class=\"col-lg-1 control-label\">Language</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" data-ng-model=book.language\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Language\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t<label for=\"book_year\" class=\"col-lg-1 control-label\">Year</label>\n");
      out.write("\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" data-ng-model=book.year\n");
      out.write("\t\t\t\t\t\t\tplaceholder=\"Year\" required>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<label class=\"mr-lg-2\" for=\"inlineFormCustomSelect\">Genre</label> <select\n");
      out.write("\t\t\t\t\tclass=\"custom-select lg-2 mr-lg-2 mb-sm-0\"\n");
      out.write("\t\t\t\t\tid=\"inlineFormCustomSelect\">\n");
      out.write("\t\t\t\t\t<option value=\"YES\">Fantasy</option>\n");
      out.write("\t\t\t\t\t<option value=\"NO\">Comedy</option>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</select> <label class=\"mr-lg-2\" for=\"inlineFormCustomSelect\">Status</label>\n");
      out.write("\t\t\t\t<select class=\"custom-select lg-2 mr-lg-2 mb-sm-0\"\n");
      out.write("\t\t\t\t\tdata-ng-model=book.status required>\n");
      out.write("\t\t\t\t\t<option value=\"true\">Available</option>\n");
      out.write("\t\t\t\t\t<option value=\"false\">Not Available</option>\n");
      out.write("\t\t\t\t</select>\n");
      out.write("\n");
      out.write(" \t\t\t\t<button type=\"button\"  data-ng-disabled=\"myForm.$invalid\" class=\"btn btn-default\" data-ng-click =\"createBook()\" >Submit</button>\n");
      out.write("{{book}}\n");
      out.write("\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /WEB-INF/pages/jsp/Book/create.jsp(10,17) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/home");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }
}
