  
api = (function () {

    return {
        getWeather: function(city, callback) {
            var promiseGetAllCases = $.getJSON(`/weather/${ city }`);
            $.when (promiseGetAllCases).done(function (data) {
                callback(data);
            });
        }
    }
})();



