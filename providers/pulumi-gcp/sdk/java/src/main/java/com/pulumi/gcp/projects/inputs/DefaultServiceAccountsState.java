// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultServiceAccountsState extends com.pulumi.resources.ResourceArgs {

    public static final DefaultServiceAccountsState Empty = new DefaultServiceAccountsState();

    /**
     * The action to be performed in the default service accounts. Valid values are: `DEPRIVILEGE`, `DELETE`, `DISABLE`. Note that `DEPRIVILEGE` action will ignore the REVERT configuration in the restore_policy
     * 
     */
    @Import(name="action")
    private @Nullable Output<String> action;

    public Optional<Output<String>> action() {
        return Optional.ofNullable(this.action);
    }

    /**
     * The project ID where service accounts are created.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The action to be performed in the default service accounts on the resource destroy.
     * Valid values are NONE, REVERT and REVERT_AND_IGNORE_FAILURE. It is applied for any action but in the DEPRIVILEGE.
     * If set to REVERT it attempts to restore all default SAs but the DEPRIVILEGE action.
     * If set to REVERT_AND_IGNORE_FAILURE it is the same behavior as REVERT but ignores errors returned by the API.
     * 
     */
    @Import(name="restorePolicy")
    private @Nullable Output<String> restorePolicy;

    public Optional<Output<String>> restorePolicy() {
        return Optional.ofNullable(this.restorePolicy);
    }

    /**
     * The Service Accounts changed by this resource. It is used for `REVERT` the `action` on the destroy.
     * 
     */
    @Import(name="serviceAccounts")
    private @Nullable Output<Map<String,Object>> serviceAccounts;

    public Optional<Output<Map<String,Object>>> serviceAccounts() {
        return Optional.ofNullable(this.serviceAccounts);
    }

    private DefaultServiceAccountsState() {}

    private DefaultServiceAccountsState(DefaultServiceAccountsState $) {
        this.action = $.action;
        this.project = $.project;
        this.restorePolicy = $.restorePolicy;
        this.serviceAccounts = $.serviceAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultServiceAccountsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultServiceAccountsState $;

        public Builder() {
            $ = new DefaultServiceAccountsState();
        }

        public Builder(DefaultServiceAccountsState defaults) {
            $ = new DefaultServiceAccountsState(Objects.requireNonNull(defaults));
        }

        public Builder action(@Nullable Output<String> action) {
            $.action = action;
            return this;
        }

        public Builder action(String action) {
            return action(Output.of(action));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder restorePolicy(@Nullable Output<String> restorePolicy) {
            $.restorePolicy = restorePolicy;
            return this;
        }

        public Builder restorePolicy(String restorePolicy) {
            return restorePolicy(Output.of(restorePolicy));
        }

        public Builder serviceAccounts(@Nullable Output<Map<String,Object>> serviceAccounts) {
            $.serviceAccounts = serviceAccounts;
            return this;
        }

        public Builder serviceAccounts(Map<String,Object> serviceAccounts) {
            return serviceAccounts(Output.of(serviceAccounts));
        }

        public DefaultServiceAccountsState build() {
            return $;
        }
    }

}
