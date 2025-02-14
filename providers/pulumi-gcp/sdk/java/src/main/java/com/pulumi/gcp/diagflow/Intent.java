// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.diagflow;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.diagflow.IntentArgs;
import com.pulumi.gcp.diagflow.inputs.IntentState;
import com.pulumi.gcp.diagflow.outputs.IntentFollowupIntentInfo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Represents a Dialogflow intent. Intents convert a number of user expressions or patterns into an action. An action
 * is an extraction of a user command or sentence semantics.
 * 
 * To get more information about Intent, see:
 * 
 * * [API documentation](https://cloud.google.com/dialogflow/docs/reference/rest/v2/projects.agent.intents)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/dialogflow/docs/)
 * 
 * ## Example Usage
 * ### Dialogflow Intent Basic
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var basicAgent = new Agent(&#34;basicAgent&#34;, AgentArgs.builder()        
 *             .displayName(&#34;example_agent&#34;)
 *             .defaultLanguageCode(&#34;en&#34;)
 *             .timeZone(&#34;America/New_York&#34;)
 *             .build());
 * 
 *         var basicIntent = new Intent(&#34;basicIntent&#34;, IntentArgs.builder()        
 *             .displayName(&#34;basic-intent&#34;)
 *             .build());
 * 
 *         }
 * }
 * ```
 * 
 * ## Import
 * 
 * Intent can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:diagflow/intent:Intent default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:diagflow/intent:Intent")
public class Intent extends com.pulumi.resources.CustomResource {
    /**
     * The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     * 
     */
    @Export(name="action", type=String.class, parameters={})
    private Output<String> action;

    /**
     * @return The name of the action associated with the intent.
     * Note: The action name must not contain whitespaces.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, and `GOOGLE_HANGOUTS`.
     * 
     */
    @Export(name="defaultResponsePlatforms", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> defaultResponsePlatforms;

    /**
     * @return The list of platforms for which the first responses will be copied from the messages in PLATFORM_UNSPECIFIED
     * (i.e. default platform).
     * Each value may be one of `FACEBOOK`, `SLACK`, `TELEGRAM`, `KIK`, `SKYPE`, `LINE`, `VIBER`, `ACTIONS_ON_GOOGLE`, and `GOOGLE_HANGOUTS`.
     * 
     */
    public Output<Optional<List<String>>> defaultResponsePlatforms() {
        return Codegen.optional(this.defaultResponsePlatforms);
    }
    /**
     * The name of this intent to be displayed on the console.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The name of this intent to be displayed on the console.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     * 
     */
    @Export(name="events", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> events;

    /**
     * @return The collection of event names that trigger the intent. If the collection of input contexts is not empty, all of
     * the contexts must be present in the active user session for an event to trigger this intent. See the
     * [events reference](https://cloud.google.com/dialogflow/docs/events-overview) for more details.
     * 
     */
    public Output<Optional<List<String>>> events() {
        return Codegen.optional(this.events);
    }
    /**
     * Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only
     * in the output.
     * 
     */
    @Export(name="followupIntentInfos", type=List.class, parameters={IntentFollowupIntentInfo.class})
    private Output<List<IntentFollowupIntentInfo>> followupIntentInfos;

    /**
     * @return Information about all followup intents that have this intent as a direct or indirect parent. We populate this field only
     * in the output.
     * 
     */
    public Output<List<IntentFollowupIntentInfo>> followupIntentInfos() {
        return this.followupIntentInfos;
    }
    /**
     * The list of context names required for this intent to be triggered.
     * Format: projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;.
     * 
     */
    @Export(name="inputContextNames", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> inputContextNames;

    /**
     * @return The list of context names required for this intent to be triggered.
     * Format: projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;.
     * 
     */
    public Output<Optional<List<String>>> inputContextNames() {
        return Codegen.optional(this.inputContextNames);
    }
    /**
     * Indicates whether this is a fallback intent.
     * 
     */
    @Export(name="isFallback", type=Boolean.class, parameters={})
    private Output<Boolean> isFallback;

    /**
     * @return Indicates whether this is a fallback intent.
     * 
     */
    public Output<Boolean> isFallback() {
        return this.isFallback;
    }
    /**
     * Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    @Export(name="mlDisabled", type=Boolean.class, parameters={})
    private Output<Boolean> mlDisabled;

    /**
     * @return Indicates whether Machine Learning is disabled for the intent.
     * Note: If mlDisabled setting is set to true, then this intent is not taken into account during inference in ML
     * ONLY match mode. Also, auto-markup in the UI is turned off.
     * 
     */
    public Output<Boolean> mlDisabled() {
        return this.mlDisabled;
    }
    /**
     * The unique identifier of this intent. Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The unique identifier of this intent. Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    @Export(name="parentFollowupIntentName", type=String.class, parameters={})
    private Output<String> parentFollowupIntentName;

    /**
     * @return The unique identifier of the parent intent in the chain of followup intents.
     * Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    public Output<String> parentFollowupIntentName() {
        return this.parentFollowupIntentName;
    }
    /**
     * The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     *   to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    @Export(name="priority", type=Integer.class, parameters={})
    private Output<Integer> priority;

    /**
     * @return The priority of this intent. Higher numbers represent higher priorities.
     * - If the supplied value is unspecified or 0, the service translates the value to 500,000, which corresponds
     *   to the Normal priority in the console.
     * - If the supplied value is negative, the intent is ignored in runtime detect intent requests.
     * 
     */
    public Output<Integer> priority() {
        return this.priority;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    @Export(name="resetContexts", type=Boolean.class, parameters={})
    private Output<Boolean> resetContexts;

    /**
     * @return Indicates whether to delete all contexts in the current session when this intent is matched.
     * 
     */
    public Output<Boolean> resetContexts() {
        return this.resetContexts;
    }
    /**
     * The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents
     * chain for this intent. Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    @Export(name="rootFollowupIntentName", type=String.class, parameters={})
    private Output<String> rootFollowupIntentName;

    /**
     * @return The unique identifier of the root intent in the chain of followup intents. It identifies the correct followup intents
     * chain for this intent. Format: projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;.
     * 
     */
    public Output<String> rootFollowupIntentName() {
        return this.rootFollowupIntentName;
    }
    /**
     * Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     *   filling prompt is forwarded to the webhook.
     *   Possible values are `WEBHOOK_STATE_ENABLED` and `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     * 
     */
    @Export(name="webhookState", type=String.class, parameters={})
    private Output<String> webhookState;

    /**
     * @return Indicates whether webhooks are enabled for the intent.
     * * WEBHOOK_STATE_ENABLED: Webhook is enabled in the agent and in the intent.
     * * WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING: Webhook is enabled in the agent and in the intent. Also, each slot
     *   filling prompt is forwarded to the webhook.
     *   Possible values are `WEBHOOK_STATE_ENABLED` and `WEBHOOK_STATE_ENABLED_FOR_SLOT_FILLING`.
     * 
     */
    public Output<String> webhookState() {
        return this.webhookState;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Intent(String name) {
        this(name, IntentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Intent(String name, IntentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Intent(String name, IntentArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/intent:Intent", name, args == null ? IntentArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Intent(String name, Output<String> id, @Nullable IntentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("gcp:diagflow/intent:Intent", name, state, makeResourceOptions(options, id));
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
    public static Intent get(String name, Output<String> id, @Nullable IntentState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Intent(name, id, state, options);
    }
}
