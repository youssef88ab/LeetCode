class Solution(object):
    def plusOne(self, digits):
        total = 0
        for digit in digits:
            total = digit + total * 10

        total += 1
        length = len(str(abs(total)))
        solution = [0] * length
        i = length - 1

        while total > 0:
            solution[i] = total % 10
            i -= 1
            total //= 10

        return solution
        