package com.iastraining.fundamentals.entity;

import jakarta.persistence.*;

@Entity
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private java.lang.Integer id;
    private java.lang.String title;
    private java.lang.String description;
    @ManyToOne
    @JoinColumn(name = "application_id")
    private Application application;
    @ManyToOne
    @JoinTable(name = "ticket_release", joinColumns = {@JoinColumn(name = "ticket_fk")}, inverseJoinColumns = {@JoinColumn(name = "release_fk")})
    private Release release;
    private java.lang.String status;

    public Ticket() { /* compiled code */ }

    public Ticket(java.lang.String title, java.lang.String description, Application application, Release release, java.lang.String status) { /* compiled code */ }

    public java.lang.String getStatus() { /* compiled code */
        return "";
    }

    public void setStatus(java.lang.String status) { /* compiled code */ }

    public java.lang.Integer getId() { /* compiled code */
        return 0;
    }

    public void setId(java.lang.Integer id) { /* compiled code */ }

    public java.lang.String getTitle() { /* compiled code */
        return "";
    }

    public void setTitle(java.lang.String title) { /* compiled code */ }

    public java.lang.String getDescription() { /* compiled code */
        return "";
    }

    public void setDescription(java.lang.String description) { /* compiled code */ }

    public Application getApplication() { /* compiled code */
        return null;
    }

    public void setApplication(Application application) { /* compiled code */ }

    public Release getRelease() { /* compiled code */
        return null;
    }

    public void setRelease(Release release) { /* compiled code */ }
}
