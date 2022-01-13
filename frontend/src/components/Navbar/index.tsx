import { ReactComponent as GithubIcon } from "../../assets/img/github.svg";
import './Navbar.css'
export const Navbar = () => {
    return(
        <header>
            <nav className="container">
                <div className="dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/lucasufc" target="_blank" rel="noreferrer">
                        <div className="dsmovie-contact-container">
                            <GithubIcon />
                            <p>/lucasufc</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}