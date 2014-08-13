<%@ attribute name="id" %>
<%@ attribute name="label" %>
<%@ attribute name="campoName" required="true" %>
<%@ attribute name="margin" required="true" %>
<%@ attribute name="value" %>
<%@ attribute name="type" required="true"%>
<label><label for="${id}"><span>${label}</span></label></label>
<input type="${type}" name="${campoName}" id="${id}" size="50" style="margin-left: ${margin}" value="${value}" /><br/>