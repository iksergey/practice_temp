/*
Задать массив из 8 элементов и вывести их на экран 
начиная с последнего
*/

let vector = [1, 1, 2, 3, 5, 8, 13, 21]
let length = vector.length
while (length-- > 0) {
  console.log(vector[length])
}