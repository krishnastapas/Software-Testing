import unittest

class Stack:
    def __init__(self, size):
        self.max_size = size
        self.stack_array = [0] * self.max_size
        self.top = -1

    def push(self, value):
        if self.top < self.max_size - 1:
            self.top += 1
            self.stack_array[self.top] = value
            print("Pushed:", value)
        else:
            print("Stack Overflow. Cannot push", value)

    def pop(self):
        if self.top >= 0:
            popped_value = self.stack_array[self.top]
            self.top -= 1
            print("Popped:", popped_value)
            return popped_value
        else:
            print("Stack Underflow. Cannot pop")
            return -1  
        
class TestStack(unittest.TestCase):
    def setUp(self):
        self.st = Stack(5)

    def test_push_pop(self):
        self.st.push(6)
        self.st.push(8)
        self.assertEqual(8, self.st.pop())
        self.assertEqual(6, self.st.pop())

if __name__ == '__main__':
    unittest.main()
