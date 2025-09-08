<%@ page import="user.*" %>
<%@ page import="obj.*" %>
<%@ page import="bd.*" %>

<%
  String s = request.getParamater("pseudo");
  String s2 = request.getParamater("mdp");
  if( verifMembre(s , s2){){
    out.println("oui");
  }
  else{
    out.println("non");
    
  }


%>