// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.folder.inputs.OrganizationPolicyBooleanPolicyGetArgs;
import com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyGetArgs;
import com.pulumi.gcp.folder.inputs.OrganizationPolicyRestorePolicyGetArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyState extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyState Empty = new OrganizationPolicyState();

    /**
     * A boolean policy is a constraint that is either enforced or not. Structure is documented below.
     * 
     */
    @Import(name="booleanPolicy")
    private @Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy;

    public Optional<Output<OrganizationPolicyBooleanPolicyGetArgs>> booleanPolicy() {
        return Optional.ofNullable(this.booleanPolicy);
    }

    /**
     * The name of the Constraint the Policy is configuring, for example, `serviceuser.services`. Check out the [complete list of available constraints](https://cloud.google.com/resource-manager/docs/organization-policy/understanding-constraints#available_constraints).
     * 
     */
    @Import(name="constraint")
    private @Nullable Output<String> constraint;

    public Optional<Output<String>> constraint() {
        return Optional.ofNullable(this.constraint);
    }

    /**
     * (Computed) The etag of the organization policy. `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The resource name of the folder to set the policy for. Its format is folders/{folder_id}.
     * 
     */
    @Import(name="folder")
    private @Nullable Output<String> folder;

    public Optional<Output<String>> folder() {
        return Optional.ofNullable(this.folder);
    }

    /**
     * A policy that can define specific values that are allowed or denied for the given constraint. It
     * can also be used to allow or deny all values. Structure is documented below.
     * 
     */
    @Import(name="listPolicy")
    private @Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy;

    public Optional<Output<OrganizationPolicyListPolicyGetArgs>> listPolicy() {
        return Optional.ofNullable(this.listPolicy);
    }

    /**
     * A restore policy is a constraint to restore the default policy. Structure is documented below.
     * 
     */
    @Import(name="restorePolicy")
    private @Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy;

    public Optional<Output<OrganizationPolicyRestorePolicyGetArgs>> restorePolicy() {
        return Optional.ofNullable(this.restorePolicy);
    }

    /**
     * (Computed) The timestamp in RFC3339 UTC &#34;Zulu&#34; format, accurate to nanoseconds, representing when the variable was last updated. Example: &#34;2016-10-09T12:33:37.578138407Z&#34;.
     * 
     */
    @Import(name="updateTime")
    private @Nullable Output<String> updateTime;

    public Optional<Output<String>> updateTime() {
        return Optional.ofNullable(this.updateTime);
    }

    /**
     * Version of the Policy. Default version is 0.
     * 
     */
    @Import(name="version")
    private @Nullable Output<Integer> version;

    public Optional<Output<Integer>> version() {
        return Optional.ofNullable(this.version);
    }

    private OrganizationPolicyState() {}

    private OrganizationPolicyState(OrganizationPolicyState $) {
        this.booleanPolicy = $.booleanPolicy;
        this.constraint = $.constraint;
        this.etag = $.etag;
        this.folder = $.folder;
        this.listPolicy = $.listPolicy;
        this.restorePolicy = $.restorePolicy;
        this.updateTime = $.updateTime;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyState $;

        public Builder() {
            $ = new OrganizationPolicyState();
        }

        public Builder(OrganizationPolicyState defaults) {
            $ = new OrganizationPolicyState(Objects.requireNonNull(defaults));
        }

        public Builder booleanPolicy(@Nullable Output<OrganizationPolicyBooleanPolicyGetArgs> booleanPolicy) {
            $.booleanPolicy = booleanPolicy;
            return this;
        }

        public Builder booleanPolicy(OrganizationPolicyBooleanPolicyGetArgs booleanPolicy) {
            return booleanPolicy(Output.of(booleanPolicy));
        }

        public Builder constraint(@Nullable Output<String> constraint) {
            $.constraint = constraint;
            return this;
        }

        public Builder constraint(String constraint) {
            return constraint(Output.of(constraint));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        public Builder folder(@Nullable Output<String> folder) {
            $.folder = folder;
            return this;
        }

        public Builder folder(String folder) {
            return folder(Output.of(folder));
        }

        public Builder listPolicy(@Nullable Output<OrganizationPolicyListPolicyGetArgs> listPolicy) {
            $.listPolicy = listPolicy;
            return this;
        }

        public Builder listPolicy(OrganizationPolicyListPolicyGetArgs listPolicy) {
            return listPolicy(Output.of(listPolicy));
        }

        public Builder restorePolicy(@Nullable Output<OrganizationPolicyRestorePolicyGetArgs> restorePolicy) {
            $.restorePolicy = restorePolicy;
            return this;
        }

        public Builder restorePolicy(OrganizationPolicyRestorePolicyGetArgs restorePolicy) {
            return restorePolicy(Output.of(restorePolicy));
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            $.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(String updateTime) {
            return updateTime(Output.of(updateTime));
        }

        public Builder version(@Nullable Output<Integer> version) {
            $.version = version;
            return this;
        }

        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public OrganizationPolicyState build() {
            return $;
        }
    }

}
