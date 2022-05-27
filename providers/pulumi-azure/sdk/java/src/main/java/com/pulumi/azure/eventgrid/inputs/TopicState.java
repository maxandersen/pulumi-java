// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.eventgrid.inputs;

import com.pulumi.azure.eventgrid.inputs.TopicIdentityArgs;
import com.pulumi.azure.eventgrid.inputs.TopicInboundIpRuleArgs;
import com.pulumi.azure.eventgrid.inputs.TopicInputMappingDefaultValuesArgs;
import com.pulumi.azure.eventgrid.inputs.TopicInputMappingFieldsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicState extends com.pulumi.resources.ResourceArgs {

    public static final TopicState Empty = new TopicState();

    /**
     * The Endpoint associated with the EventGrid Topic.
     * 
     */
    @Import(name="endpoint")
    private @Nullable Output<String> endpoint;

    /**
     * @return The Endpoint associated with the EventGrid Topic.
     * 
     */
    public Optional<Output<String>> endpoint() {
        return Optional.ofNullable(this.endpoint);
    }

    /**
     * An `identity` block as defined below.
     * 
     */
    @Import(name="identity")
    private @Nullable Output<TopicIdentityArgs> identity;

    /**
     * @return An `identity` block as defined below.
     * 
     */
    public Optional<Output<TopicIdentityArgs>> identity() {
        return Optional.ofNullable(this.identity);
    }

    /**
     * One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    @Import(name="inboundIpRules")
    private @Nullable Output<List<TopicInboundIpRuleArgs>> inboundIpRules;

    /**
     * @return One or more `inbound_ip_rule` blocks as defined below.
     * 
     */
    public Optional<Output<List<TopicInboundIpRuleArgs>>> inboundIpRules() {
        return Optional.ofNullable(this.inboundIpRules);
    }

    /**
     * A `input_mapping_default_values` block as defined below.
     * 
     */
    @Import(name="inputMappingDefaultValues")
    private @Nullable Output<TopicInputMappingDefaultValuesArgs> inputMappingDefaultValues;

    /**
     * @return A `input_mapping_default_values` block as defined below.
     * 
     */
    public Optional<Output<TopicInputMappingDefaultValuesArgs>> inputMappingDefaultValues() {
        return Optional.ofNullable(this.inputMappingDefaultValues);
    }

    /**
     * A `input_mapping_fields` block as defined below.
     * 
     */
    @Import(name="inputMappingFields")
    private @Nullable Output<TopicInputMappingFieldsArgs> inputMappingFields;

    /**
     * @return A `input_mapping_fields` block as defined below.
     * 
     */
    public Optional<Output<TopicInputMappingFieldsArgs>> inputMappingFields() {
        return Optional.ofNullable(this.inputMappingFields);
    }

    /**
     * Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="inputSchema")
    private @Nullable Output<String> inputSchema;

    /**
     * @return Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> inputSchema() {
        return Optional.ofNullable(this.inputSchema);
    }

    /**
     * Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
     * 
     */
    @Import(name="localAuthEnabled")
    private @Nullable Output<Boolean> localAuthEnabled;

    /**
     * @return Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> localAuthEnabled() {
        return Optional.ofNullable(this.localAuthEnabled);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    @Import(name="primaryAccessKey")
    private @Nullable Output<String> primaryAccessKey;

    /**
     * @return The Primary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public Optional<Output<String>> primaryAccessKey() {
        return Optional.ofNullable(this.primaryAccessKey);
    }

    /**
     * Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    @Import(name="publicNetworkAccessEnabled")
    private @Nullable Output<Boolean> publicNetworkAccessEnabled;

    /**
     * @return Whether or not public network access is allowed for this server. Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> publicNetworkAccessEnabled() {
        return Optional.ofNullable(this.publicNetworkAccessEnabled);
    }

    /**
     * The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable Output<String> resourceGroupName;

    /**
     * @return The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    @Import(name="secondaryAccessKey")
    private @Nullable Output<String> secondaryAccessKey;

    /**
     * @return The Secondary Shared Access Key associated with the EventGrid Topic.
     * 
     */
    public Optional<Output<String>> secondaryAccessKey() {
        return Optional.ofNullable(this.secondaryAccessKey);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TopicState() {}

    private TopicState(TopicState $) {
        this.endpoint = $.endpoint;
        this.identity = $.identity;
        this.inboundIpRules = $.inboundIpRules;
        this.inputMappingDefaultValues = $.inputMappingDefaultValues;
        this.inputMappingFields = $.inputMappingFields;
        this.inputSchema = $.inputSchema;
        this.localAuthEnabled = $.localAuthEnabled;
        this.location = $.location;
        this.name = $.name;
        this.primaryAccessKey = $.primaryAccessKey;
        this.publicNetworkAccessEnabled = $.publicNetworkAccessEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.secondaryAccessKey = $.secondaryAccessKey;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicState $;

        public Builder() {
            $ = new TopicState();
        }

        public Builder(TopicState defaults) {
            $ = new TopicState(Objects.requireNonNull(defaults));
        }

        /**
         * @param endpoint The Endpoint associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(@Nullable Output<String> endpoint) {
            $.endpoint = endpoint;
            return this;
        }

        /**
         * @param endpoint The Endpoint associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder endpoint(String endpoint) {
            return endpoint(Output.of(endpoint));
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(@Nullable Output<TopicIdentityArgs> identity) {
            $.identity = identity;
            return this;
        }

        /**
         * @param identity An `identity` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder identity(TopicIdentityArgs identity) {
            return identity(Output.of(identity));
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(@Nullable Output<List<TopicInboundIpRuleArgs>> inboundIpRules) {
            $.inboundIpRules = inboundIpRules;
            return this;
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(List<TopicInboundIpRuleArgs> inboundIpRules) {
            return inboundIpRules(Output.of(inboundIpRules));
        }

        /**
         * @param inboundIpRules One or more `inbound_ip_rule` blocks as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inboundIpRules(TopicInboundIpRuleArgs... inboundIpRules) {
            return inboundIpRules(List.of(inboundIpRules));
        }

        /**
         * @param inputMappingDefaultValues A `input_mapping_default_values` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputMappingDefaultValues(@Nullable Output<TopicInputMappingDefaultValuesArgs> inputMappingDefaultValues) {
            $.inputMappingDefaultValues = inputMappingDefaultValues;
            return this;
        }

        /**
         * @param inputMappingDefaultValues A `input_mapping_default_values` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputMappingDefaultValues(TopicInputMappingDefaultValuesArgs inputMappingDefaultValues) {
            return inputMappingDefaultValues(Output.of(inputMappingDefaultValues));
        }

        /**
         * @param inputMappingFields A `input_mapping_fields` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputMappingFields(@Nullable Output<TopicInputMappingFieldsArgs> inputMappingFields) {
            $.inputMappingFields = inputMappingFields;
            return this;
        }

        /**
         * @param inputMappingFields A `input_mapping_fields` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder inputMappingFields(TopicInputMappingFieldsArgs inputMappingFields) {
            return inputMappingFields(Output.of(inputMappingFields));
        }

        /**
         * @param inputSchema Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder inputSchema(@Nullable Output<String> inputSchema) {
            $.inputSchema = inputSchema;
            return this;
        }

        /**
         * @param inputSchema Specifies the schema in which incoming events will be published to this domain. Allowed values are `CloudEventSchemaV1_0`, `CustomEventSchema`, or `EventGridSchema`. Defaults to `EventGridSchema`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder inputSchema(String inputSchema) {
            return inputSchema(Output.of(inputSchema));
        }

        /**
         * @param localAuthEnabled Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(@Nullable Output<Boolean> localAuthEnabled) {
            $.localAuthEnabled = localAuthEnabled;
            return this;
        }

        /**
         * @param localAuthEnabled Whether local authentication methods is enabled for the EventGrid Topic. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder localAuthEnabled(Boolean localAuthEnabled) {
            return localAuthEnabled(Output.of(localAuthEnabled));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the EventGrid Topic resource. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param primaryAccessKey The Primary Shared Access Key associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder primaryAccessKey(@Nullable Output<String> primaryAccessKey) {
            $.primaryAccessKey = primaryAccessKey;
            return this;
        }

        /**
         * @param primaryAccessKey The Primary Shared Access Key associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder primaryAccessKey(String primaryAccessKey) {
            return primaryAccessKey(Output.of(primaryAccessKey));
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(@Nullable Output<Boolean> publicNetworkAccessEnabled) {
            $.publicNetworkAccessEnabled = publicNetworkAccessEnabled;
            return this;
        }

        /**
         * @param publicNetworkAccessEnabled Whether or not public network access is allowed for this server. Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder publicNetworkAccessEnabled(Boolean publicNetworkAccessEnabled) {
            return publicNetworkAccessEnabled(Output.of(publicNetworkAccessEnabled));
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the EventGrid Topic exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secondaryAccessKey The Secondary Shared Access Key associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAccessKey(@Nullable Output<String> secondaryAccessKey) {
            $.secondaryAccessKey = secondaryAccessKey;
            return this;
        }

        /**
         * @param secondaryAccessKey The Secondary Shared Access Key associated with the EventGrid Topic.
         * 
         * @return builder
         * 
         */
        public Builder secondaryAccessKey(String secondaryAccessKey) {
            return secondaryAccessKey(Output.of(secondaryAccessKey));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public TopicState build() {
            return $;
        }
    }

}
