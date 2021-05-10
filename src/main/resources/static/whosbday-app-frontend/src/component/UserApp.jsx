import React, { Component } from "react";
import ListContactsComponent from "./ListContactsComponent";

class UserApp extends Component{
    render() {
        return(<>
                <h1>User Application</h1>
                <ListContactsComponent/>
            </>
        )
    }
}

export default UserApp