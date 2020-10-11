/**
* This file is created by Sreten Cvetojevic on 6/4/2020
* All the javascript objects should be defined with the prefix com.sreten.h2springboot
* e.g. com.sreten.h2springboot.map
*/

/**
 * Main file of Twitter 
 * @author Sreten Cvetojevic
 * @date 2020.05.06
 */
com.sreten.h2springboot.main = {
	
	init: function(){
            this.initheight();
            com.sreten.h2springboot.administration.showDialog();

        },
	
	initheight: function(){
		
		com.sreten.h2springboot.main.htmlbodyHeightUpdate()
		
		$( window ).resize(function() {
		
			com.sreten.h2springboot.main.htmlbodyHeightUpdate()		
		});		
		$( window ).scroll(function() {
		
			height2 = $('.main').height()
			
			com.sreten.h2springboot.main.htmlbodyHeightUpdate()		
		});				
	},
	
	htmlbodyHeightUpdate: function (){
		
		var height3 = $( window ).height()
		
		var height1 = $('.nav').height()+50
		
		height2 = $('.main').height()
		
		if(height2 > height3){
		
			$('html').height(Math.max(height1,height3,height2)+10);
			
			$('body').height(Math.max(height1,height3,height2)+10);
		
		}
		else
		{
		
			$('html').height(Math.max(height1,height3,height2));
			
			$('body').height(Math.max(height1,height3,height2));
			
		}
		
	}
	
}

$(document).ready(function () {
	
//	com.sreten.h2springboot.main.init();

});