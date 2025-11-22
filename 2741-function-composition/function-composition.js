/**
 * @param {Function[]} functions
 * @return {Function}
 */
var compose = function (functions) {

    return function (x) {
        let len = functions.length; 

        if (len == 0) {return x;}

        let res = functions[len - 1](x);

        for (let i = functions.length - 2; i >= 0; i--) {
            res = functions[i](res); 
        }
        return res; 
    }
};

/**
 * const fn = compose([x => x + 1, x => 2 * x])
 * fn(4) // 9
 */