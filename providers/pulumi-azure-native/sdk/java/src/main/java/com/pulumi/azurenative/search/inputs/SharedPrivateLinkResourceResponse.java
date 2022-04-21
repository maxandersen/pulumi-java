// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.search.inputs;

import com.pulumi.azurenative.search.inputs.SharedPrivateLinkResourcePropertiesResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a Shared Private Link Resource managed by the Azure Cognitive Search service.
 * 
 */
public final class SharedPrivateLinkResourceResponse extends com.pulumi.resources.InvokeArgs {

    public static final SharedPrivateLinkResourceResponse Empty = new SharedPrivateLinkResourceResponse();

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    /**
     * The name of the resource
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Describes the properties of a Shared Private Link Resource managed by the Azure Cognitive Search service.
     * 
     */
    @Import(name="properties")
    private @Nullable SharedPrivateLinkResourcePropertiesResponse properties;

    public Optional<SharedPrivateLinkResourcePropertiesResponse> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    private SharedPrivateLinkResourceResponse() {}

    private SharedPrivateLinkResourceResponse(SharedPrivateLinkResourceResponse $) {
        this.id = $.id;
        this.name = $.name;
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SharedPrivateLinkResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SharedPrivateLinkResourceResponse $;

        public Builder() {
            $ = new SharedPrivateLinkResourceResponse();
        }

        public Builder(SharedPrivateLinkResourceResponse defaults) {
            $ = new SharedPrivateLinkResourceResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder properties(@Nullable SharedPrivateLinkResourcePropertiesResponse properties) {
            $.properties = properties;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public SharedPrivateLinkResourceResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
