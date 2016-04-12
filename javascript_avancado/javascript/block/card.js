// var $cardColors = document.querySelectorAll('.card-colors');

// for (var index = 0; index < $cardColors.length; index++) {
//   $cardColors[index].addEventListener('click', function() {
//     var $card = this.parentNode.parentNode.parentNode;

//     for (var position = 0; position < $cardColors.length; position++) {
//       $cardColors[position].classList.remove('isActive');
//     }
//     $card.dataset.color = this.dataset.color;
//     this.classList.add('isActive');
//   });
// }

var $cards = document.querySelectorAll('.card');


for (var index = 0; index < $cards.length; index++) {
  $cards[index].addEventListener('click', function(event) {
    var $this = event.target;

    if ($this.classList.contains('card-colors')) {
      var $card = this;

      $card.dataset.color = $this.dataset.color;
      $this.classList.add('isActive');

      var $cardColors = document.querySelectorAll('.card-colors');
      for (var position = 0; position < $cardColors.length; position++) {
        $cardColors[position].classList.remove('isActive');
      }
    }
  });
}
