<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleInstantPaymentServiceImplProxyid" scope="session" class="com.ws.service.instantpayment.InstantPaymentServiceImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleInstantPaymentServiceImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleInstantPaymentServiceImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleInstantPaymentServiceImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.ws.service.instantpayment.InstantPaymentServiceImpl getInstantPaymentServiceImpl10mtemp = sampleInstantPaymentServiceImplProxyid.getInstantPaymentServiceImpl();
if(getInstantPaymentServiceImpl10mtemp == null){
%>
<%=getInstantPaymentServiceImpl10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        boolean isRunning15mtemp = sampleInstantPaymentServiceImplProxyid.isRunning();
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(isRunning15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
break;
case 18:
        gotMethod = true;
        String cardSecurityCode_2id=  request.getParameter("cardSecurityCode25");
        int cardSecurityCode_2idTemp  = Integer.parseInt(cardSecurityCode_2id);
        String transactionNumber_3id=  request.getParameter("transactionNumber27");
            java.lang.String transactionNumber_3idTemp = null;
        if(!transactionNumber_3id.equals("")){
         transactionNumber_3idTemp  = transactionNumber_3id;
        }
        String cardNumber_4id=  request.getParameter("cardNumber29");
            java.lang.String cardNumber_4idTemp = null;
        if(!cardNumber_4id.equals("")){
         cardNumber_4idTemp  = cardNumber_4id;
        }
        String cardHolderName_5id=  request.getParameter("cardHolderName31");
            java.lang.String cardHolderName_5idTemp = null;
        if(!cardHolderName_5id.equals("")){
         cardHolderName_5idTemp  = cardHolderName_5id;
        }
        %>
        <jsp:useBean id="com1ws1service1instantpayment1request1MakePaymentRequest_1id" scope="session" class="com.ws.service.instantpayment.request.MakePaymentRequest" />
        <%
        com1ws1service1instantpayment1request1MakePaymentRequest_1id.setCardSecurityCode(cardSecurityCode_2idTemp);
        com1ws1service1instantpayment1request1MakePaymentRequest_1id.setTransactionNumber(transactionNumber_3idTemp);
        com1ws1service1instantpayment1request1MakePaymentRequest_1id.setCardNumber(cardNumber_4idTemp);
        com1ws1service1instantpayment1request1MakePaymentRequest_1id.setCardHolderName(cardHolderName_5idTemp);
        com.ws.service.instantpayment.response.MakePaymentResponse processPayment18mtemp = sampleInstantPaymentServiceImplProxyid.processPayment(com1ws1service1instantpayment1request1MakePaymentRequest_1id);
if(processPayment18mtemp == null){
%>
<%=processPayment18mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">isProcessed:</TD>
<TD>
<%
if(processPayment18mtemp != null){
java.lang.Boolean typeisProcessed21 = processPayment18mtemp.getIsProcessed();
        String tempResultisProcessed21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeisProcessed21));
        %>
        <%= tempResultisProcessed21 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>