import unittest
# our code to be tested
class Rectangle:
    def __init__(self,width,height):
        self.width=width
        self.height=height
    
    def get_perimeter(self):
        return 2*(self.width+self.height)
    
    def get_area(self):
        return self.height*self.width
    
    def set_width(self,width):
        if(self.width==0):
            return False
        else:
            self.width=width
            return True
        
    def set_height(self,height):
        if(height==0):
            return False
        else:
            
          self.height=height
          return True
    
# the test based on unittest modules

class TestGetAreaRectangle(unittest.TestCase):
    def runTest(self):
        rectangle=Rectangle(3,2)
       
        self.assertEqual(10,rectangle.get_perimeter())
        self.assertEqual(6,rectangle.get_area())
     
       
        
        
        

unittest.main()