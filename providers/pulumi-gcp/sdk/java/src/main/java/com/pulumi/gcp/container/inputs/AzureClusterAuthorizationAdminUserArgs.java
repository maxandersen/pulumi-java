// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.container.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterAuthorizationAdminUserArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureClusterAuthorizationAdminUserArgs Empty = new AzureClusterAuthorizationAdminUserArgs();

    /**
     * The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return The name of the user, e.g. `my-gcp-id@gmail.com`.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private AzureClusterAuthorizationAdminUserArgs() {}

    private AzureClusterAuthorizationAdminUserArgs(AzureClusterAuthorizationAdminUserArgs $) {
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AzureClusterAuthorizationAdminUserArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AzureClusterAuthorizationAdminUserArgs $;

        public Builder() {
            $ = new AzureClusterAuthorizationAdminUserArgs();
        }

        public Builder(AzureClusterAuthorizationAdminUserArgs defaults) {
            $ = new AzureClusterAuthorizationAdminUserArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param username The name of the user, e.g. `my-gcp-id@gmail.com`.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The name of the user, e.g. `my-gcp-id@gmail.com`.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public AzureClusterAuthorizationAdminUserArgs build() {
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
