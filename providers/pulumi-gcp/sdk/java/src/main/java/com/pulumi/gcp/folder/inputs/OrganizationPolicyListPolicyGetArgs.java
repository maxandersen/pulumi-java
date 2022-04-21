// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyAllowGetArgs;
import com.pulumi.gcp.folder.inputs.OrganizationPolicyListPolicyDenyGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyGetArgs Empty = new OrganizationPolicyListPolicyGetArgs();

    /**
     * or `deny` - (Optional) One or the other must be set.
     * 
     */
    @Import(name="allow")
    private @Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow;

    public Optional<Output<OrganizationPolicyListPolicyAllowGetArgs>> allow() {
        return Optional.ofNullable(this.allow);
    }

    @Import(name="deny")
    private @Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny;

    public Optional<Output<OrganizationPolicyListPolicyDenyGetArgs>> deny() {
        return Optional.ofNullable(this.deny);
    }

    /**
     * If set to true, the values from the effective Policy of the parent resource
     * are inherited, meaning the values set in this Policy are added to the values inherited up the hierarchy.
     * 
     */
    @Import(name="inheritFromParent")
    private @Nullable Output<Boolean> inheritFromParent;

    public Optional<Output<Boolean>> inheritFromParent() {
        return Optional.ofNullable(this.inheritFromParent);
    }

    /**
     * The Google Cloud Console will try to default to a configuration that matches the value specified in this field.
     * 
     */
    @Import(name="suggestedValue")
    private @Nullable Output<String> suggestedValue;

    public Optional<Output<String>> suggestedValue() {
        return Optional.ofNullable(this.suggestedValue);
    }

    private OrganizationPolicyListPolicyGetArgs() {}

    private OrganizationPolicyListPolicyGetArgs(OrganizationPolicyListPolicyGetArgs $) {
        this.allow = $.allow;
        this.deny = $.deny;
        this.inheritFromParent = $.inheritFromParent;
        this.suggestedValue = $.suggestedValue;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyListPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyListPolicyGetArgs $;

        public Builder() {
            $ = new OrganizationPolicyListPolicyGetArgs();
        }

        public Builder(OrganizationPolicyListPolicyGetArgs defaults) {
            $ = new OrganizationPolicyListPolicyGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder allow(@Nullable Output<OrganizationPolicyListPolicyAllowGetArgs> allow) {
            $.allow = allow;
            return this;
        }

        public Builder allow(OrganizationPolicyListPolicyAllowGetArgs allow) {
            return allow(Output.of(allow));
        }

        public Builder deny(@Nullable Output<OrganizationPolicyListPolicyDenyGetArgs> deny) {
            $.deny = deny;
            return this;
        }

        public Builder deny(OrganizationPolicyListPolicyDenyGetArgs deny) {
            return deny(Output.of(deny));
        }

        public Builder inheritFromParent(@Nullable Output<Boolean> inheritFromParent) {
            $.inheritFromParent = inheritFromParent;
            return this;
        }

        public Builder inheritFromParent(Boolean inheritFromParent) {
            return inheritFromParent(Output.of(inheritFromParent));
        }

        public Builder suggestedValue(@Nullable Output<String> suggestedValue) {
            $.suggestedValue = suggestedValue;
            return this;
        }

        public Builder suggestedValue(String suggestedValue) {
            return suggestedValue(Output.of(suggestedValue));
        }

        public OrganizationPolicyListPolicyGetArgs build() {
            return $;
        }
    }

}
