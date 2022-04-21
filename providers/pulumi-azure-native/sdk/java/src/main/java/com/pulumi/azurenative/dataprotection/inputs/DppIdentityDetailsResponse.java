// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity details
 * 
 */
public final class DppIdentityDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final DppIdentityDetailsResponse Empty = new DppIdentityDetailsResponse();

    /**
     * The object ID of the service principal object for the managed identity that is used to grant role-based access to an Azure resource.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * A Globally Unique Identifier (GUID) that represents the Azure AD tenant where the resource is now a member.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The identityType which can be either SystemAssigned or None
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private DppIdentityDetailsResponse() {}

    private DppIdentityDetailsResponse(DppIdentityDetailsResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DppIdentityDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DppIdentityDetailsResponse $;

        public Builder() {
            $ = new DppIdentityDetailsResponse();
        }

        public Builder(DppIdentityDetailsResponse defaults) {
            $ = new DppIdentityDetailsResponse(Objects.requireNonNull(defaults));
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

        public DppIdentityDetailsResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
