// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetBackupShortTermRetentionPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBackupShortTermRetentionPolicyArgs Empty = new GetBackupShortTermRetentionPolicyArgs();

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
      private final String databaseName;

    public String databaseName() {
        return this.databaseName;
    }

    /**
     * The policy name. Should always be &#34;default&#34;.
     * 
     */
    @Import(name="policyName", required=true)
      private final String policyName;

    public String policyName() {
        return this.policyName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
      private final String serverName;

    public String serverName() {
        return this.serverName;
    }

    public GetBackupShortTermRetentionPolicyArgs(
        String databaseName,
        String policyName,
        String resourceGroupName,
        String serverName) {
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.policyName = Objects.requireNonNull(policyName, "expected parameter 'policyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private GetBackupShortTermRetentionPolicyArgs() {
        this.databaseName = null;
        this.policyName = null;
        this.resourceGroupName = null;
        this.serverName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupShortTermRetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private String policyName;
        private String resourceGroupName;
        private String serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupShortTermRetentionPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.policyName = defaults.policyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder policyName(String policyName) {
            this.policyName = Objects.requireNonNull(policyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder serverName(String serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }        public GetBackupShortTermRetentionPolicyArgs build() {
            return new GetBackupShortTermRetentionPolicyArgs(databaseName, policyName, resourceGroupName, serverName);
        }
    }
}
