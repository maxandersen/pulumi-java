// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataSourcePermissionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourcePermissionGetArgs Empty = new DataSourcePermissionGetArgs();

    /**
     * Set of IAM actions to grant or revoke permissions on. Max of 16 items.
     * 
     */
    @Import(name="actions", required=true)
    private Output<List<String>> actions;

    public Output<List<String>> actions() {
        return this.actions;
    }

    /**
     * The Amazon Resource Name (ARN) of the principal.
     * 
     */
    @Import(name="principal", required=true)
    private Output<String> principal;

    public Output<String> principal() {
        return this.principal;
    }

    private DataSourcePermissionGetArgs() {}

    private DataSourcePermissionGetArgs(DataSourcePermissionGetArgs $) {
        this.actions = $.actions;
        this.principal = $.principal;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourcePermissionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourcePermissionGetArgs $;

        public Builder() {
            $ = new DataSourcePermissionGetArgs();
        }

        public Builder(DataSourcePermissionGetArgs defaults) {
            $ = new DataSourcePermissionGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder actions(Output<List<String>> actions) {
            $.actions = actions;
            return this;
        }

        public Builder actions(List<String> actions) {
            return actions(Output.of(actions));
        }

        public Builder actions(String... actions) {
            return actions(List.of(actions));
        }

        public Builder principal(Output<String> principal) {
            $.principal = principal;
            return this;
        }

        public Builder principal(String principal) {
            return principal(Output.of(principal));
        }

        public DataSourcePermissionGetArgs build() {
            $.actions = Objects.requireNonNull($.actions, "expected parameter 'actions' to be non-null");
            $.principal = Objects.requireNonNull($.principal, "expected parameter 'principal' to be non-null");
            return $;
        }
    }

}
