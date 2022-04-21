// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetRestApiEndpointConfiguration extends com.pulumi.resources.InvokeArgs {

    public static final GetRestApiEndpointConfiguration Empty = new GetRestApiEndpointConfiguration();

    @Import(name="types", required=true)
    private List<String> types;

    public List<String> types() {
        return this.types;
    }

    @Import(name="vpcEndpointIds", required=true)
    private List<String> vpcEndpointIds;

    public List<String> vpcEndpointIds() {
        return this.vpcEndpointIds;
    }

    private GetRestApiEndpointConfiguration() {}

    private GetRestApiEndpointConfiguration(GetRestApiEndpointConfiguration $) {
        this.types = $.types;
        this.vpcEndpointIds = $.vpcEndpointIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRestApiEndpointConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRestApiEndpointConfiguration $;

        public Builder() {
            $ = new GetRestApiEndpointConfiguration();
        }

        public Builder(GetRestApiEndpointConfiguration defaults) {
            $ = new GetRestApiEndpointConfiguration(Objects.requireNonNull(defaults));
        }

        public Builder types(List<String> types) {
            $.types = types;
            return this;
        }

        public Builder types(String... types) {
            return types(List.of(types));
        }

        public Builder vpcEndpointIds(List<String> vpcEndpointIds) {
            $.vpcEndpointIds = vpcEndpointIds;
            return this;
        }

        public Builder vpcEndpointIds(String... vpcEndpointIds) {
            return vpcEndpointIds(List.of(vpcEndpointIds));
        }

        public GetRestApiEndpointConfiguration build() {
            $.types = Objects.requireNonNull($.types, "expected parameter 'types' to be non-null");
            $.vpcEndpointIds = Objects.requireNonNull($.vpcEndpointIds, "expected parameter 'vpcEndpointIds' to be non-null");
            return $;
        }
    }

}
