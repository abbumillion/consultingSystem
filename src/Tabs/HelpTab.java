package Tabs;

import ViewsBase.SubView;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;

public class HelpTab extends SubView {

    Label systemDescriptionLabel;

    ScrollPane scrollPane;

    @Override
    public void init() {
        //.............................................................................................
        titleLabel = new Label("System Description");
        systemDescriptionLabel = new Label("System Description Label this system was developed by"
                + "Million Sharbe and Mintesnot Desta\n"
                + "The consulting industry is one of the fastest growing"
                + " business sectors worldwide "
                + "with new opportunities emerging continually in hundreds of different fields.\n Software "
                + "consulting and recruiting agencies match the requirements of the client firms with the "
                + "skills of their employees and set up the interview between their employees and the client "
                + "firm.\n Interviews are then conducted, and the candidates selected in the interview are "
                + "recruited as consultants or contractors in the client’s firm for the duration of the project "
                + "(job). \n"
                + "This project examines the issues related to dynamic Human Resource\n"
                + "Management and implements a desktop and mobile application for a fictitious consulting firm that "
                + "participates in the placement of contractors in different organizations.\n The system is "
                + "implemented using a 2-tier approach, with a backend database MySQL database and "
                + " and a front "
                + "end javafx application with MVC pattern.\n This report also discusses each of the underlying technologies "
                + "used to create and implement the application.It is important to realize that many organizations are "
                + "no longer staffed entirely by "
                + "full time permanent employees. \nActivities previously done within firms are now"
                + "accomplished externally by other businesses that specialize in those functions.\n The above "
                + "factor has created rapid growth in many business sectors including computer and data "
                + "processing services.\n"
                + "Large organizations frequently have a mixture of permanent employees and"
                + "staffing based on Alternative Employment Structures (AES).\n The most significant"
                + "categories of AES are outsourcing and consulting.\n “Nearly four out of five employers "
                + "use some form of nontraditional staffing arrangement”. The non-traditional"
                + "workforce, defined by U.S. Department of Labor, Bureau of Labor Statistics (BLS) \n"
                + "includes multiple jobholders, contingent and part-time workers, people in alternate work "
                + "arrangements, independent contractors/consultants and employees of contract companies. "
                + "According to the Bureau of Labor Statistics (BLS) the non-traditional workforce is \n"
                + "expected to grow by almost 50 percent from 2000 to 2010, compared to a 15 percent "
                + "increase in permanent workers during the same time .\n"
                + "The computer industry and its related services are expected to experience rapid "
                + "growth, adding 453,000 jobs between 2004 and 2014 . As computers and software \n"
                + "become more complex, support specialists will be needed to provide technical assistance "
                + "to customers and other users. This in turn will increase the demand for consultants in the \n"
                + "area of computers and software management. \n"
                + "As more companies seek to meet their technical needs by employing consultants,"
                + "there is a growing demand for software tools, which will aid in dealing with the\n"
                + "complexities of this new human resource management model. Over the past few years "
                + "many vendors have created different software solutions for recruiting. Some of the \n"
                + "available software solutions include, cBizOne , Attract Recruiter  and"
                + "PCRecruiter."
                + "\n"
                + "Most of these solutions provide features such as"
                + "· Employee database with the advanced search option\n"
                + "· Company database with the advanced search option"
                + "· Job search capability\n"
                + "· Interview scheduling\n"
                + "· contracts management \n"
                + "· performance reports \n"
                + "These solutions can also be customized wherein any of the above mentioned \n"
                + "features can be selected to suit the recruiting company’s business needs. A package that "
                + "includes a minimum set of features could cost approximately $1000 per user. A small size \n"
                + "consulting firm has a minimum of 5 to 10 administrators who need to be registered "
                + "users for the application products, in order to perform different tasks needed for their \n"
                + "consulting firm. Additional features such as automated e-mail notification and calendar "
                + "updates can be added for an additional price, which makes this an increasingly expensive \n"
                + "product to purchase."
                + "This project implements features such as employee database, company\n"
                + "management, interview planning and scheduling, job vacancies and contract management "
                + "and performance review reports, that are required to perform most of the operations in an \n"
                + "IT consulting firm."
                + ""
                + " DESIGN OF THE PROJECT\n"
                + "A consulting firm has three kinds of users that access the system, the Employee \n"
                + "Applicant, the Employer Contact and the Administrator. Employee Applicants are those "
                + "who apply for the jobs through the consultancy. The Applicant can update the existing \n"
                + "details in the Applicant’s database including their personal information, skills and"
                + "resume. Client is the company that seeks the services of the employees of a consulting \n"
                + "firm. A client firm may have many employees, Employer Contacts, which require "
                + "access to the system in order to add or update job or company information. The\n"
                + "Administrator matches the skills of its employee with the skills required by the client"
                + "company for a particular job and arranges an interview between the client contact and the \n"
                + "Applicant. After a successful interview process, the Administrator will facilitate the "
                + "consummation of the contract between the employee and employer. \n"
                + "To design the application, the relational database must be designed first. The data "
                + "model and the process model are part of the design process. The data model focuses on \n"
                + "how the database is structured while the process model deals with how the data is "
                + "processed. In the context of the relational database, the data model is used to design the \n"
                + "relational tables and the process model is used to design the queries that access and "
                + "perform operations on those tables. \n"
                + " "
                + " DATA MODEL\n"
                + "Data modeling is performed during the initial phases of the database development \n"
                + "process. The data model focuses mainly on what information should be stored in the "
                + "database. The information needed to build the data model is gathered during the\n"
                + "requirement analysis. A comprehensive data model should take into account the current "
                + "and future needs of an organization in order to support the business process within an \n"
                + "organization."
                + "\n"
                + "To develop an effective web-based application for Human Resource Management, \n"
                + "a consulting firm must maintain accurate and up to date information about companies and "
                + "their prospective jobs as well as potential employees, including their skills and\n"
                + "availability for employment."
                + "In order to accommodate the above requirements a data model must be designed \n"
                + "that captures the essential entities and relationship that are present in a Human Resource"
                + "Management application. An Entity Relationship Diagram (ERD) gives a graphical\n"
                + "representation of the tables (entities) in the database and the relation between them."
                + "The entities are represented by a “rectangle”, while a “diamond” represents the \n"
                + "relation between them and a diamond within a rectangle represents an associate entity. "
                + "The cardinality is the frequency of a relationship between two entities. The types of \n"
                + "cardinality are "
                + "· one to one , every record in entity A matches exactly one record in entity B \n"
                + "and every record in B matches exactly one record in A, "
                + "· one to many (1: M), every record in A matches zero or more records in B and \n"
                + "every record in B matches exactly one record in A, and "
                + "· many to many (M: M), every record in A matches zero or more records in B and \n"
                + "every record in B matches zero or more records in A."
                + "If there is a many to many relationship between two entities, then the relationship \n"
                + "between them is represented as Associative Entities. Figure 1 shows the data model for "
                + "this application.");
        systemDescriptionLabel.setId("font-14");
        titleLabel.setId("font-24");
        scrollPane = new ScrollPane();
        //...............
    }

    @Override
    public void addChildren() {
        //
        v1.getChildren().addAll(titleLabel, systemDescriptionLabel);
        scrollPane.setContent(v1);
        getChildren().add(scrollPane);
        //
    }

    @Override
    public void bindings() {
        //
        systemDescriptionLabel.prefWidthProperty().bind(scrollPane.widthProperty());
        //  systemDescriptionLabel.prefHeightProperty().bind(scrollPane.heightProperty());
        //
        // v1.prefHeightProperty().bind(heightProperty());
        v1.prefWidthProperty().bind(widthProperty());
        //
        // scrollPane.prefHeightProperty().bind(heightProperty());
        // scrollPane.prefWidthProperty().bind(v1.widthProperty());
        //
    }

    @Override
    public void alignElements() {
        //
        v1.setAlignment(Pos.CENTER);
        systemDescriptionLabel.setAlignment(Pos.CENTER);
        //
    }

}
