import axios from 'axios'

const USER = 'shadina'
const ALL_CONTACTS_API_URL = 'http://localhost:5000/api/v1/contacts/'

class ContactDataService{

    retrieveAllContacts(){
        return axios.get('ALL_CONTACTS_API_URL');
    }
}

export default new ContactDataService()
