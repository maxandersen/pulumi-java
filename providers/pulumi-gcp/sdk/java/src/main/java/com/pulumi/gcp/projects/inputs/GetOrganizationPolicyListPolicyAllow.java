// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.projects.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetOrganizationPolicyListPolicyAllow extends com.pulumi.resources.InvokeArgs {

    public static final GetOrganizationPolicyListPolicyAllow Empty = new GetOrganizationPolicyListPolicyAllow();

    @Import(name="all", required=true)
    private Boolean all;

    public Boolean all() {
        return this.all;
    }

    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetOrganizationPolicyListPolicyAllow() {}

    private GetOrganizationPolicyListPolicyAllow(GetOrganizationPolicyListPolicyAllow $) {
        this.all = $.all;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetOrganizationPolicyListPolicyAllow defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetOrganizationPolicyListPolicyAllow $;

        public Builder() {
            $ = new GetOrganizationPolicyListPolicyAllow();
        }

        public Builder(GetOrganizationPolicyListPolicyAllow defaults) {
            $ = new GetOrganizationPolicyListPolicyAllow(Objects.requireNonNull(defaults));
        }

        public Builder all(Boolean all) {
            $.all = all;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetOrganizationPolicyListPolicyAllow build() {
            $.all = Objects.requireNonNull($.all, "expected parameter 'all' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
