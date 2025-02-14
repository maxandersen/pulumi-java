// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyArgs Empty = new PropertyArgs();

    /**
     * Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    @Import(name="displayName", required=true)
    private Output<String> displayName;

    /**
     * @return Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }

    /**
     * Identifier of the property.
     * 
     */
    @Import(name="propId")
    private @Nullable Output<String> propId;

    /**
     * @return Identifier of the property.
     * 
     */
    public Optional<Output<String>> propId() {
        return Optional.ofNullable(this.propId);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    @Import(name="secret")
    private @Nullable Output<Boolean> secret;

    /**
     * @return Determines whether the value is a secret and should be encrypted or not. Default value is false.
     * 
     */
    public Optional<Output<Boolean>> secret() {
        return Optional.ofNullable(this.secret);
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    /**
     * @return The name of the API Management service.
     * 
     */
    public Output<String> serviceName() {
        return this.serviceName;
    }

    /**
     * Optional tags that when provided can be used to filter the property list.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Optional tags that when provided can be used to filter the property list.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private PropertyArgs() {}

    private PropertyArgs(PropertyArgs $) {
        this.displayName = $.displayName;
        this.propId = $.propId;
        this.resourceGroupName = $.resourceGroupName;
        this.secret = $.secret;
        this.serviceName = $.serviceName;
        this.tags = $.tags;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyArgs $;

        public Builder() {
            $ = new PropertyArgs();
        }

        public Builder(PropertyArgs defaults) {
            $ = new PropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayName Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(Output<String> displayName) {
            $.displayName = displayName;
            return this;
        }

        /**
         * @param displayName Unique name of Property. It may contain only letters, digits, period, dash, and underscore characters.
         * 
         * @return builder
         * 
         */
        public Builder displayName(String displayName) {
            return displayName(Output.of(displayName));
        }

        /**
         * @param propId Identifier of the property.
         * 
         * @return builder
         * 
         */
        public Builder propId(@Nullable Output<String> propId) {
            $.propId = propId;
            return this;
        }

        /**
         * @param propId Identifier of the property.
         * 
         * @return builder
         * 
         */
        public Builder propId(String propId) {
            return propId(Output.of(propId));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder secret(@Nullable Output<Boolean> secret) {
            $.secret = secret;
            return this;
        }

        /**
         * @param secret Determines whether the value is a secret and should be encrypted or not. Default value is false.
         * 
         * @return builder
         * 
         */
        public Builder secret(Boolean secret) {
            return secret(Output.of(secret));
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        /**
         * @param serviceName The name of the API Management service.
         * 
         * @return builder
         * 
         */
        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the property list.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the property list.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Optional tags that when provided can be used to filter the property list.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param value Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Value of the property. Can contain policy expressions. It may not be empty or consist only of whitespace.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public PropertyArgs build() {
            $.displayName = Objects.requireNonNull($.displayName, "expected parameter 'displayName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
