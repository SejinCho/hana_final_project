/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2021-08-27 00:00:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/myCss.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- Start Footer -->\r\n");
      out.write("    <footer class=\"bg-secondary pt-4\" class=\"footer\">\r\n");
      out.write("        <div class=\"container contents-wrap\">\r\n");
      out.write("            <div class=\"row py-4\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-12 align-left\">\r\n");
      out.write("                    <a class=\"navbar-brand\" href=\"index.html\">\r\n");
      out.write("                        <i class='bx bx-buildings bx-sm text-light'></i>\r\n");
      out.write("                        <span class=\"text-light h5\">Purple</span> <span class=\"text-light h5 semi-bold-600\">Buzz</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <p class=\"text-light my-lg-4 my-2\">\r\n");
      out.write("                        Lorem ipsum dolor sit amet, consectetur adipisicing elit,\r\n");
      out.write("                        sed do eiusmod tempor incididunt ut.\r\n");
      out.write("                    </p>\r\n");
      out.write("                    <ul class=\"list-inline footer-icons light-300\">\r\n");
      out.write("                        <li class=\"list-inline-item m-0\">\r\n");
      out.write("                            <a class=\"text-light\" target=\"_blank\" href=\"http://facebook.com/\">\r\n");
      out.write("                                <i class='bx bxl-facebook-square bx-md'></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item m-0\">\r\n");
      out.write("                            <a class=\"text-light\" target=\"_blank\" href=\"https://www.linkedin.com/\">\r\n");
      out.write("                                <i class='bx bxl-linkedin-square bx-md'></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item m-0\">\r\n");
      out.write("                            <a class=\"text-light\" target=\"_blank\" href=\"https://www.whatsapp.com/\">\r\n");
      out.write("                                <i class='bx bxl-whatsapp-square bx-md'></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item m-0\">\r\n");
      out.write("                            <a class=\"text-light\" target=\"_blank\" href=\"https://www.flickr.com/\">\r\n");
      out.write("                                <i class='bx bxl-flickr-square bx-md'></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"list-inline-item m-0\">\r\n");
      out.write("                            <a class=\"text-light\" target=\"_blank\" href=\"https://www.medium.com/\">\r\n");
      out.write("                                <i class='bx bxl-medium-square bx-md' ></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 my-sm-0 mt-4\">\r\n");
      out.write("                    <h3 class=\"h4 pb-lg-3 text-light light-300\">Our Company</h2>\r\n");
      out.write("                        <ul class=\"list-unstyled text-light light-300\">\r\n");
      out.write("                            <li class=\"pb-2\">\r\n");
      out.write("                                <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light\" href=\"index.html\">Home</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"pb-2\">\r\n");
      out.write("                                <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"about.html\">About Us</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"pb-2\">\r\n");
      out.write("                                <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"work.html\">Work</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"pb-2\">\r\n");
      out.write("                                <i class='bx-fw bx bxs-chevron-right bx-xs'></i></i><a class=\"text-decoration-none text-light py-1\" href=\"pricing.html\">Price</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li class=\"pb-2\">\r\n");
      out.write("                                <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"contact.html\">Contact</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 my-sm-0 mt-4\">\r\n");
      out.write("                    <h2 class=\"h4 pb-lg-3 text-light light-300\">Our Works</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled text-light light-300\">\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Branding</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Business</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Marketing</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Social Media</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Digital Solution</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bxs-chevron-right bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"#\">Graphic</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-lg-3 col-md-4 my-sm-0 mt-4\">\r\n");
      out.write("                    <h2 class=\"h4 pb-lg-3 text-light light-300\">For Client</h2>\r\n");
      out.write("                    <ul class=\"list-unstyled text-light light-300\">\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bx-phone bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"tel:010-020-0340\">010-020-0340</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                        <li class=\"pb-2\">\r\n");
      out.write("                            <i class='bx-fw bx bx-mail-send bx-xs'></i><a class=\"text-decoration-none text-light py-1\" href=\"mailto:info@company.com\">info@company.com</a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"w-100 bg-primary py-3\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row pt-2\">\r\n");
      out.write("                    <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                        <p class=\"text-lg-start text-center text-light light-300\">\r\n");
      out.write("                            © Copyright 2021 Purple Buzz Company. All Rights Reserved.\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-6 col-sm-12\">\r\n");
      out.write("                        <p class=\"text-lg-end text-center text-light light-300\">\r\n");
      out.write("                            Designed by <a rel=\"sponsored\" class=\"text-decoration-none text-light\" href=\"https://templatemo.com/\" target=\"_blank\"><strong>TemplateMo</strong></a>\r\n");
      out.write("                        </p>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </footer>\r\n");
      out.write("    <!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <!-- Load jQuery require for isotope -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery.min.js\"></script>\r\n");
      out.write("    <!-- Isotope -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/isotope.pkgd.js\"></script>\r\n");
      out.write("    <!-- Page Script -->\r\n");
      out.write("    <script>\r\n");
      out.write("        $(window).load(function() {\r\n");
      out.write("            // init Isotope\r\n");
      out.write("            var $projects = $('.projects').isotope({\r\n");
      out.write("                itemSelector: '.project',\r\n");
      out.write("                layoutMode: 'fitRows'\r\n");
      out.write("            });\r\n");
      out.write("            $(\".filter-btn\").click(function() {\r\n");
      out.write("                var data_filter = $(this).attr(\"data-filter\");\r\n");
      out.write("                $projects.isotope({\r\n");
      out.write("                    filter: data_filter\r\n");
      out.write("                });\r\n");
      out.write("                $(\".filter-btn\").removeClass(\"active\");\r\n");
      out.write("                $(\".filter-btn\").removeClass(\"shadow\");\r\n");
      out.write("                $(this).addClass(\"active\");\r\n");
      out.write("                $(this).addClass(\"shadow\");\r\n");
      out.write("                return false;\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <!-- Templatemo -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/templatemo.js\"></script>\r\n");
      out.write("    <!-- Custom -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/custom.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
