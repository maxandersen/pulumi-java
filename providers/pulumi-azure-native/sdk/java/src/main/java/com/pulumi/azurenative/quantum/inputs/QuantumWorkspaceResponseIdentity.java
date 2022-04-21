// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.quantum.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed Identity information.
 * 
 */
public final class QuantumWorkspaceResponseIdentity extends com.pulumi.resources.InvokeArgs {

    public static final QuantumWorkspaceResponseIdentity Empty = new QuantumWorkspaceResponseIdentity();

    /**
     * The principal ID of resource identity.
     * 
     */
    @Import(name="principalId", required=true)
    private String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of resource.
     * 
     */
    @Import(name="tenantId", required=true)
    private String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
    private @Nullable String type;

    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    private QuantumWorkspaceResponseIdentity() {}

    private QuantumWorkspaceResponseIdentity(QuantumWorkspaceResponseIdentity $) {
        this.principalId = $.principalId;
        this.tenantId = $.tenantId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QuantumWorkspaceResponseIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QuantumWorkspaceResponseIdentity $;

        public Builder() {
            $ = new QuantumWorkspaceResponseIdentity();
        }

        public Builder(QuantumWorkspaceResponseIdentity defaults) {
            $ = new QuantumWorkspaceResponseIdentity(Objects.requireNonNull(defaults));
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

        public QuantumWorkspaceResponseIdentity build() {
            $.principalId = Objects.requireNonNull($.principalId, "expected parameter 'principalId' to be non-null");
            $.tenantId = Objects.requireNonNull($.tenantId, "expected parameter 'tenantId' to be non-null");
            return $;
        }
    }

}
