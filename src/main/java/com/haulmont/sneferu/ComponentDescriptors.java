package com.haulmont.sneferu;


import com.haulmont.sneferu.components.descriptor.ButtonComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.DateFieldComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.GroupTableComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.LookupFieldComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.PickerFieldComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.SuggestionFieldComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.TabsheetComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.TextFieldComponentDescriptor;
import com.haulmont.sneferu.components.descriptor.TextInputFieldComponentDescriptor;

/**
 * Factory methods for all Component Descriptors
 *
 * Normally should be included via a static import like:
 *
 * > import static com.haulmont.sneferu.ComponentDescriptors.*
 */
public class ComponentDescriptors {

    /**
     * creates a {@link GroupTableComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a GroupTableComponentDescriptor instance
     */
    public static GroupTableComponentDescriptor groupTable(String id) {
        return new GroupTableComponentDescriptor(id);
    }


    /**
     * creates a {@link TextFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a TextFieldComponentDescriptor instance
     */
    public static TextFieldComponentDescriptor textField(String id) {
        return new TextFieldComponentDescriptor(id);
    }

    /**
     * creates a {@link TextInputFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a TextInputFieldComponentDescriptor instance
     */
    public static TextInputFieldComponentDescriptor textInputField(String id) {
        return new TextInputFieldComponentDescriptor(id);
    }


    /**
     * creates a {@link LookupFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a LookupFieldComponentDescriptor instance
     */
    public static LookupFieldComponentDescriptor lookupField(String id) {
        return new LookupFieldComponentDescriptor(id);
    }

    /**
     * creates a {@link PickerFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a PickerFieldComponentDescriptor instance
     */
    public static PickerFieldComponentDescriptor pickerField(String id) {
        return new PickerFieldComponentDescriptor(id);
    }


    /**
     * creates a {@link DateFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a DateFieldComponentDescriptor instance
     */
    public static DateFieldComponentDescriptor dateField(String id) {
        return new DateFieldComponentDescriptor(id);
    }


    /**
     * creates a {@link SuggestionFieldComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a SuggestionFieldComponentDescriptor instance
     */
    public static SuggestionFieldComponentDescriptor suggestionField(String id) {
        return new SuggestionFieldComponentDescriptor(id);
    }


    /**
     * creates a {@link ButtonComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a ButtonComponentDescriptor instance
     */
    public static ButtonComponentDescriptor button(String id) {
        return new ButtonComponentDescriptor(id);
    }


    /**
     * creates a {@link TabsheetComponentDescriptor} instance
     * @param id the id of the component as defined in the screen XML descriptor
     * @return a TabsheetComponentDescriptor instance
     */
    public static TabsheetComponentDescriptor tabSheet(String id) {
        return new TabsheetComponentDescriptor(id);
    }

}
