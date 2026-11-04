
contacts = []

def create_contact(first_name, last_name, phone_number):

    for contact in contacts:
        if contact[-1] == phone_number: 

            return None
    
    contact = []

    contact.append(first_name)
    contact.append(last_name)
    contact.append(phone_number)

    contacts.append(contact)

    return contact

def contacts_clear():
  contacts.clear()

    








#contacts.append(contact)
