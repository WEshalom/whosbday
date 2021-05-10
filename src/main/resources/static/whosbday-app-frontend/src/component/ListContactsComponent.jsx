import { Component } from "react";
import ContactDataService from "../service/ContactDataService";

class ListContactsComponent extends Component{

    constructor(props) {
        super(props)
        this.state = {
            contacts: [],
            message: null
        }
        this.refreshContacts = this.refreshContacts.bind(this)
    }

    componentDidMount() {
        this.refreshContacts();
    }

    refreshContacts() {
        ContactDataService.retrieveAllContacts()
            .then(
                response => {
                    console.log(response);
                    this.setState({contacts: response.data})
                }
            )
    }

    render() {
        return (
            <div className="container">
                <h3>All Contacts</h3>
                <table className="table">
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.contacts.map(
                                contact =>
                                    <tr key={contact.id}>
                                        <td>{contact.id}</td>
                                        <td>{contact.}</td>
                                    </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}

export default ListContactsComponent