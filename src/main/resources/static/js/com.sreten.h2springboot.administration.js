com.sreten.h2springboot.administration = {
    
    showAddNewDatabaseConnectionDialog: function(){
             
        var $modal = $('<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Host name/address:</label>'+
                            '<input type="text" class="form-control" id="hostname" value="hadoopmaster.ad.ufl.edu">'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Port:</label>'+
                            '<input type="text" class="form-control" id="port" value="5432">'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Username:</label>'+
                            '<input type="text" class="form-control" id="username" value="scvetojevic">'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Password:</label>'+
                            '<input type="password" class="form-control" id="password" value="First132.">'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Database:</label>'+
                            '<input type="text" class="form-control" id="database" value="twitter_geo_split_18">'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Database type:</label>'+
                            '<select name="cars" id="databasetype">'+
                                '<option value="postgresql">PostgreSQL</option>'+
                                '<option value="mysql">MySQL</option>'+
                            '</select>'+
                        '</div>'+
                        '<div class="form-group">'+
                            '<label for="recipient-name" class="col-form-label">Query:</label>'+
                            '<textarea id="query" class="form-control" name="query" rows="4" cols="50"'+ 
                                        'value="select json::json as tweet from tweets_stream_nw_ii where id in (694, 700, 720, 733)"></textarea>'+
                        '</div>');

        BootstrapDialog.show({
            title: 'Add new database connection',
            message: $modal,
            draggable: true,
            buttons: [{
                label: 'Submit',
                cssClass: 'btn-primary',
                hotkey: 13, // Enter.
                action: function(dialog) {
                    com.sreten.h2springboot.administration.insertNewDatabaseConnection();
                    dialog.close();
                }
            }]
        });
    },
    
    insertNewDatabaseConnection: function(){
    	var idsHost = "http://localhost:8080";
           
            let newServer = {
                            hostname: $('#hostname').val(),
                            port: $('#port').val(),
                            username: $('#username').val(),
                            password: $('#password').val(),
                            database: $('#database').val(),
                            databasetype: $('#databasetype').val(),
                            query: $('#query').val(),
                	};

            try {
                let response = fetch(idsHost+"/databaseconnection", {
              	  method: 'POST',
              	  headers: {
                    	"Accept": "application/json;charset=UTF-8",
                    	'Content-Type': 'application/json'
              	  },
              	  body: JSON.stringify(newServer)
              	});
                console.log(JSON.stringify(newServer));
                
                if (response.status >= 200 && response.status < 300) {
                	alert(result.message);
                }
            } catch (errors) {
                alert(errors);
            }
    },
		
    toggleH2iframevisibility : function(){
        if($("#swaggeriframe").is(":visible")){
                $("#swaggeriframe").toggle();
            }
   			$("#h2iframe").toggle();
   },
    toggleSwaggeriframevisibility : function(){
   			if($("#h2iframe").is(":visible")){
   				$("#h2iframe").toggle();0
            }
   			$("#swaggeriframe").toggle();
    },
                
    showSubscriptionDialog : function(){
        BootstrapDialog.confirm({
            title: 'WARNING',
            message: 'Warning! Drop your banana?',
            type: BootstrapDialog.TYPE_WARNING,
            closable: true,
            draggable: true,
            btnCancelLabel: 'Do not drop it!',
            btnOKLabel: 'Drop it!',
            btnOKClass: 'btn-warning',
            callback: function(result) {
                if(result) {
                    alert('Yup.');
                }else {
                    alert('Nope.');
                }
            }
        });
    }
};
