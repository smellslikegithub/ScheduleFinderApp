package org.example.Models;

import java.util.UUID;

public class TimeSlotType {
    private UUID id;
    private String name;
    private Integer slot_size;
    private boolean public_bookable;
    private UUID clinic_id;
    private String color;
    private String icon;
    private String deleted;
    private Boolean out_of_office;
    private Boolean enabled;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    public Boolean getOut_of_office() {
        return out_of_office;
    }

    public void setOut_of_office(Boolean out_of_office) {
        this.out_of_office = out_of_office;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSlot_size() {
        return slot_size;
    }

    public void setSlot_size(Integer slot_size) {
        this.slot_size = slot_size;
    }

    public boolean isPublic_bookable() {
        return public_bookable;
    }

    public void setPublic_bookable(boolean public_bookable) {
        this.public_bookable = public_bookable;
    }

    public UUID getClinic_id() {
        return clinic_id;
    }

    public void setClinic_id(UUID clinic_id) {
        this.clinic_id = clinic_id;
    }

    @Override
    public String toString() {
        return "The TimeSlot Type => " + "id = " + id +
                ", name=" + name +
                ", slot_size=" + slot_size +
                ", is public bookable =" + public_bookable +
                ", clinic_id=" + clinic_id;
    }
}
