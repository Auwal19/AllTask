#from unittest import TestCase
#class TestContactApp(TestCase):

import unittest
from contact_app_function import create_contact, contacts_clear
class TestContactApp(unittest.TestCase):
#import contact_app_funtion


    def test_that_newContact_canBeCreated_andSaved(self):

        contacts_clear()

        first_name = "Daniel"
        last_name = "messiah"
        phone_number = "091727627"

        contact = create_contact(first_name, last_name, phone_number)
        self.assertEqual(type(contact), list)
        self.assertEqual(len(contact), 3)
        self.assertEqual("091727627", contact[-1])

    def test_that_duplicate_contacts_cannot_br_created(self):

        contacts_clear()
        
        first_name = "John"
        last_name = "Job"
        phone_number = "091727627"
        
        create_contact(first_name,last_name,phone_number)

        first_name = "James"
        last_name = "Mathew"
        phone_number = "091727627"

        contact = create_contact(first_name,last_name,phone_number)

        self.assertIsNone(contact)
    
