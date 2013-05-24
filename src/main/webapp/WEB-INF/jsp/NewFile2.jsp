<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html lang="en">
  <head>
    <meta charset="utf-8">

    <title>Roamly-OSS</title>
    
	  <meta name="viewport" content="width=device-width">

    

  </head>  
  <body>
  <div id="header">
			<div id="headerTitle">
				<tiles:insertAttribute name="header" />
			</div> 
		</div>  
		<div class="container">
		    <div class="page-header"> 
		    </div> 
				<div class="row"> 
				<div class="span8">  
					<form:form action="../FileUploadForm.htm" commandName="myForm" id="contact-form" class="form-horizontal" method="POST">
					  <fieldset> 
					    <div class="control-group">
					      <label class="control-label" for="name">Your Name</label>
					      <div class="controls">
					        <input type="text" class="input-xlarge" name="name" id="name">
					      </div>
					    </div>
					    <div class="control-group">
					      <label class="control-label" for="email">Email Address</label>
					      <div class="controls">
					        <input type="text" class="input-xlarge" name="email" id="email">
					      </div>
					    </div>
					    <div class="control-group">
					      <label class="control-label" for="subject">Subject</label>
					      <div class="controls">
					        <input type="text" class="input-xlarge" name="subject" id="subject">
					      </div>
					    </div>
					    <div class="control-group">
					      <label class="control-label" for="message">Your Message</label>
					      <div class="controls">
					        <textarea class="input-xlarge" name="message" id="message" rows="3"></textarea>
					      </div>
					    </div>
              <div class="form-actions">
		            <button type="submit" class="btn btn-primary btn-large">Submit</button>
    			      <button class="btn">Cancel</button>
        			</div>
					  </fieldset>
					</form:form>
				</div><!-- .span -->
				
			</div><!-- .row --> 

    </div> <!-- .container --> 

<!-- ==============================================
		 JavaScript below! 															-->



  </body>
</html> 