import React from 'react'
import {Link} from 'react-router-dom'

const Header = (props) => {

    return (
        <header>
            <nav className="navbar navbar-expand-md navbar-dark navbar-fixed bg-dark ps-3">
                <a className="navbar-brand" href="/accommodations">Airbnb Application</a>
                <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
                        aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarCollapse">
                    <ul className="navbar-nav mr-auto">
                        <li className="nav-item active">
                            <Link className="nav-link" to={"/accommodationsPageable"}>Accommodations</Link>
                        </li>
                        <li className="nav-item active">
                            <Link className="nav-link" to={"/categories"}>Categories</Link>
                        </li>
                        <li className="nav-item active">
                            <Link className={"nav-link"} to={"/addAccommodation"}>Add new Accommodation</Link>
                        </li>
                        <li className="nav-item active">
                            <Link className={"nav-link"} to={"/hosts"}>Hosts</Link>
                        </li>
                    </ul>
                    {/*<form className="form-inline mt-2 mt-md-0 ml-3">*/}
                    {/*    {authenticate}*/}
                    {/*</form>*/}
                </div>
            </nav>
        </header>
    )


}

export default Header