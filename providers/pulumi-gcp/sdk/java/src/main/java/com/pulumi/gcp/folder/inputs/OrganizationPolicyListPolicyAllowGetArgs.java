// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.folder.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OrganizationPolicyListPolicyAllowGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final OrganizationPolicyListPolicyAllowGetArgs Empty = new OrganizationPolicyListPolicyAllowGetArgs();

    /**
     * The policy allows or denies all values.
     * 
     */
    @Import(name="all")
    private @Nullable Output<Boolean> all;

    public Optional<Output<Boolean>> all() {
        return Optional.ofNullable(this.all);
    }

    /**
     * The policy can define specific values that are allowed or denied.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private OrganizationPolicyListPolicyAllowGetArgs() {}

    private OrganizationPolicyListPolicyAllowGetArgs(OrganizationPolicyListPolicyAllowGetArgs $) {
        this.all = $.all;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationPolicyListPolicyAllowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationPolicyListPolicyAllowGetArgs $;

        public Builder() {
            $ = new OrganizationPolicyListPolicyAllowGetArgs();
        }

        public Builder(OrganizationPolicyListPolicyAllowGetArgs defaults) {
            $ = new OrganizationPolicyListPolicyAllowGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder all(@Nullable Output<Boolean> all) {
            $.all = all;
            return this;
        }

        public Builder all(Boolean all) {
            return all(Output.of(all));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public OrganizationPolicyListPolicyAllowGetArgs build() {
            return $;
        }
    }

}
