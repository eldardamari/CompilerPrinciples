import sexprs
import unittest

__author__ = 'Dror'

class TestSexprs(unittest.TestCase):

    def test_negative_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('-5')
        self.assertEqual(str(sexpr) , '-5')
        self.assertEqual(str(remaining) , '')

    def test_positive_with_leadingZeros(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString(';sdfsdfsd\\n+0088')
        self.assertEqual(str(sexpr) , '88')
        self.assertEqual(str(remaining) , '')

    def test_leadingZeros(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0088')
        self.assertEqual(str(sexpr) , '88')
        self.assertEqual(str(remaining) , '')

    def test_positive_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('123')
        self.assertEqual(str(sexpr) , '123')
        self.assertEqual(str(remaining) , '')

    def test_zero(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0')
        self.assertEqual(str(sexpr) , '0')
        self.assertEqual(str(remaining) , '')

    def test_hexadecimal_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0x10')
        self.assertEqual(str(sexpr) , '16')
        self.assertEqual(str(remaining) , '')

    def test_neg_hexadecimal_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('-0xff')
        self.assertEqual(str(sexpr) , '-255')

    def test_pos_hexadecimal_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('+0H20')
        self.assertEqual(str(sexpr) , '32')
        self.assertEqual(str(remaining) , '')

    def test_letters_hexadecimal_number(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0haa')
        self.assertEqual(str(sexpr) , '170')
        self.assertEqual(str(remaining) , '')

    def test_negative_fraction(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('-24/-43')
        self.assertEqual(str(sexpr) , '24/43')
        self.assertEqual(str(remaining) , '')

    def test_positive_fraction(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0X11/43')
        self.assertEqual(str(sexpr) , '17/43')
        self.assertEqual(str(remaining) , '')

    def test_zero_fraction(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('0/43')
        self.assertEqual(str(sexpr) , '0')
        self.assertEqual(str(remaining) , '')

    def test_pos_fraction(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('+5/7')
        self.assertEqual(str(sexpr) , '5/7')
        self.assertEqual(str(remaining) , '')

    def test_nil(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('()')
        self.assertEqual(str(sexpr) , '()')
        self.assertEqual(str(remaining) , '')

    def test_pair(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('(5)')
        self.assertEqual(str(sexpr) , '(5)')
        self.assertEqual(str(remaining) , '')

    def test_improper_pair(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('(5 . 7)')
        self.assertEqual(str(sexpr) , '(5 . 7)')
        self.assertEqual(str(remaining) , '')

    def test_proper_list(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('(5 6 ( 1 ;sdfsdfsd\\n ;sdfsdfsd\\n  2 ) 7)')
        self.assertEqual(str(sexpr) , '(5 6 (1 2) 7)')
        self.assertEqual(str(remaining) , '')

    def test_improper_list(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('(5 6 . 7)')
        self.assertEqual(str(sexpr) , '(5 6 . 7)')
        self.assertEqual(str(remaining) , '')

    def test_vector(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('#(1 2)')
        self.assertEqual(str(sexpr) , '#(1 2)')
        self.assertEqual(str(remaining) , '')

    def test_symbol(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString('a')
        self.assertEqual(str(sexpr) , 'A')
        self.assertEqual(str(remaining) , '')

    def test_symbol(self):
        sexpr , remaining = sexprs.AbstractSexpr.readFromString("'a")
        self.assertEqual(str(sexpr) , '(QUOTE A)')
        self.assertEqual(str(remaining) , '')

if __name__ == '__main__':
     unittest.main()
