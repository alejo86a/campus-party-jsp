# Campus Party JSP

A Java web application (JSP + Servlets) built as a university database/web-development exercise around the theme of a "Campus Party" tech event.

## What this is

This is a coursework project from **ITM (Instituto Tecnológico Metropolitano, Medellín, Colombia)**, judging by the Java package namespace `co.edu.itm.campusparty`. It's a small CRUD-style backend that queries a SQL Server database (`bd.sql` is a full database dump/schema export) to display information about:

- Attendees ("Campuseros") and their info
- Gaming rigs/computers ("Equipos Gamer") and their specs/history
- Hotels available for the event
- Cities
- Software manufacturers ("Fabricantes")

Each of these is exposed through a dedicated Java Servlet (e.g. `InfoCampuseroServlet`, `ListaHotelesServlet`, `HistorialEquiposGamerServlet`, `ListaFabricantesSoftwareServlet`) that's rendered by a single `index.jsp` page, with plain CSS/JS and jQuery for the front end.

## Tech stack

- **Java Servlets + JSP** (Java EE style web app, built as a WAR project intended for an app server such as Tomcat)
- **Maven** for dependency management (`pom.xml`)
- **Microsoft SQL Server** as the database (via the `mssql-jdbc` driver)
- Plain **jQuery**, CSS, and JS on the front end

## Running it

This needs a full Java EE environment and is not meant to run standalone:

1. Set up a SQL Server instance and restore the schema/data from `bd.sql`.
2. Configure the JDBC connection in `src/main/java/co/edu/itm/campusparty/config/Connector.java`.
3. Build the project with Maven (`mvn package`) to produce a WAR file.
4. Deploy the WAR to a servlet container (e.g. Apache Tomcat).
5. Open `index.jsp` in a browser once deployed.

## Honest context

This is a university assignment / learning exercise, not a production application. There's no automated testing, no CI, and the credentials/connection setup are meant to be filled in locally. Expect legacy patterns (raw JDBC, JSP with embedded Java, no framework like Spring).
