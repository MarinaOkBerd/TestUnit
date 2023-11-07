import unittest

from Calculator import Calculator


class TestCalculator(unittest.TestCase):
    def test_get_avg_calculator(self):
        self.assertEqual(Calculator.get_avg_calculator((2, 4, 6)), 4)

    def test_find_list_avg(self):
        self.assertEqual(Calculator.find_list_avg((1, 2, 7), (1, 2, 6)), "Первый список имеет большее среднее значение.")
        self.assertEqual(Calculator.find_list_avg((1, 2, 3), (10, 1, 7)),"Второй список имеет большее среднее значение.")
        self.assertEqual(Calculator.find_list_avg((1, 2, 3), (0, 2, 4)), "Оба списка имеют одинаковое среднее значение.")