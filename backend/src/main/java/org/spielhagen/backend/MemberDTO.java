package org.spielhagen.backend;

import java.time.LocalDate;

public class MemberDTO {

    private String id; // MongoDB ObjectId wird als String dargestellt
    private Long mitgliedsnummer;
    private String anrede;
    private String vorname;
    private String nachname;
    private LocalDate geburtsdatum;
    private LocalDate austrittsdatum;
    private Boolean bezahlt;
    private LocalDate eintrittsdatum;
    private String festnetz;
    private String fischereischeinnummer;
    private String handy;
    private String email;
    private Integer plz;
    private String stadt;
    private String status;
    private String strasse;
    private LocalDate fischereischeinablaufdatum;

    public MemberDTO() {
        // Default-Konstruktor ist erforderlich
    }

    // Konstruktor mit allen Feldern
    public MemberDTO(String id, Long mitgliedsnummer, String anrede, String vorname, String nachname, LocalDate geburtsdatum, LocalDate austrittsdatum, Boolean bezahlt, LocalDate eintrittsdatum, String festnetz, String fischereischeinnummer, String handy, Integer plz, String stadt, String status, String strasse, LocalDate fischereischeinablaufdatum) {
        this.id = id;
        this.mitgliedsnummer = mitgliedsnummer;
        this.anrede = anrede;
        this.vorname = vorname;
        this.nachname = nachname;
        this.strasse = strasse;
        this.plz = plz;
        this.stadt = stadt;
        this.festnetz = festnetz;
        this.handy = handy;
        this.email = email;
        this.geburtsdatum = geburtsdatum;
        this.austrittsdatum = austrittsdatum;
        this.eintrittsdatum = eintrittsdatum;
        this.bezahlt = bezahlt;
        this.fischereischeinnummer = fischereischeinnummer;
        this.status = status;
        this.fischereischeinablaufdatum = fischereischeinablaufdatum;
    }

    // Getter und Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getMitgliedsnummer() {
        return mitgliedsnummer;
    }

    public void setMitgliedsnummer(Long mitgliedsnummer) {
        this.mitgliedsnummer = mitgliedsnummer;
    }

    public String getAnrede() {
        return anrede;
    }

    public void setAnrede(String anrede) {
        this.anrede = anrede;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public Integer getPlz() {
        return plz;
    }

    public void setPlz(Integer plz) {
        this.plz = plz;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    public String getFestnetz() {
        return festnetz;
    }

    public void setFestnetz(String festnetz) {
        this.festnetz = festnetz;
    }

    public String getHandy() {
        return handy;
    }

    public void setHandy(String handy) {
        this.handy = handy;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getGeburtsdatum() {
        return geburtsdatum;
    }

    public void setGeburtsdatum(LocalDate geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    public LocalDate getEintrittsdatum() {
        return eintrittsdatum;
    }

    public void setEintrittsdatum(LocalDate eintrittsdatum) {
        this.eintrittsdatum = eintrittsdatum;
    }

    public LocalDate getAustrittsdatum() {
        return austrittsdatum;
    }

    public void setAustrittsdatum(LocalDate austrittsdatum) {
        this.austrittsdatum = austrittsdatum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getBezahlt() {
        return bezahlt;
    }

    public void setBezahlt(Boolean bezahlt) {
        this.bezahlt = bezahlt;
    }

    public String getFischereischeinnummer() {
        return fischereischeinnummer;
    }

    public void setFischereischeinnummer(String fischereischeinnummer) {
        this.fischereischeinnummer = fischereischeinnummer;
    }

    public LocalDate getFischereischeinablaufdatum() {
        return fischereischeinablaufdatum;
    }

    public void setFischereischeinablaufdatum(LocalDate fischereischeinablaufdatum) {
        this.fischereischeinablaufdatum = fischereischeinablaufdatum;
    }

    // Fügen Sie hier weitere Getter und Setter hinzu

    // Beachten Sie, dass für die LocalDate Felder ein entsprechender Konverter implementiert werden muss,
    // um das Datum aus dem JSON in das LocalDate-Format zu konvertieren und umgekehrt.
}