// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kubernetes.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Identity for the connected cluster.
 * 
 */
public final class ConnectedClusterIdentityResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectedClusterIdentityResponse Empty = new ConnectedClusterIdentityResponse();

    /**
     * The principal id of connected cluster identity. This property will only be provided for a system assigned identity.
     * 
     */
    @Import(name="principalId", required=true)
      private final String principalId;

    public String principalId() {
        return this.principalId;
    }

    /**
     * The tenant id associated with the connected cluster. This property will only be provided for a system assigned identity.
     * 
     */
    @Import(name="tenantId", required=true)
      private final String tenantId;

    public String tenantId() {
        return this.tenantId;
    }

    /**
     * The type of identity used for the connected cluster. The type &#39;SystemAssigned, includes a system created identity. The type &#39;None&#39; means no identity is assigned to the connected cluster.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public ConnectedClusterIdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = Codegen.stringProp("type").arg(type).def("SystemAssigned").require();
    }

    private ConnectedClusterIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ConnectedClusterIdentityResponse build() {
            return new ConnectedClusterIdentityResponse(principalId, tenantId, type);
        }
    }
}
