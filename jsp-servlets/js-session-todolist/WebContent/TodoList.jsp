<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>    
    
<div class="todolist">
	<!-- set the items list -->
	<% 
	List<String> items = (List<String>) session.getAttribute("items");
	if(items == null){
		items = new ArrayList<String>();
		session.setAttribute("items", items);
	}
	%> 
	
	<!-- store the new item if exists  -->
	<% 
	String newItem = request.getParameter("todoitem-input");
	if(newItem != null){
		items.add(newItem);
	}
	%>
	
	<!-- display all items from the list -->
	<%
	for(String el : items){
		out.println( 
			"<div class=\"todoitem\">" + 
			el + 
			"</div>"
		);
			
	}
	%>
</div>