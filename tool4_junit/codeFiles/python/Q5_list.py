import unittest

class Q5List:
    def __init__(self):
        self.items = []

    def find(self, key):
        return key in self.items

    def insert(self, data):
        self.items.append(data)


class TestQ5List(unittest.TestCase):
    def test_find_insert(self):
        ls = Q5List()

        self.assertFalse(ls.find(42))
        self.assertFalse(ls.find(10))

        ls.insert(42)
        self.assertTrue(ls.find(42))
        self.assertFalse(ls.find(10))

        ls.insert(10)
        self.assertTrue(ls.find(42))
        self.assertTrue(ls.find(10))

if __name__ == '__main__':
    unittest.main()
