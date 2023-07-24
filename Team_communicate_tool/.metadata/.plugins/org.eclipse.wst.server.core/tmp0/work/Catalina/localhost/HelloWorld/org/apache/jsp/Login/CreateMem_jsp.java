/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-07-24 06:34:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CreateMem_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("  <!DOCTYPE html>\n");
      out.write("  <html>\n");
      out.write("  <head>\n");
      out.write("    <title>Register</title>\n");
      out.write("    <link href=\"../css/styles.css\" rel=\"stylesheet\" />\n");
      out.write("  </head>\n");
      out.write("  <body class=\"bg-primary\">\n");
      out.write("    <div id=\"layoutAuthentication\">\n");
      out.write("      <div id=\"layoutAuthentication_content\">\n");
      out.write("        <main>\n");
      out.write("          <div class=\"container\" style=\"margin-top: 4%;\">\n");
      out.write("            <div class=\"row justify-content-center\">\n");
      out.write("              <div class=\"col-lg-7\">\n");
      out.write("                <div class=\"card shadow-lg border-0 rounded-lg mt-5\">\n");
      out.write("                  <div class=\"card-header\">\n");
      out.write("                    <h3 class=\"text-center font-weight-light my-4\">Create\n");
      out.write("                      Account</h3>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <form action=\"../Login/createMem.do\" method=\"post\">\n");
      out.write("                      <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" id=\"inputName\" type=\"text\"\n");
      out.write("                              placeholder=\"Enter your first name\" name=\"regName\" onchange=\"checkKorean()\"/> \n");
      out.write("                              <label for=\"inputFirstName\">Name</label>\n");
      out.write("                              <a id=\"result\"></a>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col-md-8\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" id=\"inputID\" type=\"text\" placeholder=\"input ID\" name=\"regID\" />\n");
      out.write("                            <label for=\"inputFirstName\">ID</label>\n");
      out.write("                            <button class=\"btn btn-primary btn-block\" type=\"button\" onclick=\"checkID();\">중복 확인</button>\n");
      out.write("                            <span id=\"place\" class=\"checked\"></span>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"row mb-3\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" id=\"pwd\" name=\"PW1\" type=\"password\" onchange=\"checkpwd_1()\"\n");
      out.write("                              placeholder=\"Create a password\" /> <label for=\"inputPassword\">Password</label> <span\n");
      out.write("                              id=\"checkPW\" class=\"checked\"></span>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                          <div class=\"form-floating mb-3 mb-md-0\">\n");
      out.write("                            <input class=\"form-control\" type=\"password\" name=\"PW2\" id=\"checkpwd\" onchange=\"checkpwd_1()\"\n");
      out.write("                              placeholder=\"Confirm password\" /> <label for=\"inputPasswordConfirm\">Confirm\n");
      out.write("                              Password</label> <span id=\"check\" class=\"checked\"></span>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"form-floating mb-3\">\n");
      out.write("                        <input class=\"form-control\" id=\"email\" name=\"regEmail\" type=\"email\" placeholder=\"Input Email\" />\n");
      out.write("                        <label for=\"inputEmail\">Email</label>\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\" id=\"sendMailBtn\">인증 메일 보내기</button>\n");
      out.write("                      </div>\n");
      out.write("                      <div>\n");
      out.write("                        <a class=\"small\" style=\"display: none\" id=\"sendText\">메일을 보냈습니다.</a>\n");
      out.write("                      </div>\n");
      out.write("                      <div>\n");
      out.write("                        <input type=\"text\" name=\"checkCode\" id=\"myInput\">\n");
      out.write("                        <button class=\"btn btn-primary\" type=\"button\" id=\"checkCodeBtn\" onclick=\"insertEmail()\">인증 확인</button>\n");
      out.write("                      </div>\n");
      out.write("                      <div class=\"mt-4 mb-0\">\n");
      out.write("                        <div class=\"d-grid\">\n");
      out.write("                          <button class=\"btn btn-primary btn-block\" type =\"submit\">Create Account</button>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </form>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"card-footer text-center py-3\">\n");
      out.write("                    <div class=\"small\">\n");
      out.write("                      <a href=\"../Login/LoginPage.jsp\">Have an account? Go to\n");
      out.write("                        login</a>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </main>\n");
      out.write("      </div>\n");
      out.write("      <div id=\"layoutAuthentication_footer\">\n");
      out.write("        <footer class=\"py-4 bg-light mt-auto\">\n");
      out.write("          <div class=\"container-fluid px-4\">\n");
      out.write("            <div class=\"d-flex align-items-center justify-content-between small\">\n");
      out.write("              <div class=\"text-muted\"></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </footer>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/scripts.js\"></script>\n");
      out.write("    \n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("	<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://use.fontawesome.com/releases/v6.3.0/js/all.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script>\n");
      out.write("    let idsuccess = 0;\n");
      out.write("    let pwsuccess = 0;\n");
      out.write("    let emailsuccess = 0;\n");
      out.write("    let namesuccess = 0;\n");
      out.write("    let pwsuccess2 = 0;\n");
      out.write("  \n");
      out.write("    \n");
      out.write("      let codenum = Math.floor((Math.random() * 900000) + 100000);\n");
      out.write("      let result = 0;\n");
      out.write("      $(function () {\n");
      out.write("        $('#sendMailBtn').click(function () {\n");
      out.write("          $('#sendText').css(\"display\", \"block\");\n");
      out.write("          $.ajax({\n");
      out.write("            url: \"EmailProcess.jsp\",\n");
      out.write("            type: \"post\",\n");
      out.write("            data: {\n");
      out.write("              email: $('#email').val(),\n");
      out.write("              code: codenum\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("        });\n");
      out.write("      });\n");
      out.write("      \n");
      out.write("      $('form').submit(function(){\n");
      out.write("    	  if(idsuccess == 1 && pwsuccess == 1 && emailsuccess == 1 && namesuccess == 1 && pwsuccess2 == 1){\n");
      out.write("    		  return true;\n");
      out.write("    	  }\n");
      out.write("    	  else{\n");
      out.write("    		  alert(\"제대로 입력되지 않았습니다.\");\n");
      out.write("    		  return false;\n");
      out.write("    	  }\n");
      out.write("      });\n");
      out.write("      \n");
      out.write("      function insertEmail() {\n");
      out.write("        let myInput = document.getElementById('myInput').value;\n");
      out.write("        if (myInput == codenum) {\n");
      out.write("          result = 1;\n");
      out.write("        } else if (myInput != codenum) {\n");
      out.write("          result = 0;\n");
      out.write("        } else {\n");
      out.write("          result = -1;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (result == 1) {\n");
      out.write("          alert(\"인증되었습니다.\");\n");
      out.write("          emailsuccess = 1;\n");
      out.write("          $(\"#myInput\").attr(\"disabled\", true);\n");
      out.write("        } else {\n");
      out.write("          alert(\"메일이 인증되지 않았습니다.\");\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      //문자 유효성 검사\n");
      out.write("      function combine(str) {\n");
      out.write("        var reg1 = /[a-z0-9]/;\n");
      out.write("        var reg2 = /[a-z]/;\n");
      out.write("        var reg3 = /[0-9]/;\n");
      out.write("        return (reg1.test(str) && reg2.test(str) && reg3.test(str));\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      //한글 유효성 검사\n");
      out.write("      function checkKorean() {\n");
      out.write("          var input = document.getElementById(\"inputName\").value;\n");
      out.write("          var regex = /^[ㄱ-ㅎㅏ-ㅣ가-힣]*$/; // 한글 정규표현식\n");
      out.write("          if (regex.test(input)) {\n");
      out.write("        	  namesuccess = 1;\n");
      out.write("            document.getElementById(\"result\").innerHTML = \"<a style='color:green'>유효한 입력입니다.</a>\";\n");
      out.write("          } else {\n");
      out.write("        	  namesuccess = 0;\n");
      out.write("            document.getElementById(\"result\").innerHTML = \"<a style='color:red'>한글만 입력 가능합니다.</a>\";\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      \n");
      out.write("      function checkID() {\n");
      out.write("        let idString = \"");
      out.print(session.getAttribute("sameID"));
      out.write("\";\n");
      out.write("        idString = idString.replace(\"[\", \"\");\n");
      out.write("        idString = idString.replace(\"]\", \"\");\n");
      out.write("        console.log(idString);\n");
      out.write("        let idList = idString.split(\", \");\n");
      out.write("\n");
      out.write("        var id = document.getElementById('inputID');\n");
      out.write("        var place = document.getElementById('place');\n");
      out.write("\n");
      out.write("        if (id.value.trim() == \"\") {\n");
      out.write("        	idsuccess = 0;\n");
      out.write("          place.innerHTML = \"<a style='color:red'>빈칸입니다.</a>\";\n");
      out.write("        } else {\n");
      out.write("          if (idList.indexOf(id.value.trim()) != -1) {\n");
      out.write("        	  idsuccess = 0;\n");
      out.write("            place.innerHTML = \"<a style='color:red'>중복된 아이디입니다.</a>\";\n");
      out.write("          } else {\n");
      out.write("        	  idsuccess = 1;\n");
      out.write("            place.innerHTML = \"<a style='color:green'>사용 가능한 아이디입니다.</a>\";\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      //비밀번호 확인\n");
      out.write("      var pwdd = document.getElementById(\"pwd\");\n");
      out.write("      var checkpwdd = document.getElementById(\"checkpwd\");\n");
      out.write("      var PWcheck = document.getElementById(\"checkPW\");\n");
      out.write("      var okpw = document.getElementById(\"check\");\n");
      out.write("\n");
      out.write("      function checkpwd_1() {\n");
      out.write("    	  \n");
      out.write("        var SC = [\"!\", \"@\", \"#\", \"$\", \"%\", \"*\"];\n");
      out.write("        var check_SC = 0;\n");
      out.write("\n");
      out.write("        for (var i = 0; i < SC.length; i++) {\n");
      out.write("          if (pwdd.value.indexOf(SC[i]) != -1) {\n");
      out.write("            check_SC = 1;\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (pwdd.value) {\n");
      out.write("          if (pwdd.value.length <= 8 || check_SC == 0\n");
      out.write("            || !combine(pwdd.value)) {\n");
      out.write("        	  pwsuccess2 = 0;\n");
      out.write("            PWcheck.innerHTML = \"<span style='color:red'>영문,숫자,특수문자(필수) 조합 8자 이상</span>\";\n");
      out.write("            pwdd.focus();\n");
      out.write("          } else {\n");
      out.write("        	  pwsuccess2 = 1;\n");
      out.write("            PWcheck.innerHTML = \"<span style='color:green'>안전한 비밀번호입니다.</span>\";\n");
      out.write("          }\n");
      out.write("        } else {\n");
      out.write("          PWcheck.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        if (pwdd.value && checkpwdd.value) {\n");
      out.write("          if (pwdd.value === checkpwdd.value) {\n");
      out.write("        	  pwsuccess = 1;\n");
      out.write("            okpw.innerHTML = \"<span style='color:green'>비밀번호가 일치합니다.</span>\";\n");
      out.write("          } else {\n");
      out.write("        	  pwsuccess = 0;\n");
      out.write("            okpw.innerHTML = \"<span style='color:red'>비밀번호가 일치하지 않습니다.</span>\";\n");
      out.write("          }\n");
      out.write("        } else {\n");
      out.write("          okpw.innerHTML = \"\";\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("    \n");
      out.write("    </script>\n");
      out.write("  </body>\n");
      out.write("\n");
      out.write("  </html>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("  ");
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