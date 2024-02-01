import unittest

class String:
    def is_palindrome(self, str1):
        len_str1 = len(str1) - 1
        i = 0
        while i <= len_str1:
            if str1[i] != str1[len_str1]:
                return False
            i += 1
            len_str1 -= 1
        return True

    def is_similar(self, str1, str2):
        len_str1 = len(str1)
        len_str2 = len(str2)
        if len_str1 != len_str2:
            return False
        for i in range(len_str1):
            if str1[i] != str2[i]:
                return False
        return True

class TestStringMethods(unittest.TestCase):
    def test_is_palindrome(self):
        s = String()
        self.assertTrue(s.is_palindrome("aba"))

    def test_is_similar(self):
        s = String()
        self.assertTrue(s.is_similar("hello", "hello"))

if __name__ == '__main__':
    unittest.main()
