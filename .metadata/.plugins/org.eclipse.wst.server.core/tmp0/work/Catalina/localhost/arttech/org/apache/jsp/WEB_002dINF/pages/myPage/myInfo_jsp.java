/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.35
 * Generated at: 2021-08-26 17:07:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.pages.myPage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/kopo_finalProject_API/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/art-tech/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1628045688839L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\" lang=\"zxx\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"x-ua-compatible\" content=\"ie=edge\">\r\n");
      out.write("    <title>Transportion</title>\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/myCss.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/css/myModal.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- <link rel=\"manifest\" href=\"site.webmanifest\"> -->\r\n");
      out.write("    <link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/img/favicon.png\">\r\n");
      out.write("    <!-- Place favicon.ico in the root directory -->\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/static/js/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    function addWallet() {\r\n");
      out.write("    \t$.ajax({\r\n");
      out.write("\t\t\ttype: \"POST\",\r\n");
      out.write("\t\t\turl : \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/wallet\",\r\n");
      out.write("\t\t\tsuccess : function(result) {\r\n");
      out.write("\t\t        $('.mypage-publickey-div').empty();\r\n");
      out.write("\t\t        $('.mypage-publickey-div').append('<p class=\"kakao_p mypage-publicKey\">' + result + '</p>')\r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t        \r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror: function (request, status, error){\r\n");
      out.write("\t\t\t\tvar msg = \"ERROR : \" + request.status + \"<br>\"\r\n");
      out.write("\t\t\t\tmsg += + \"내용 : \" + request.responseText + \"<br>\" + error;\r\n");
      out.write("\t\t\t\tconsole.log(msg);\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t\r\n");
      out.write("    }\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- container -->\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"myPage_main_title\">\r\n");
      out.write("\t\t\t<p>회원정보</p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form action=\"\">\r\n");
      out.write("\t\t\t<div class=\"myPage_container\">\r\n");
      out.write("\t\t\t\t<div class=\"myInfoDetail\">\r\n");
      out.write("\t\t\t\t\t<p id=\"name\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.name }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t\t\t\t\t<p id=\"email\">whtpwls777@naver.com</p>\r\n");
      out.write("\t\t\t\t\t<p><span>010-2523-5521</span><span class=\"phoneChange_span\"><button type=\"button\" class=\"phoneNumChange_btn\">변경</button></span></p>\r\n");
      out.write("\t\t\t\t\t<div class=\"addr_container\">\r\n");
      out.write("\t\t\t\t\t\t<p class=\"dddr_title\">주소</p>\r\n");
      out.write("\t\t\t\t\t\t<p>우편번호</p>\r\n");
      out.write("\t\t\t\t\t\t<p><span><input class=\"post_input\" type=\"text\" id=\"sample4_postcode\" readonly value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.zipcode }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></span><span class=\"find_address_span\"><a onclick=\"sample4_execDaumPostcode()\">주소 변경</a></span></p>\r\n");
      out.write("\t\t\t\t\t\t<p>도로명 주소</p>\r\n");
      out.write("\t\t\t\t\t\t<p><input type=\"text\" id=\"sample4_roadAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.addr1Load }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></p>\r\n");
      out.write("\t\t\t\t\t\t<p>지번 주소</p>\r\n");
      out.write("\t\t\t\t\t\t<p><input type=\"text\" id=\"sample4_jibunAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.addr1Jibun }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" readonly></p>\r\n");
      out.write("\t\t\t\t\t\t<p><span id=\"guide\" style=\"color:#999;display:none\"></span></p>\r\n");
      out.write("\t\t\t\t\t\t<p>상세 주소</p>\r\n");
      out.write("\t\t\t\t\t\t<p><input type=\"text\" id=\"sample4_detailAddress\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.addr2}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"sns_container\">\r\n");
      out.write("\t\t\t\t\t<p class=\"my_sns_title\">지갑</p>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"sns_container\">\r\n");
      out.write("\t\t\t\t\t<p class=\"my_sns_title\">SNS 계정연동</p>\r\n");
      out.write("\t\t\t\t\t<p class=\"kakao_p\"><a href=\"#\">카카오 계정 연동하기</a></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"input_container\">\r\n");
      out.write("\t\t\t\t\t<span><input type=\"submit\" value=\"수정\"></span> \r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- container end -->\r\n");
      out.write("\t\r\n");
      out.write("\t<!-- 모달 -->\r\n");
      out.write("\t<div class=\"myInfo_phoneChange_modal\">\r\n");
      out.write("\t\t<div class=\"myInfo_modal_body\" >  \r\n");
      out.write("\t\t\t<div class=\"title\">\r\n");
      out.write("\t\t\t\t<p class=\"main\">핸드폰 번호 인증</p>\r\n");
      out.write("\t\t\t\t<hr>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t\t<div class=\"content_block\">\r\n");
      out.write("\t\t\t\t\t<p><span><input type=\"tel\" placeholder=\"핸드폰 번호를 입력하세요.\"></span><span><a>인증하기</a></span></p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<div class=\"select\">\r\n");
      out.write("\t\t\t\t<div class=\"div_left\">\r\n");
      out.write("\t\t\t\t\t<p onclick=\"location.href='#'\">변경</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"div_right\">\r\n");
      out.write("\t\t\t\t\t<p class=\"phoneChange_modal_cancel\">취소</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t//핸드폰 번호 모달\r\n");
      out.write("\t\tconst phone_modal = document.querySelector('.myInfo_phoneChange_modal');\r\n");
      out.write("\t\tconst phone_btnOpenPopup = document.querySelector('.phoneNumChange_btn');\r\n");
      out.write("\t\tconst phone_btnModalCancel = document.querySelector('.phoneChange_modal_cancel');\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tphone_btnOpenPopup.addEventListener('click', () => {\r\n");
      out.write("\t\t\t$('html, body').addClass('hidden');\r\n");
      out.write("\t\t\tphone_modal.style.display = 'block'; \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tphone_btnModalCancel.addEventListener('click', () => {\r\n");
      out.write("\t\t\t$('html, body').removeClass('hidden');\r\n");
      out.write("\t\t\tphone_modal.style.display = 'none'; \r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t//주소 api\r\n");
      out.write("\t\tfunction sample4_execDaumPostcode() {\r\n");
      out.write("\t        new daum.Postcode({\r\n");
      out.write("\t            oncomplete: function(data) {\r\n");
      out.write("\t                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\t\r\n");
      out.write("\t                // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.\r\n");
      out.write("\t                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("\t                var roadAddr = data.roadAddress; // 도로명 주소 변수\r\n");
      out.write("\t                var extraRoadAddr = ''; // 참고 항목 변수\r\n");
      out.write("\t\r\n");
      out.write("\t                // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("\t                // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("\t                if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("\t                    extraRoadAddr += data.bname;\r\n");
      out.write("\t                }\r\n");
      out.write("\t                // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("\t                if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("\t                   extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("\t                }\r\n");
      out.write("\t                // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("\t                if(extraRoadAddr !== ''){\r\n");
      out.write("\t                    extraRoadAddr = ' (' + extraRoadAddr + ')';\r\n");
      out.write("\t                }\r\n");
      out.write("\t\r\n");
      out.write("\t                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("\t                document.getElementById('sample4_postcode').value = data.zonecode;\r\n");
      out.write("\t                document.getElementById(\"sample4_roadAddress\").value = roadAddr;\r\n");
      out.write("\t                document.getElementById(\"sample4_jibunAddress\").value = data.jibunAddress;\r\n");
      out.write("\t                \r\n");
      out.write("\t\r\n");
      out.write("\t                var guideTextBox = document.getElementById(\"guide\");\r\n");
      out.write("\t                // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.\r\n");
      out.write("\t                if(data.autoRoadAddress) {\r\n");
      out.write("\t                    var expRoadAddr = data.autoRoadAddress + extraRoadAddr;\r\n");
      out.write("\t                    guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';\r\n");
      out.write("\t                    guideTextBox.style.display = 'block';\r\n");
      out.write("\t\r\n");
      out.write("\t                } else if(data.autoJibunAddress) {\r\n");
      out.write("\t                    var expJibunAddr = data.autoJibunAddress;\r\n");
      out.write("\t                    guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';\r\n");
      out.write("\t                    guideTextBox.style.display = 'block';\r\n");
      out.write("\t                } else {\r\n");
      out.write("\t                    guideTextBox.innerHTML = '';\r\n");
      out.write("\t                    guideTextBox.style.display = 'none';\r\n");
      out.write("\t                }\r\n");
      out.write("\t            }\r\n");
      out.write("\t        }).open();\r\n");
      out.write("\t    }\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<!-- 모달 끝 -->\t\r\n");
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/pages/myPage/myInfo.jsp(74,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty member.publicKey }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div>\r\n");
          out.write("\t\t\t\t\t\t\t\t<p class=\"kakao_p mypage-publicKey\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${member.publicKey }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /WEB-INF/pages/myPage/myInfo.jsp(79,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty member.publicKey }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t<div class=\"mypage-publickey-div\">\r\n");
          out.write("\t\t\t\t\t\t\t\t<p class=\"kakao_p\" ><a onclick=\"addWallet()\">생성하기</a></p>\r\n");
          out.write("\t\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }
}
