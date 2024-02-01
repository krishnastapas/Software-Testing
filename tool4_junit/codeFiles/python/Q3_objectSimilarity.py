import unittest


class Department:
    def __init__(self, name):
        self.name = name

    def get_name(self):
        return self.name


class Subject:
    def __init__(self, name):
        self.name = name

    def get_name(self):
        return self.name


class Book:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def get_name(self):
        return self.name

    def get_price(self):
        return self.price


class Student:
    def __init__(self, name):
        self.name = name

    def get_title(self):
        return self.name


class Result:
    def __init__(self, cgpa):
        self.cgpa = cgpa

    def get_result(self):
        return self.cgpa


class TestObjectSimilarity(unittest.TestCase):
    def test_similarity(self):
        department_obj1 = Department("Computer")
        department_obj2 = department_obj1

        subject_obj1 = Subject("Mathematics")
        subject_obj2 = Subject("Mathematics")

        book_obj1 = Book("Introduction to Python", 100.0)
        book_obj2 = Book("Introduction to Python",100.0)

        student_obj1 = Student("Krishna")
        student_obj2 = Student("Krishna")

        result_obj1 = Result(8.75)
        result_obj2 = Result(8.75)

        self.assertEqual(department_obj1, department_obj2)
        self.assertNotEqual(subject_obj1, subject_obj2)
        self.assertNotEqual(book_obj1, book_obj2)
        self.assertNotEqual(student_obj1, student_obj2)
        self.assertNotEqual(result_obj1, result_obj2)
       

if __name__ == '__main__':
    unittest.main()
