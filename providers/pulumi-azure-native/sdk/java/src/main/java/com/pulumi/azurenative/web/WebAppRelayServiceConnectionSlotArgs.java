// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAppRelayServiceConnectionSlotArgs extends ResourceArgs {

    public static final WebAppRelayServiceConnectionSlotArgs Empty = new WebAppRelayServiceConnectionSlotArgs();

    @Import(name="biztalkUri")
    private @Nullable Output<String> biztalkUri;

    public Optional<Output<String>> biztalkUri() {
        return Optional.ofNullable(this.biztalkUri);
    }

    @Import(name="entityConnectionString")
    private @Nullable Output<String> entityConnectionString;

    public Optional<Output<String>> entityConnectionString() {
        return Optional.ofNullable(this.entityConnectionString);
    }

    @Import(name="entityName")
    private @Nullable Output<String> entityName;

    public Optional<Output<String>> entityName() {
        return Optional.ofNullable(this.entityName);
    }

    @Import(name="hostname")
    private @Nullable Output<String> hostname;

    public Optional<Output<String>> hostname() {
        return Optional.ofNullable(this.hostname);
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return Kind of resource.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of the app.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="port")
    private @Nullable Output<Integer> port;

    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    @Import(name="resourceConnectionString")
    private @Nullable Output<String> resourceConnectionString;

    public Optional<Output<String>> resourceConnectionString() {
        return Optional.ofNullable(this.resourceConnectionString);
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Name of the resource group to which the resource belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="resourceType")
    private @Nullable Output<String> resourceType;

    public Optional<Output<String>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will create or update a hybrid connection for the production slot.
     * 
     */
    @Import(name="slot", required=true)
    private Output<String> slot;

    /**
     * @return Name of the deployment slot. If a slot is not specified, the API will create or update a hybrid connection for the production slot.
     * 
     */
    public Output<String> slot() {
        return this.slot;
    }

    private WebAppRelayServiceConnectionSlotArgs() {}

    private WebAppRelayServiceConnectionSlotArgs(WebAppRelayServiceConnectionSlotArgs $) {
        this.biztalkUri = $.biztalkUri;
        this.entityConnectionString = $.entityConnectionString;
        this.entityName = $.entityName;
        this.hostname = $.hostname;
        this.kind = $.kind;
        this.name = $.name;
        this.port = $.port;
        this.resourceConnectionString = $.resourceConnectionString;
        this.resourceGroupName = $.resourceGroupName;
        this.resourceType = $.resourceType;
        this.slot = $.slot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAppRelayServiceConnectionSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAppRelayServiceConnectionSlotArgs $;

        public Builder() {
            $ = new WebAppRelayServiceConnectionSlotArgs();
        }

        public Builder(WebAppRelayServiceConnectionSlotArgs defaults) {
            $ = new WebAppRelayServiceConnectionSlotArgs(Objects.requireNonNull(defaults));
        }

        public Builder biztalkUri(@Nullable Output<String> biztalkUri) {
            $.biztalkUri = biztalkUri;
            return this;
        }

        public Builder biztalkUri(String biztalkUri) {
            return biztalkUri(Output.of(biztalkUri));
        }

        public Builder entityConnectionString(@Nullable Output<String> entityConnectionString) {
            $.entityConnectionString = entityConnectionString;
            return this;
        }

        public Builder entityConnectionString(String entityConnectionString) {
            return entityConnectionString(Output.of(entityConnectionString));
        }

        public Builder entityName(@Nullable Output<String> entityName) {
            $.entityName = entityName;
            return this;
        }

        public Builder entityName(String entityName) {
            return entityName(Output.of(entityName));
        }

        public Builder hostname(@Nullable Output<String> hostname) {
            $.hostname = hostname;
            return this;
        }

        public Builder hostname(String hostname) {
            return hostname(Output.of(hostname));
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind Kind of resource.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the app.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        public Builder resourceConnectionString(@Nullable Output<String> resourceConnectionString) {
            $.resourceConnectionString = resourceConnectionString;
            return this;
        }

        public Builder resourceConnectionString(String resourceConnectionString) {
            return resourceConnectionString(Output.of(resourceConnectionString));
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Name of the resource group to which the resource belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder resourceType(@Nullable Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will create or update a hybrid connection for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(Output<String> slot) {
            $.slot = slot;
            return this;
        }

        /**
         * @param slot Name of the deployment slot. If a slot is not specified, the API will create or update a hybrid connection for the production slot.
         * 
         * @return builder
         * 
         */
        public Builder slot(String slot) {
            return slot(Output.of(slot));
        }

        public WebAppRelayServiceConnectionSlotArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.slot = Objects.requireNonNull($.slot, "expected parameter 'slot' to be non-null");
            return $;
        }
    }

}
