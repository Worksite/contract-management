(function () {
    angular.module('contractApp')
        .controller('ContractsCtrl', function ($http, $location) {

            var self = this;

            this.setContracts = function (response) {
                self.contracts = response.data;
            };

            function loadContracts() {
                $http.get('/api/contracts').then(self.setContracts).catch(function (err) {
                    console.error(err);
                });
            }

            loadContracts();

        })
}());
