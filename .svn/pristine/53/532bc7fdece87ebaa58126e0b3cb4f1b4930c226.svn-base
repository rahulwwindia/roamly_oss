<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<%@ page session="true" %> 
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title>Roamly-oss</title>
</head>
<script>
jquery(document).ready(
		function() {
	$('input').DatePicker(options);
	$('input').DatePickerSetDate(date, shiftTo);
	$('input').DatePickerGetDate(formated);
	$('input').DatePickerShow();
	$('input').DatePickerHide();
	$('#datepicker').DatePickerClear();
	
}); 
</script>
<body>
	<div id="header">
		<div id="headerTitle">
			<tiles:insertAttribute name="header" />
		</div>
	</div>
	<p>
		<input class="inputDate" id="inputDate" value="06/14/2008"
			maxlength="25px;" />
	</p>
			<h1>File Upload Form</h1><br />
		<form:form commandName="FORM" enctype="multipart/form-data" method="POST">
		<table>
			<tr><td colspan="2" style="color: red;"><form:errors path="*" cssStyle="color : red;"/>
				${errors}
			</td></tr>
			<tr><td>Name : </td><td><form:input type="file" path="file" /></td></tr>
			<tr><td colspan="2"><input type="submit" value="Upload File" /></td></tr>
		</table>
		</form:form>
	</div> 
	</div> 
	</div>
</body>
</html>
