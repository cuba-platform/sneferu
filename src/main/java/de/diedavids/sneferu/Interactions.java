package de.diedavids.sneferu;

import com.haulmont.cuba.core.entity.Entity;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.screen.CloseAction;
import com.haulmont.cuba.gui.screen.EditorScreen;
import de.diedavids.sneferu.components.ComponentDescriptor;
import de.diedavids.sneferu.components.descriptor.TabsheetComponentDescriptor;
import de.diedavids.sneferu.components.testapi.ComponentTestAPI;
import de.diedavids.sneferu.interactions.CancelEditorInteraction;
import de.diedavids.sneferu.interactions.ClickInteraction;
import de.diedavids.sneferu.interactions.CloseEditorInteraction;
import de.diedavids.sneferu.interactions.CloseInputDialogInteraction;
import de.diedavids.sneferu.interactions.EntityValueInteraction;
import de.diedavids.sneferu.interactions.GetValueInteraction;
import de.diedavids.sneferu.interactions.OpenTabInteraction;
import de.diedavids.sneferu.interactions.ScreenOpenModeInteraction;
import de.diedavids.sneferu.interactions.SelectInListInteraction;
import de.diedavids.sneferu.interactions.SetValueInteraction;
import java.util.Collection;

/**
 * Factory methods for all interactions of the Interactions API of sneferu.
 *
 * Normally should be included via a static import like:
 *
 * &gt;s import static de.diedavids.sneferu.Interactions.*
 */
public class Interactions {


    /**
     * creates a set value interaction, that sets a value on a given component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param value the value that should be set
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a SetValueInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> SetValueInteraction setValue(
            ComponentDescriptor<C, F> componentDescriptor,
            Object value
    ) {
        return new SetValueInteraction(componentDescriptor, value);
    }

    /**
     * alias for setValue interaction
     *
     * creates a set value interaction, that sets a value on a given component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param value the value that should be set
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a SetValueInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> SetValueInteraction select(
            ComponentDescriptor<C, F> componentDescriptor,
            Object value
    ) {
        return setValue(componentDescriptor, value);
    }



    /**
     * creates a select in list interaction, that selects a value on a given list component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param value the value that should be selected
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     * @param <E> type of the Entity to select
     *
     * @return a SelectInListInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>, E extends Entity> SelectInListInteraction selectInList(
        ComponentDescriptor<C, F> componentDescriptor,
        E value
    ) {
        return new SelectInListInteraction(componentDescriptor, value);
    }

    /**
     * creates a select in list interaction, that selects a list of values on a given list component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param values the values that should be selected
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     * @param <E> type of the Entity to select
     *
     * @return a SelectInListInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>, E extends Entity> SelectInListInteraction selectInList(
        ComponentDescriptor<C, F> componentDescriptor,
        Collection<E> values
    ) {
        return new SelectInListInteraction(componentDescriptor, values);
    }


    /**
     * alias for setValue interaction
     *
     * creates a set value interaction, that sets a value on a given component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param value the value that should be set
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a SetValueInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> SetValueInteraction enter(
            ComponentDescriptor<C, F> componentDescriptor,
            Object value
    ) {
        return setValue(componentDescriptor, value);
    }



    /**
     * creates a open tab interactions, that opens a tab for a given TabSheet component
     *
     * @param tabSheet the tabSheet component descriptor describing the component to act upon
     * @param tabId the tab that should be opened
     *
     * @return a OpenTabInteraction instance
     */
    public static OpenTabInteraction openTab(TabsheetComponentDescriptor tabSheet, String tabId) {
        return new OpenTabInteraction(tabSheet, tabId);
    }

    /**
     * creates a Entity Value Interaction, that fetches a given entity attribute via its StandardEditor
     *
     * @param attribute the attribute to retrieve
     * @param type the type of the Attribute
     * @param <T> type of the Attribute
     *
     * @return an EditorValueInteraction instance containing the value
     */
    public static <T extends Object> EntityValueInteraction<T> entityValue(String attribute, Class<T> type) {
        return new EntityValueInteraction<>(attribute, type);
    }

    /**
     * creates a get value interaction, that gets a value on a given component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a SetValueInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> GetValueInteraction getValue(
        ComponentDescriptor<C, F> componentDescriptor
    ) {
        return new GetValueInteraction(componentDescriptor);
    }

    /**
     * alias for getValue interaction
     *
     * creates a get value interaction, that gets a value on a given component
     *
     * @param componentDescriptor the component descriptor describing the component to act upon
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a GetValueInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> GetValueInteraction componentValue(
        ComponentDescriptor<C, F> componentDescriptor
    ) {
        return getValue(componentDescriptor);
    }

    /**
     * creates a Close Editor interaction, that closes an editor with the Close and Commit Close Action {@link EditorScreen#WINDOW_COMMIT_AND_CLOSE}
     *
     * @return a CloseEditorInteraction instance
     */
    public static CloseEditorInteraction closeEditor() {
        return new CloseEditorInteraction();
    }


    /**
     * creates a Close Input Dialog Interaction, that closes an input dialog with its default action
     *
     * @return a CloseInputDialogInteraction instance
     */
    public static CloseInputDialogInteraction closeInputDialog() {
        return new CloseInputDialogInteraction();
    }

    /**
     * creates a Close Input Dialog Interaction, that closes an input dialog with a particular close action
     *
     * @param closeAction the close action to use
     *
     * @return a CloseInputDialogInteraction instance
     */
    public static CloseInputDialogInteraction closeInputDialogWith(CloseAction closeAction) {
        return new CloseInputDialogInteraction(closeAction);
    }


    /**
     * creates a Cancel Editor interaction, that closes an editor with the Close Action {@link EditorScreen#WINDOW_CLOSE}
     *
     * @return a CancelEditorInteraction instance
     */
    public static CancelEditorInteraction cancelEditor() {
        return new CancelEditorInteraction();
    }


    /**
     * creates a Screen Open Mode interaction, that provides information about the OpenMode of the Screen
     *
     * @return a ScreenOpenModeInteraction instance
     */
    public static ScreenOpenModeInteraction screenOpenMode() {
        return new ScreenOpenModeInteraction();
    }


    /**
     * creates a click interaction, that clicks on a given component
     *
     * @param componentDescriptor the component to click on
     * @param <C> type of the Component
     * @param <F> type of the Component Test API
     *
     * @return a ClickInteraction instance
     */
    public static <C extends Component, F extends ComponentTestAPI<C>> ClickInteraction click(
        ComponentDescriptor<C, F> componentDescriptor
    ) {
        return new ClickInteraction(componentDescriptor);
    }
}
