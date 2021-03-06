package de.diedavids.sneferu.components.descriptor;


import com.haulmont.cuba.gui.components.PopupButton;
import de.diedavids.sneferu.components.testapi.GenericComponentTestAPI;

public class PopupButtonComponentDescriptor
        extends GenericComponentDescriptor<PopupButton, GenericComponentTestAPI<PopupButton>> {

    public PopupButtonComponentDescriptor(String componentId) {
        super(PopupButton.class, componentId);
    }

    @Override
    public GenericComponentTestAPI<PopupButton> createTestAPI(PopupButton component) {
        return new GenericComponentTestAPI<>(component);
    }
}