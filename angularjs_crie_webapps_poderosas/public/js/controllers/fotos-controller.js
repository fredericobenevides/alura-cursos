angular.module('alurapic').controller('FotosController', function($scope, $http) {

  $scope.fotos = [];
  $scope.filtro = '';

  $http.get('v1/fotos')
  .success(function(fotos) {
    $scope.fotos = fotos;
  }).error(function(erro) {
    console.log(erro);
  });

  // var promise = $http.get('v1/fotos');
  // promise.then(function(retorno) {
  //   $scope.fotos = retorno.data;
  // }).catch(function(error) {
  //   console.log(error);
  // });

  // $scope.fotos =  [
  //   {
  //     titulo: 'Leão',
  //       url: 'http://www.fundosanimais.com/Minis/leoes.jpg'
  //   },
  //   {
  //   titulo: 'Leão 2',
  //   url: 'http://www.fundosanimais.com/Minis/leoes.jpg'
  //   },
  //   {
  //     titulo: 'Leão 3',
  //     url: 'http://www.fundosanimais.com/Minis/leoes.jpg'
  //   }
  // ]
});
