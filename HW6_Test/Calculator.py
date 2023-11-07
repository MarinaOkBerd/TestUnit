class Calculator():

    @classmethod
    def get_avg_calculator(cls, lst):
        avg = 0
        for i in lst:
            avg += i
        return avg / len(lst)

    @classmethod
    def find_list_avg(cls, lst1, lst2):
        avg1 = Calculator.get_avg_calculator(lst1)
        avg2 = Calculator.get_avg_calculator(lst2)
        if avg1 < avg2:
            return 'Второй список имеет большее среднее значение.'
        elif avg1 > avg2:
            return 'Первый список имеет большее среднее значение.'
        else:
            return 'Оба списка имеют одинаковое среднее значение.'

