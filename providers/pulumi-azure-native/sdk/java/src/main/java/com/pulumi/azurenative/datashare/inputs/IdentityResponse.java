// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datashare.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity of resource
 * 
 */
public final class IdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final IdentityResponse Empty = new IdentityResponse();

    /**
     * service principal Id
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * Tenant Id
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Identity Type
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private IdentityResponse() {}

    private IdentityResponse(IdentityResponse $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IdentityResponse $;

        public Builder() {
            $ = new IdentityResponse();
        }

        public Builder(IdentityResponse defaults) {
            $ = new IdentityResponse(Objects.requireNonNull(defaults));
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

        public IdentityResponse build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
