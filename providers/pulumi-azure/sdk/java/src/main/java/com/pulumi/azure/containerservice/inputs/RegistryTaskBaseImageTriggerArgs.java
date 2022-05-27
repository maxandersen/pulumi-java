// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.containerservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RegistryTaskBaseImageTriggerArgs extends com.pulumi.resources.ResourceArgs {

    public static final RegistryTaskBaseImageTriggerArgs Empty = new RegistryTaskBaseImageTriggerArgs();

    /**
     * Should the trigger be enabled? Defaults to `true`.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Should the trigger be enabled? Defaults to `true`.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name which should be used for this trigger.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name which should be used for this trigger.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * The type of the trigger. Possible values are `All` and `Runtime`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of the trigger. Possible values are `All` and `Runtime`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     * The endpoint URL for receiving the trigger.
     * 
     */
    @Import(name="updateTriggerEndpoint")
    private @Nullable Output<String> updateTriggerEndpoint;

    /**
     * @return The endpoint URL for receiving the trigger.
     * 
     */
    public Optional<Output<String>> updateTriggerEndpoint() {
        return Optional.ofNullable(this.updateTriggerEndpoint);
    }

    /**
     * Type of payload body for the trigger. Possible values are `Default` and `Token`.
     * 
     */
    @Import(name="updateTriggerPayloadType")
    private @Nullable Output<String> updateTriggerPayloadType;

    /**
     * @return Type of payload body for the trigger. Possible values are `Default` and `Token`.
     * 
     */
    public Optional<Output<String>> updateTriggerPayloadType() {
        return Optional.ofNullable(this.updateTriggerPayloadType);
    }

    private RegistryTaskBaseImageTriggerArgs() {}

    private RegistryTaskBaseImageTriggerArgs(RegistryTaskBaseImageTriggerArgs $) {
        this.enabled = $.enabled;
        this.name = $.name;
        this.type = $.type;
        this.updateTriggerEndpoint = $.updateTriggerEndpoint;
        this.updateTriggerPayloadType = $.updateTriggerPayloadType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RegistryTaskBaseImageTriggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RegistryTaskBaseImageTriggerArgs $;

        public Builder() {
            $ = new RegistryTaskBaseImageTriggerArgs();
        }

        public Builder(RegistryTaskBaseImageTriggerArgs defaults) {
            $ = new RegistryTaskBaseImageTriggerArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Should the trigger be enabled? Defaults to `true`.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this trigger.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type The type of the trigger. Possible values are `All` and `Runtime`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of the trigger. Possible values are `All` and `Runtime`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        /**
         * @param updateTriggerEndpoint The endpoint URL for receiving the trigger.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerEndpoint(@Nullable Output<String> updateTriggerEndpoint) {
            $.updateTriggerEndpoint = updateTriggerEndpoint;
            return this;
        }

        /**
         * @param updateTriggerEndpoint The endpoint URL for receiving the trigger.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerEndpoint(String updateTriggerEndpoint) {
            return updateTriggerEndpoint(Output.of(updateTriggerEndpoint));
        }

        /**
         * @param updateTriggerPayloadType Type of payload body for the trigger. Possible values are `Default` and `Token`.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerPayloadType(@Nullable Output<String> updateTriggerPayloadType) {
            $.updateTriggerPayloadType = updateTriggerPayloadType;
            return this;
        }

        /**
         * @param updateTriggerPayloadType Type of payload body for the trigger. Possible values are `Default` and `Token`.
         * 
         * @return builder
         * 
         */
        public Builder updateTriggerPayloadType(String updateTriggerPayloadType) {
            return updateTriggerPayloadType(Output.of(updateTriggerPayloadType));
        }

        public RegistryTaskBaseImageTriggerArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
