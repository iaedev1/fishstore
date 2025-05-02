package org.vaadin.example.bookstore.backend.data;

/**
 * Represents the different types of fish products available in the store.
 */
public enum ProductType {
    FRESH("Fresh"),
    FROZEN("Frozen"),
    SMOKED("Smoked"),
    CANNED("Canned"),
    DRIED("Dried"),
    LIVE("Live"),
    FILLET("Fillet"),
    WHOLE("Whole"),
    STEAKS("Steaks");

    private final String displayName;

    ProductType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
