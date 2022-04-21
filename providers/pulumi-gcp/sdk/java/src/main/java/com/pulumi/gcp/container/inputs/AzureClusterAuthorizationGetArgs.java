// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminUserGetArgs;
import java.util.List;
import java.util.Objects;


public final class AzureClusterAuthorizationGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterAuthorizationGetArgs Empty = new AzureClusterAuthorizationGetArgs();

    /**
     * Required. Users that can perform operations as a cluster admin. A new ClusterRoleBinding will be created to grant the cluster-admin ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    @Import(name="adminUsers", required=true)
    private Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers;

    public Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers() {
        return this.adminUsers;
    }

    private AzureClusterAuthorizationGetArgs() {}

    private AzureClusterAuthorizationGetArgs(AzureClusterAuthorizationGetArgs $) {
        this.adminUsers = $.adminUsers;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterAuthorizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterAuthorizationGetArgs $;

        public Builder() {
            $ = new AzureClusterAuthorizationGetArgs();
        }

        public Builder(AzureClusterAuthorizationGetArgs defaults) {
            $ = new AzureClusterAuthorizationGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder adminUsers(Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers) {
            $.adminUsers = adminUsers;
            return this;
        }

        public Builder adminUsers(List<AzureClusterAuthorizationAdminUserGetArgs> adminUsers) {
            return adminUsers(Output.of(adminUsers));
        }

        public Builder adminUsers(AzureClusterAuthorizationAdminUserGetArgs... adminUsers) {
            return adminUsers(List.of(adminUsers));
        }

        public AzureClusterAuthorizationGetArgs build() {
            $.adminUsers = Objects.requireNonNull($.adminUsers, "expected parameter 'adminUsers' to be non-null");
            return $;
        }
    }

}
