import unittest
import practica
class TestMyModule(unittest.TestCase):
    
    def test_sum(self):
        self.assertEqual(practica.suma(5), 15)
    #def test_main(self):
     #   self.assertEqual(practica.main(), None)
if __name__ == "__main__":
    unittest.main()