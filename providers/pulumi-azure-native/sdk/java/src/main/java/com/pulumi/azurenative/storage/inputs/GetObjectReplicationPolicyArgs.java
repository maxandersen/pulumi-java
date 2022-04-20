// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storage.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetObjectReplicationPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObjectReplicationPolicyArgs Empty = new GetObjectReplicationPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String accountName() {
        return this.accountName;
    }

    /**
     * The ID of object replication policy or &#39;default&#39; if the policy ID is unknown.
     * 
     */
    @Import(name="objectReplicationPolicyId", required=true)
      private final String objectReplicationPolicyId;

    public String objectReplicationPolicyId() {
        return this.objectReplicationPolicyId;
    }

    /**
     * The name of the resource group within the user&#39;s subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    public GetObjectReplicationPolicyArgs(
        String accountName,
        String objectReplicationPolicyId,
        String resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.objectReplicationPolicyId = Objects.requireNonNull(objectReplicationPolicyId, "expected parameter 'objectReplicationPolicyId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetObjectReplicationPolicyArgs() {
        this.accountName = null;
        this.objectReplicationPolicyId = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetObjectReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String objectReplicationPolicyId;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetObjectReplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.objectReplicationPolicyId = defaults.objectReplicationPolicyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder objectReplicationPolicyId(String objectReplicationPolicyId) {
            this.objectReplicationPolicyId = Objects.requireNonNull(objectReplicationPolicyId);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetObjectReplicationPolicyArgs build() {
            return new GetObjectReplicationPolicyArgs(accountName, objectReplicationPolicyId, resourceGroupName);
        }
    }
}
