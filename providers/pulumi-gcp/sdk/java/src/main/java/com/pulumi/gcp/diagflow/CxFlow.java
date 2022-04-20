// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.CxFlowArgs;
import com.pulumi.gcp.diagflow.inputs.CxFlowState;
import com.pulumi.gcp.diagflow.outputs.CxFlowEventHandler;
import com.pulumi.gcp.diagflow.outputs.CxFlowNluSettings;
import com.pulumi.gcp.diagflow.outputs.CxFlowTransitionRoute;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Flows represents the conversation flows when you build your chatbot agent.
 * 
 * To get more information about Flow, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/cx/docs/reference/rest/v3/projects.locations.agents.flows)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/cx/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Flow can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxFlow:CxFlow default {{parent}}/flows/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/cxFlow:CxFlow default {{parent}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/cxFlow:CxFlow")
public class CxFlow extends com.pulumi.resources.CustomResource {
    /**
     * The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the flow. The maximum length is 500 characters. If exceeded, the request is rejected.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * The human-readable name of the flow.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The human-readable name of the flow.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * A flow&#39;s event handlers serve two purposes:
     * They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     * They are inherited by every page&#39;s [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     * Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * Structure is documented below.
     * 
     */
    @Export(name="eventHandlers", type=List.class, parameters={CxFlowEventHandler.class})
    private Output<List<CxFlowEventHandler>> eventHandlers;

    /**
     * @return A flow&#39;s event handlers serve two purposes:
     * They are responsible for handling events (e.g. no match, webhook errors) in the flow.
     * They are inherited by every page&#39;s [event handlers][Page.event_handlers], which can be used to handle common events regardless of the current page. Event handlers defined in the page have higher priority than those defined in the flow.
     * Unlike transitionRoutes, these handlers are evaluated on a first-match basis. The first one that matches the event get executed, with the rest being ignored.
     * Structure is documented below.
     * 
     */
    public Output<List<CxFlowEventHandler>> eventHandlers() {
        return this.eventHandlers;
    }
    /**
     * The language of the following fields in flow:
     * Flow.event_handlers.trigger_fulfillment.messages
     * Flow.event_handlers.trigger_fulfillment.conditional_cases
     * Flow.transition_routes.trigger_fulfillment.messages
     * Flow.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    @Export(name="languageCode", type=String.class, parameters={})
    private Output</* @Nullable */ String> languageCode;

    /**
     * @return The language of the following fields in flow:
     * Flow.event_handlers.trigger_fulfillment.messages
     * Flow.event_handlers.trigger_fulfillment.conditional_cases
     * Flow.transition_routes.trigger_fulfillment.messages
     * Flow.transition_routes.trigger_fulfillment.conditional_cases
     * If not specified, the agent&#39;s default language is used. Many languages are supported. Note: languages must be enabled in the agent before they can be used.
     * 
     */
    public Output</* @Nullable */ String> languageCode() {
        return this.languageCode;
    }
    /**
     * - 
     * The unique identifier of this event handler.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return -
     * The unique identifier of this event handler.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * NLU related settings of the flow.
     * Structure is documented below.
     * 
     */
    @Export(name="nluSettings", type=CxFlowNluSettings.class, parameters={})
    private Output</* @Nullable */ CxFlowNluSettings> nluSettings;

    /**
     * @return NLU related settings of the flow.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ CxFlowNluSettings> nluSettings() {
        return this.nluSettings;
    }
    /**
     * The agent to create a flow for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    @Export(name="parent", type=String.class, parameters={})
    private Output</* @Nullable */ String> parent;

    /**
     * @return The agent to create a flow for.
     * Format: projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;.
     * 
     */
    public Output</* @Nullable */ String> parent() {
        return this.parent;
    }
    /**
     * A flow&#39;s transition route group serve two purposes:
     * They are responsible for matching the user&#39;s first utterances in the flow.
     * They are inherited by every page&#39;s [transition route groups][Page.transition_route_groups]. Transition route groups defined in the page have higher priority than those defined in the flow.
     * Format:projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;.
     * 
     */
    @Export(name="transitionRouteGroups", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> transitionRouteGroups;

    /**
     * @return A flow&#39;s transition route group serve two purposes:
     * They are responsible for matching the user&#39;s first utterances in the flow.
     * They are inherited by every page&#39;s [transition route groups][Page.transition_route_groups]. Transition route groups defined in the page have higher priority than those defined in the flow.
     * Format:projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent ID&gt;/flows/&lt;Flow ID&gt;/transitionRouteGroups/&lt;TransitionRouteGroup ID&gt;.
     * 
     */
    public Output</* @Nullable */ List<String>> transitionRouteGroups() {
        return this.transitionRouteGroups;
    }
    /**
     * A flow&#39;s transition routes serve two purposes:
     * They are responsible for matching the user&#39;s first utterances in the flow.
     * They are inherited by every page&#39;s [transition routes][Page.transition_routes] and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     * 
     */
    @Export(name="transitionRoutes", type=List.class, parameters={CxFlowTransitionRoute.class})
    private Output</* @Nullable */ List<CxFlowTransitionRoute>> transitionRoutes;

    /**
     * @return A flow&#39;s transition routes serve two purposes:
     * They are responsible for matching the user&#39;s first utterances in the flow.
     * They are inherited by every page&#39;s [transition routes][Page.transition_routes] and can support use cases such as the user saying &#34;help&#34; or &#34;can I talk to a human?&#34;, which can be handled in a common way regardless of the current page. Transition routes defined in the page have higher priority than those defined in the flow.
     * 
     */
    public Output</* @Nullable */ List<CxFlowTransitionRoute>> transitionRoutes() {
        return this.transitionRoutes;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CxFlow(String name) {
        this(name, CxFlowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CxFlow(String name, CxFlowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CxFlow(String name, CxFlowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxFlow:CxFlow", name, args == null ? CxFlowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CxFlow(String name, Output<String> id, @Nullable CxFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/cxFlow:CxFlow", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static CxFlow get(String name, Output<String> id, @Nullable CxFlowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CxFlow(name, id, state, options);
    }
}
