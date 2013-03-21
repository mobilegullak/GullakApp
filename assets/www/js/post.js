$(document).bind('deviceready', function(){
    $(function(){
        $('form').submit(function(){
            var postData = $(this).serialize();
              $.support.cors = true;

            $.ajax({
                type: 'POST',
                data: postData,
                dataType: 'application/x-www-form-urlencoded',
                //change the url for your project
                url: 'http://www.mobilegullak.in/mgapi/register',
                success: function(data){
                    console.log(data);
                    alert('Your comment was successfully added');
                },
                error: function(){
                    console.log(data);
                    alert('There was an error adding your comment');
                }
            });
            
            return false;
        });
    });
});