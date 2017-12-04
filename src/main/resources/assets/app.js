(function () {
    'use strict';

    angular.module('contractApp', ['ngRoute'])
        .config(function ($routeProvider) {

            $routeProvider
                .when('/contracts', {
                    controller: 'ContractsCtrl',
                    controllerAs: 'ContractsCtrl',
                    templateUrl: '/components/contract/index.html'
                })
                .otherwise({
                    redirectTo: '/contracts'
                });

        });
})();
