// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetVpcEndpointFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetVpcEndpointFilter Empty = new GetVpcEndpointFilter();

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeVpcEndpoints.html).
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given field.
     * A VPC Endpoint will be selected if any one of the given values matches.
     * 
     */
    @Import(name="values", required=true)
    private List<String> values;

    public List<String> values() {
        return this.values;
    }

    private GetVpcEndpointFilter() {}

    private GetVpcEndpointFilter(GetVpcEndpointFilter $) {
        this.name = $.name;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVpcEndpointFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVpcEndpointFilter $;

        public Builder() {
            $ = new GetVpcEndpointFilter();
        }

        public Builder(GetVpcEndpointFilter defaults) {
            $ = new GetVpcEndpointFilter(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder values(List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GetVpcEndpointFilter build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
