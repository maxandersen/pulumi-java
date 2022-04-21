// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.changeanalysis.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The identity block returned by ARM resource that supports managed identity.
 * 
 */
public final class ResourceIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ResourceIdentityResponse Empty = new ResourceIdentityResponse();

    /**
     * The principal id of the identity. This property will only be provided for a system-assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant id associated with the resource&#39;s identity. This property will only be provided for a system-assigned identity.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identities.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private ResourceIdentityResponse() {}

    private ResourceIdentityResponse(ResourceIdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourceIdentityResponse $;

        public Builder() {
            $ = new ResourceIdentityResponse();
        }

        public Builder(ResourceIdentityResponse defaults) {
            $ = new ResourceIdentityResponse(Objects.requireNonNull(defaults));
        }

        public Builder principalId(String principalId) {
            $.principalId = principalId;
            return this;
        }

        public Builder tenantId(String tenantId) {
            $.tenantId = tenantId;
            return this;
        }

        public Builder type(@Nullable String type) {
            $.type = type;
            return this;
        }

        public ResourceIdentityResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
