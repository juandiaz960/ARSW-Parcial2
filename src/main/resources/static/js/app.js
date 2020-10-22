var app = (function () {
    
    var _module = "js/apiclient.js";
    
    function init(){
        var nombre = $("#name").val();        
        _module.getWeather(nombre, _prettyPrint);
    }

    function _prettyPrint(data){
        console.log(data);
        data[0].map(function (info) {
            $("#tabla > tbody").append(
                "<tr> <td>" +info.coord.lon+"</td> <td>"
                + info.coord.lat + "</td> <td>"
                + info.clima+ "</td> <td>"
                + info.visibility+"</td></td>"
                + info.dt+"</td></td>"
                + info.id+"</td></td>"
                + info.name+"</td></td>"
                + info.timezone+"</td></tr>"
            );
        });
    }
    
    return {
        init: init
    };

})();