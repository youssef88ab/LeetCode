/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function (arr, fn) {

    let array = [];
    let len = arr.length;

    for (let i = 0; i < len; i++) {
        if (fn.length == 1) {
            if (fn(arr[i]) != 0) { array.push(arr[i]) }
        }
        else {
            if (fn(arr[i], i) != 0) { array.push(arr[i]) }
        }
    }

    return array;
};