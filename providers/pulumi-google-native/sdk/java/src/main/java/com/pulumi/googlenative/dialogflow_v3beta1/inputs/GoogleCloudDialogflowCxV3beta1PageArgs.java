// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1EventHandlerArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FormArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1FulfillmentArgs;
import com.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1TransitionRouteArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dialogflow CX conversation (session) can be described and visualized as a state machine. The states of a CX session are represented by pages. For each flow, you define many pages, where your combined pages can handle a complete conversation on the topics the flow is designed for. At any given moment, exactly one page is the current page, the current page is considered active, and the flow associated with that page is considered active. Every flow has a special start page. When a flow initially becomes active, the start page page becomes the current page. For each conversational turn, the current page will either stay the same or transition to another page. You configure each page to collect information from the end-user that is relevant for the conversational state represented by the page. For more information, see the [Page guide](https://cloud.google.com/dialogflow/cx/docs/concept/page).
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1PageArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1PageArgs Empty = new GoogleCloudDialogflowCxV3beta1PageArgs();

    /**
     * The human-readable name of the page, unique within the agent.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * The fulfillment to call when the session is entering the page.
     * 
     */
    @Import(name="entryFulfillment")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> entryFulfillment;

    public Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> entryFulfillment() {
        return this.entryFulfillment == null ? Codegen.empty() : this.entryFulfillment;
    }

    /**
     * Handlers associated with the page to handle events such as webhook errors, no match or no input.
     * 
     */
    @Import(name="eventHandlers")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;

    public Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers() {
        return this.eventHandlers == null ? Codegen.empty() : this.eventHandlers;
    }

    /**
     * The form associated with the page, used for collecting parameters relevant to the page.
     * 
     */
    @Import(name="form")
      private final @Nullable Output<GoogleCloudDialogflowCxV3beta1FormArgs> form;

    public Output<GoogleCloudDialogflowCxV3beta1FormArgs> form() {
        return this.form == null ? Codegen.empty() : this.form;
    }

    /**
     * The unique identifier of the page. Required for the Pages.UpdatePage method. Pages.CreatePage populates the name automatically. Format: `projects//locations//agents//flows//pages/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Ordered list of `TransitionRouteGroups` associated with the page. Transition route groups must be unique within a page. * If multiple transition routes within a page scope refer to the same intent, then the precedence order is: page&#39;s transition route -&gt; page&#39;s transition route group -&gt; flow&#39;s transition routes. * If multiple transition route groups within a page contain the same intent, then the first group in the ordered list takes precedence. Format:`projects//locations//agents//flows//transitionRouteGroups/`.
     * 
     */
    @Import(name="transitionRouteGroups")
      private final @Nullable Output<List<String>> transitionRouteGroups;

    public Output<List<String>> transitionRouteGroups() {
        return this.transitionRouteGroups == null ? Codegen.empty() : this.transitionRouteGroups;
    }

    /**
     * A list of transitions for the transition rules of this page. They route the conversation to another page in the same flow, or another flow. When we are in a certain page, the TransitionRoutes are evalauted in the following order: * TransitionRoutes defined in the page with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in flow with intent specified. * TransitionRoutes defined in the transition route groups with intent specified. * TransitionRoutes defined in the page with only condition specified. * TransitionRoutes defined in the transition route groups with only condition specified.
     * 
     */
    @Import(name="transitionRoutes")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

    public Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes() {
        return this.transitionRoutes == null ? Codegen.empty() : this.transitionRoutes;
    }

    public GoogleCloudDialogflowCxV3beta1PageArgs(
        Output<String> displayName,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> entryFulfillment,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers,
        @Nullable Output<GoogleCloudDialogflowCxV3beta1FormArgs> form,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> transitionRouteGroups,
        @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.entryFulfillment = entryFulfillment;
        this.eventHandlers = eventHandlers;
        this.form = form;
        this.name = name;
        this.transitionRouteGroups = transitionRouteGroups;
        this.transitionRoutes = transitionRoutes;
    }

    private GoogleCloudDialogflowCxV3beta1PageArgs() {
        this.displayName = Codegen.empty();
        this.entryFulfillment = Codegen.empty();
        this.eventHandlers = Codegen.empty();
        this.form = Codegen.empty();
        this.name = Codegen.empty();
        this.transitionRouteGroups = Codegen.empty();
        this.transitionRoutes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1PageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> displayName;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> entryFulfillment;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers;
        private @Nullable Output<GoogleCloudDialogflowCxV3beta1FormArgs> form;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> transitionRouteGroups;
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1PageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.entryFulfillment = defaults.entryFulfillment;
    	      this.eventHandlers = defaults.eventHandlers;
    	      this.form = defaults.form;
    	      this.name = defaults.name;
    	      this.transitionRouteGroups = defaults.transitionRouteGroups;
    	      this.transitionRoutes = defaults.transitionRoutes;
        }

        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder entryFulfillment(@Nullable Output<GoogleCloudDialogflowCxV3beta1FulfillmentArgs> entryFulfillment) {
            this.entryFulfillment = entryFulfillment;
            return this;
        }
        public Builder entryFulfillment(@Nullable GoogleCloudDialogflowCxV3beta1FulfillmentArgs entryFulfillment) {
            this.entryFulfillment = Codegen.ofNullable(entryFulfillment);
            return this;
        }
        public Builder eventHandlers(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs>> eventHandlers) {
            this.eventHandlers = eventHandlers;
            return this;
        }
        public Builder eventHandlers(@Nullable List<GoogleCloudDialogflowCxV3beta1EventHandlerArgs> eventHandlers) {
            this.eventHandlers = Codegen.ofNullable(eventHandlers);
            return this;
        }
        public Builder eventHandlers(GoogleCloudDialogflowCxV3beta1EventHandlerArgs... eventHandlers) {
            return eventHandlers(List.of(eventHandlers));
        }
        public Builder form(@Nullable Output<GoogleCloudDialogflowCxV3beta1FormArgs> form) {
            this.form = form;
            return this;
        }
        public Builder form(@Nullable GoogleCloudDialogflowCxV3beta1FormArgs form) {
            this.form = Codegen.ofNullable(form);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder transitionRouteGroups(@Nullable Output<List<String>> transitionRouteGroups) {
            this.transitionRouteGroups = transitionRouteGroups;
            return this;
        }
        public Builder transitionRouteGroups(@Nullable List<String> transitionRouteGroups) {
            this.transitionRouteGroups = Codegen.ofNullable(transitionRouteGroups);
            return this;
        }
        public Builder transitionRouteGroups(String... transitionRouteGroups) {
            return transitionRouteGroups(List.of(transitionRouteGroups));
        }
        public Builder transitionRoutes(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs>> transitionRoutes) {
            this.transitionRoutes = transitionRoutes;
            return this;
        }
        public Builder transitionRoutes(@Nullable List<GoogleCloudDialogflowCxV3beta1TransitionRouteArgs> transitionRoutes) {
            this.transitionRoutes = Codegen.ofNullable(transitionRoutes);
            return this;
        }
        public Builder transitionRoutes(GoogleCloudDialogflowCxV3beta1TransitionRouteArgs... transitionRoutes) {
            return transitionRoutes(List.of(transitionRoutes));
        }        public GoogleCloudDialogflowCxV3beta1PageArgs build() {
            return new GoogleCloudDialogflowCxV3beta1PageArgs(displayName, entryFulfillment, eventHandlers, form, name, transitionRouteGroups, transitionRoutes);
        }
    }
}
