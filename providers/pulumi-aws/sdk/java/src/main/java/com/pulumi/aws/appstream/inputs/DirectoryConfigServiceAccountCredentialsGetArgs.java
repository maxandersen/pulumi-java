// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appstream.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DirectoryConfigServiceAccountCredentialsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DirectoryConfigServiceAccountCredentialsGetArgs Empty = new DirectoryConfigServiceAccountCredentialsGetArgs();

    /**
     * User name of the account. This account must have the following privileges: create computer objects, join computers to the domain, and change/reset the password on descendant computer objects for the organizational units specified.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Password for the account.
     * 
     */
    @Import(name="accountPassword", required=true)
    private Output<String> accountPassword;

    public Output<String> accountPassword() {
        return this.accountPassword;
    }

    private DirectoryConfigServiceAccountCredentialsGetArgs() {}

    private DirectoryConfigServiceAccountCredentialsGetArgs(DirectoryConfigServiceAccountCredentialsGetArgs $) {
        this.accountName = $.accountName;
        this.accountPassword = $.accountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DirectoryConfigServiceAccountCredentialsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DirectoryConfigServiceAccountCredentialsGetArgs $;

        public Builder() {
            $ = new DirectoryConfigServiceAccountCredentialsGetArgs();
        }

        public Builder(DirectoryConfigServiceAccountCredentialsGetArgs defaults) {
            $ = new DirectoryConfigServiceAccountCredentialsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        public Builder accountPassword(Output<String> accountPassword) {
            $.accountPassword = accountPassword;
            return this;
        }

        public Builder accountPassword(String accountPassword) {
            return accountPassword(Output.of(accountPassword));
        }

        public DirectoryConfigServiceAccountCredentialsGetArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.accountPassword = Objects.requireNonNull($.accountPassword, "expected parameter 'accountPassword' to be non-null");
            return $;
        }
    }

}
