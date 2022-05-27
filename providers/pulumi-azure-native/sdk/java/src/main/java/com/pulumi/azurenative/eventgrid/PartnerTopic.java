// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.eventgrid.PartnerTopicArgs;
import com.pulumi.azurenative.eventgrid.outputs.EventTypeInfoResponse;
import com.pulumi.azurenative.eventgrid.outputs.IdentityInfoResponse;
import com.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Event Grid Partner Topic.
 * API Version: 2021-10-15-preview.
 * 
 * ## Example Usage
 * ### PartnerTopics_CreateOrUpdate
 * 
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
 *         var partnerTopic = new PartnerTopic(&#34;partnerTopic&#34;, PartnerTopicArgs.builder()        
 *             .expirationTimeIfNotActivatedUtc(&#34;2022-03-23T23:06:13.109Z&#34;)
 *             .location(&#34;westus2&#34;)
 *             .messageForActivation(&#34;Example message for activation&#34;)
 *             .partnerRegistrationImmutableId(&#34;6f541064-031d-4cc8-9ec3-a3b4fc0f7185&#34;)
 *             .partnerTopicFriendlyDescription(&#34;Example description&#34;)
 *             .partnerTopicName(&#34;examplePartnerTopicName1&#34;)
 *             .resourceGroupName(&#34;examplerg&#34;)
 *             .source(&#34;ContosoCorp.Accounts.User1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:eventgrid:PartnerTopic examplePartnerTopicName1 /subscriptions/5b4b650e-28b9-4790-b3ab-ddbd88d727c4/resourceGroups/examplerg/providers/Microsoft.EventGrid/partnerTopics/examplePartnerTopicName1 
 * ```
 * 
 */
@ResourceType(type="azure-native:eventgrid:PartnerTopic")
public class PartnerTopic extends com.pulumi.resources.CustomResource {
    /**
     * Activation state of the partner topic.
     * 
     */
    @Export(name="activationState", type=String.class, parameters={})
    private Output</* @Nullable */ String> activationState;

    /**
     * @return Activation state of the partner topic.
     * 
     */
    public Output<Optional<String>> activationState() {
        return Codegen.optional(this.activationState);
    }
    /**
     * Event Type information from the corresponding event channel.
     * 
     */
    @Export(name="eventTypeInfo", type=EventTypeInfoResponse.class, parameters={})
    private Output</* @Nullable */ EventTypeInfoResponse> eventTypeInfo;

    /**
     * @return Event Type information from the corresponding event channel.
     * 
     */
    public Output<Optional<EventTypeInfoResponse>> eventTypeInfo() {
        return Codegen.optional(this.eventTypeInfo);
    }
    /**
     * Expiration time of the partner topic. If this timer expires while the partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     * 
     */
    @Export(name="expirationTimeIfNotActivatedUtc", type=String.class, parameters={})
    private Output</* @Nullable */ String> expirationTimeIfNotActivatedUtc;

    /**
     * @return Expiration time of the partner topic. If this timer expires while the partner topic is still never activated,
     * the partner topic and corresponding event channel are deleted.
     * 
     */
    public Output<Optional<String>> expirationTimeIfNotActivatedUtc() {
        return Codegen.optional(this.expirationTimeIfNotActivatedUtc);
    }
    /**
     * Identity information for the Partner Topic resource.
     * 
     */
    @Export(name="identity", type=IdentityInfoResponse.class, parameters={})
    private Output</* @Nullable */ IdentityInfoResponse> identity;

    /**
     * @return Identity information for the Partner Topic resource.
     * 
     */
    public Output<Optional<IdentityInfoResponse>> identity() {
        return Codegen.optional(this.identity);
    }
    /**
     * Location of the resource.
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Location of the resource.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * Context or helpful message that can be used during the approval process by the subscriber.
     * 
     */
    @Export(name="messageForActivation", type=String.class, parameters={})
    private Output</* @Nullable */ String> messageForActivation;

    /**
     * @return Context or helpful message that can be used during the approval process by the subscriber.
     * 
     */
    public Output<Optional<String>> messageForActivation() {
        return Codegen.optional(this.messageForActivation);
    }
    /**
     * Name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The immutableId of the corresponding partner registration.
     * 
     */
    @Export(name="partnerRegistrationImmutableId", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerRegistrationImmutableId;

    /**
     * @return The immutableId of the corresponding partner registration.
     * 
     */
    public Output<Optional<String>> partnerRegistrationImmutableId() {
        return Codegen.optional(this.partnerRegistrationImmutableId);
    }
    /**
     * Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     */
    @Export(name="partnerTopicFriendlyDescription", type=String.class, parameters={})
    private Output</* @Nullable */ String> partnerTopicFriendlyDescription;

    /**
     * @return Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     */
    public Output<Optional<String>> partnerTopicFriendlyDescription() {
        return Codegen.optional(this.partnerTopicFriendlyDescription);
    }
    /**
     * Provisioning state of the partner topic.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provisioning state of the partner topic.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Source associated with this partner topic. This represents a unique partner resource.
     * 
     */
    @Export(name="source", type=String.class, parameters={})
    private Output</* @Nullable */ String> source;

    /**
     * @return Source associated with this partner topic. This represents a unique partner resource.
     * 
     */
    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    /**
     * The system metadata relating to Partner Topic resource.
     * 
     */
    @Export(name="systemData", type=SystemDataResponse.class, parameters={})
    private Output<SystemDataResponse> systemData;

    /**
     * @return The system metadata relating to Partner Topic resource.
     * 
     */
    public Output<SystemDataResponse> systemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags of the resource.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PartnerTopic(String name) {
        this(name, PartnerTopicArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PartnerTopic(String name, PartnerTopicArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PartnerTopic(String name, PartnerTopicArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerTopic", name, args == null ? PartnerTopicArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PartnerTopic(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:eventgrid:PartnerTopic", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:eventgrid/v20211015preview:PartnerTopic").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static PartnerTopic get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PartnerTopic(name, id, options);
    }
}
