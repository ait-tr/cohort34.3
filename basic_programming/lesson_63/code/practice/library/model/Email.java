package practice.library.model;

import java.util.Objects;

public class Email {
    private String email; // адрес
    private String subject; // тема
    private String text; // текст

    public Email(String email, String subject, String text) {
        this.email = email;
        this.subject = subject;
        this.text = text;
    }

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email1 = (Email) o;
        return Objects.equals(email, email1.email) && Objects.equals(subject, email1.subject) && Objects.equals(text, email1.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, subject, text);
    }

    @Override
    public String toString() {
        return "Email{" +
                "email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
